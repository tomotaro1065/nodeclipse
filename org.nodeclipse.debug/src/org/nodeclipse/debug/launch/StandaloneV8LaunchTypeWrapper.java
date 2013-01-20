package org.nodeclipse.debug.launch;

import org.chromium.debug.core.model.DebugTargetImpl;
import org.chromium.debug.core.model.JavascriptVmEmbedder;
import org.chromium.debug.core.model.LaunchParams;
import org.chromium.debug.core.model.SourceWrapSupport;
import org.chromium.debug.core.model.WorkspaceBridge;
import org.chromium.debug.ui.launcher.PluginVariablesUtil;
import org.chromium.debug.ui.launcher.StandaloneV8LaunchType;
import org.chromium.sdk.util.Destructable;
import org.chromium.sdk.util.DestructingGuard;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.nodeclipse.debug.model.VProjectWorkspaceBridge;

public class StandaloneV8LaunchTypeWrapper extends StandaloneV8LaunchType {
	public void launch(ILaunchConfiguration config, String mode,
			final ILaunch launch, IProgressMonitor monitor)
			throws CoreException {
		if (!mode.equals(ILaunchManager.DEBUG_MODE)) {
			// Chromium JavaScript launch is only supported for debugging.
			return;
		}

		String host = config.getAttribute(LaunchParams.CHROMIUM_DEBUG_HOST,
				PluginVariablesUtil.getValue(PluginVariablesUtil.DEFAULT_HOST));

		int port = config.getAttribute(LaunchParams.CHROMIUM_DEBUG_PORT,
				PluginVariablesUtil
						.getValueAsInt(PluginVariablesUtil.DEFAULT_PORT));

		if (host == null && port == -1) {
			throw new RuntimeException("Missing parameters in launch config");
		}

		boolean addNetworkConsole = config.getAttribute(
				LaunchParams.ADD_NETWORK_CONSOLE, false);

		SourceWrapSupport sourceWrapSupport = createSourceWrapSupportFromConfig(config);

		JavascriptVmEmbedder.ConnectionToRemote remoteServer = createConnectionToRemote(
				host, port, launch, addNetworkConsole);
		try {

			final String projectNameBase = config.getName();
		    final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectNameBase);
		    if (project.exists()) {
		    	project.delete(true, null);
		    }

			DestructingGuard destructingGuard = new DestructingGuard();
			try {
				Destructable lauchDestructor = new Destructable() {
					public void destruct() {
						if (!launch.hasChildren()) {
							DebugPlugin.getDefault().getLaunchManager()
									.removeLaunch(launch);
						}
					}
				};

				destructingGuard.addValue(lauchDestructor);

				WorkspaceBridge.Factory bridgeFactory = new VProjectWorkspaceBridge.FactoryImpl(
						projectNameBase);

				final DebugTargetImpl target = new DebugTargetImpl(launch,
						bridgeFactory, sourceWrapSupport,
						getPresetSyncDirection());

				Destructable targetDestructor = new Destructable() {
					public void destruct() {
						terminateTarget(target);
					}
				};
				destructingGuard.addValue(targetDestructor);

				launch.addDebugTarget(target);

				boolean attached = DebugTargetImpl
						.attach(target, remoteServer, destructingGuard,
								OPENING_VIEW_ATTACH_CALLBACK, monitor);
				if (!attached) {
					// Cancel pressed.
					return;
				}

				launch.addDebugTarget(target);
				monitor.done();

				// All OK
				destructingGuard.discharge();
			} finally {
				destructingGuard.doFinally();
			}

		} finally {
			remoteServer.disposeConnection();
		}
	}
}
