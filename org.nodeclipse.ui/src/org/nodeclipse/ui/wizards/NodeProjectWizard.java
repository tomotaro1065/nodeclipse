package org.nodeclipse.ui.wizards;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URL;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IPerspectiveRegistry;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.IOverwriteQuery;
import org.eclipse.ui.ide.undo.CreateProjectOperation;
import org.eclipse.ui.ide.undo.WorkspaceUndoUtil;
import org.eclipse.ui.internal.WorkbenchPlugin;
import org.eclipse.ui.internal.registry.PerspectiveDescriptor;
import org.eclipse.ui.wizards.datatransfer.ImportOperation;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;
import org.nodeclipse.ui.Activator;
import org.nodeclipse.ui.nature.NodeNature;
import org.nodeclipse.ui.perspectives.NodePerspective;
import org.nodeclipse.ui.util.LogUtil;
import org.osgi.framework.Bundle;

@SuppressWarnings("restriction")
public class NodeProjectWizard extends Wizard implements INewWizard {

	private final String WINDOW_TITLE = "New Node Project";

	private IWorkbench workbench;
	private IStructuredSelection selection;
	private NodeProjectWizardPage mainPage;

	private IProject newProject;

	public NodeProjectWizard() {
		setWindowTitle(WINDOW_TITLE);
		setNeedsProgressMonitor(true);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
	}

	public IWorkbench getWorkbench() {
		return workbench;
	}

	@Override
	public void addPages() {
		mainPage = new NodeProjectWizardPage("NodeNewProjectPage") { //$NON-NLS-1$
			/*
			 * (non-Javadoc)
			 * 
			 * @see
			 * org.eclipse.ui.dialogs.WizardNewProjectCreationPage#createControl
			 * (org.eclipse.swt.widgets.Composite)
			 */
			public void createControl(Composite parent) {
				super.createControl(parent);
				createWorkingSetGroup(
						(Composite) getControl(),
						getSelection(),
						new String[] { "org.eclipse.ui.resourceWorkingSetPage" }); //$NON-NLS-1$
				Dialog.applyDialogFont(getControl());
			}
		};
		mainPage.setTitle("Create a Node Project");
		mainPage.setDescription("Create a new Node project.");
		addPage(mainPage);
	}

	protected IStructuredSelection getSelection() {
		return selection;
	}

	@Override
	public boolean performFinish() {
		createNewProject();
		if (newProject == null) {
			return false;
		}
		// add to workingsets
		IWorkingSet[] workingSets = mainPage.getSelectedWorkingSets();
		getWorkbench().getWorkingSetManager().addToWorkingSets(newProject,
				workingSets);

		updatePerspective();
		selectAndReveal();
		return true;
	}

	private void selectAndReveal() {
		BasicNewResourceWizard.selectAndReveal(newProject,
				workbench.getActiveWorkbenchWindow());
	}

	/**
	 * 更新视图,跳转到NodePerspective视图.
	 */
	private void updatePerspective() {
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		IPerspectiveRegistry reg = WorkbenchPlugin.getDefault()
				.getPerspectiveRegistry();
		PerspectiveDescriptor rtPerspectiveDesc = (PerspectiveDescriptor) reg
				.findPerspectiveWithId(NodePerspective.ID);
		// Now set it as the active perspective.
		if (window != null) {
			IWorkbenchPage page = window.getActivePage();
			page.setPerspective(rtPerspectiveDesc);
		}
	}

