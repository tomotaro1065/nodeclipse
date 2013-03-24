package org.nodeclipse.debug.launch;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.debug.ui.StringVariableSelectionDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.TraverseListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.nodeclipse.debug.util.Constants;

public class NodeArgumentsTab  extends AbstractLaunchConfigurationTab {
	protected Label fPrgmArgumentsLabel;
	protected Text fPrgmArgumentsText;

	// Node arguments widgets
	protected Label fNodeArgumentsLabel;
	protected Text fNodeArgumentsText;

	@Override
	public void createControl(Composite parent) {
		Font font = parent.getFont();
		Composite comp = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout(1, true);
		comp.setLayout(layout);
		comp.setFont(font);
		
		GridData gd = new GridData(GridData.FILL_BOTH);
		comp.setLayoutData(gd);
		setControl(comp);
		//setHelpContextId();
		
		Group group = new Group(comp, SWT.NONE);
		group.setFont(font);
		layout = new GridLayout();
		group.setLayout(layout);
		group.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		group.setText("Program Arguments");
		
		fPrgmArgumentsText = new Text(group, SWT.MULTI | SWT.WRAP | SWT.BORDER | SWT.V_SCROLL);
		fPrgmArgumentsText.addTraverseListener(new TraverseListener() {
			public void keyTraversed(TraverseEvent e) {
				switch (e.detail) {
					case SWT.TRAVERSE_ESCAPE:
					case SWT.TRAVERSE_PAGE_NEXT:
					case SWT.TRAVERSE_PAGE_PREVIOUS:
						e.doit = true;
						break;
					case SWT.TRAVERSE_RETURN:
					case SWT.TRAVERSE_TAB_NEXT:
					case SWT.TRAVERSE_TAB_PREVIOUS:
						if ((fPrgmArgumentsText.getStyle() & SWT.SINGLE) != 0) {
							e.doit = true;
						} else {
							if (!fPrgmArgumentsText.isEnabled() || (e.stateMask & SWT.MODIFIER_MASK) != 0) {
								e.doit = true;
							}
						}
						break;
				}
			}
		});
		gd = new GridData(GridData.FILL_BOTH);
		gd.heightHint = 40;
		gd.widthHint = 100;
		fPrgmArgumentsText.setLayoutData(gd);
		fPrgmArgumentsText.setFont(font);
		fPrgmArgumentsText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent evt) {
				scheduleUpdateJob();
			}
		});
		//ControlAccessibleListener.addListener(fPrgmArgumentsText, group.getText());
		
		String buttonLabel = "Variables...";  
		Button pgrmArgVariableButton = createPushButton(group, buttonLabel, null); 
		pgrmArgVariableButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
		pgrmArgVariableButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				StringVariableSelectionDialog dialog = new StringVariableSelectionDialog(getShell());
				dialog.open();
				String variable = dialog.getVariableExpression();
				if (variable != null) {
                    fPrgmArgumentsText.insert(variable);
				}
			}
		});
		
		Group groupNode = new Group(comp, SWT.NONE);
		groupNode.setFont(font);
		groupNode.setLayout(new GridLayout());
		groupNode.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		groupNode.setText("Node Arguments");
		
		fNodeArgumentsText = new Text(groupNode, SWT.MULTI | SWT.WRAP | SWT.BORDER | SWT.V_SCROLL);
		fNodeArgumentsText.addTraverseListener(new TraverseListener() {
			public void keyTraversed(TraverseEvent e) {
				switch (e.detail) {
					case SWT.TRAVERSE_ESCAPE:
					case SWT.TRAVERSE_PAGE_NEXT:
					case SWT.TRAVERSE_PAGE_PREVIOUS:
						e.doit = true;
						break;
					case SWT.TRAVERSE_RETURN:
					case SWT.TRAVERSE_TAB_NEXT:
					case SWT.TRAVERSE_TAB_PREVIOUS:
						if ((fPrgmArgumentsText.getStyle() & SWT.SINGLE) != 0) {
							e.doit = true;
						} else {
							if (!fPrgmArgumentsText.isEnabled() || (e.stateMask & SWT.MODIFIER_MASK) != 0) {
								e.doit = true;
							}
						}
						break;
				}
			}
		});
		GridData gd2 = new GridData(GridData.FILL_BOTH);
		gd2.heightHint = 40;
		gd2.widthHint = 100;
		fNodeArgumentsText.setLayoutData(gd2);
		fNodeArgumentsText.setFont(font);
		fNodeArgumentsText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent evt) {
				scheduleUpdateJob();
			}
		});
		//ControlAccessibleListener.addListener(fPrgmArgumentsText, group.getText());
		
		String buttonLabel2 = "Variables...";  
		Button pgrmArgVariableButton2 = createPushButton(groupNode, buttonLabel2, null); 
		pgrmArgVariableButton2.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
		pgrmArgVariableButton2.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				StringVariableSelectionDialog dialog = new StringVariableSelectionDialog(getShell());
				dialog.open();
				String variable = dialog.getVariableExpression();
				if (variable != null) {
                    fNodeArgumentsText.insert(variable);
				}
			}
		});
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			fPrgmArgumentsText.setText((String)configuration.getAttribute(Constants.ATTR_PROGRAM_ARGUMENTS, ""));
			fNodeArgumentsText.setText((String)configuration.getAttribute(Constants.ATTR_NODE_ARGUMENTS, ""));
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(Constants.ATTR_PROGRAM_ARGUMENTS, getAttributeValueFrom(fPrgmArgumentsText));
		configuration.setAttribute(Constants.ATTR_NODE_ARGUMENTS, getAttributeValueFrom(fNodeArgumentsText));
	}

	@Override
	public String getName() {
		return "Arguments";
	}

	/**
	 * Returns the string in the text widget, or <code>null</code> if empty.
	 * 
	 * @return text or <code>null</code>
	 */
	protected String getAttributeValueFrom(Text text) {
		String content = text.getText().trim();
		if (content.length() > 0) {
			return content;
		}
		return null;
	}
}