	private void createNewProject() {
		if (newProject != null) {
			return;
		}
		IProject newProjectHandle = mainPage.getProjectHandle();
		URI location = null;
		if (!mainPage.useDefaults()) {
			location = mainPage.getLocationURI();
		}

		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		final IProjectDescription description = workspace
				.newProjectDescription(newProjectHandle.getName());
		description.setLocationURI(location);
		String[] natures = description.getNatureIds();
		String[] newNatures = new String[natures.length + 1];
		System.arraycopy(natures, 0, newNatures, 0, natures.length);
		newNatures[natures.length] = NodeNature.NATURE_ID;
		description.setNatureIds(newNatures);

		IRunnableWithProgress op = new IRunnableWithProgress() {
			@Override
			public void run(IProgressMonitor monitor)
					throws InvocationTargetException, InterruptedException {
				CreateProjectOperation op = new CreateProjectOperation(
						description, WINDOW_TITLE);
				try {
					op.execute(monitor,
							WorkspaceUndoUtil.getUIInfoAdapter(getShell()));
				} catch (ExecutionException e) {
					throw new InvocationTargetException(e);
				}
			}
		};

		try {
			getContainer().run(true, true, op);
		} catch (InvocationTargetException e) {
			LogUtil.error(e);
		} catch (InterruptedException e) {
		}

		// TODO copy README.md & hello-world-server.js
		try {
			generateTemplates(newProjectHandle);
			rewriteReadme(newProjectHandle);
		} catch (CoreException e) {
			LogUtil.error(e);
		}

		newProject = newProjectHandle;
	}

	private void generateTemplates(IProject projectHandle) throws CoreException {
		Bundle bundle = Activator.getDefault().getBundle();
		if (bundle == null) {
			throw new CoreException(new Status(IStatus.ERROR,
					Activator.PLUGIN_ID, "bundle not found"));
		}
		try {
			URL location = FileLocator.toFileURL(bundle.getEntry("/"));
			File templateRoot = new File(location.getPath(), "templates");
			RelativityFileSystemStructureProvider structureProvider 
				= new RelativityFileSystemStructureProvider(templateRoot);
			ImportOperation operation = new ImportOperation(
					projectHandle.getFullPath(), templateRoot,
					structureProvider, new IOverwriteQuery() {
					    public String queryOverwrite(String pathString) {
							return ALL;
						}
					}, structureProvider.getChildren(templateRoot));

			operation.setContext(getShell());
			operation.run(null);
		} catch (Exception e) {
			throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getLocalizedMessage()));
		}
	}

	private void rewriteReadme(IProject projectHandle) throws CoreException {
		String newLine = System.getProperty("line.separator");
		IFile readme = projectHandle.getFile("README.md");
		if(!readme.exists()) {
			throw new CoreException(new Status(IStatus.ERROR,
					Activator.PLUGIN_ID, "RADME.md not found"));
		}
		InputStreamReader ir = new InputStreamReader(readme.getContents());
		BufferedReader br = new BufferedReader(ir);
		StringBuilder sb = new StringBuilder();
		String line;
		try {
			while((line = br.readLine()) != null) {
				if(line.contains("${projectname}")) {
					line = line.replace("${projectname}", projectHandle.getName());
				}
				sb.append(line);
				sb.append(newLine);
			}
			ByteArrayInputStream source = new ByteArrayInputStream(sb.toString().getBytes());
			readme.setContents(source, true, true, null);
		} catch (IOException e) {
			throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Cannot read README.md"));
		} finally {
			try {
				ir.close();
				br.close();
			} catch (IOException e) {
			}
			ir = null;
			br = null;
		}
	}

	@SuppressWarnings("unused")
	private static class CreateNodeProjectOperation extends
			WorkspaceModifyOperation {

		private String projectName;
		private IStatus result;
		private IProject project;

		public CreateNodeProjectOperation(String projectName) {
			this.projectName = projectName;
		}

		@Override
		protected void execute(IProgressMonitor monitor) throws CoreException,
				InvocationTargetException, InterruptedException {
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			IProject project = root.getProject(projectName);
			project.create(new NullProgressMonitor());
			project.open(new NullProgressMonitor());

			this.project = project;

			IProjectDescription description = project.getDescription();
			String[] natures = description.getNatureIds();
			String[] newNatures = new String[natures.length + 1];
			System.arraycopy(natures, 0, newNatures, 0, natures.length);
			newNatures[natures.length] = NodeNature.NATURE_ID;
			description.setNatureIds(newNatures);
			project.setDescription(description, null);

		}

	}

}
