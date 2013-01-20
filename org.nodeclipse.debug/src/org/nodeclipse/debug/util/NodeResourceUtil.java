package org.nodeclipse.debug.util;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;

public class NodeResourceUtil {
	private static Map<IResource, IResource> resourceMap = null;

	static {
		initialize();
	}

	public static void initialize() {
		resourceMap = new HashMap<IResource, IResource>();
	}

	public static void register(String path, IResource res2) {
		if(path == null || res2 == null) {
			return;
		}
		IFile[] iFile = ResourcesPlugin.getWorkspace().getRoot()
				.findFilesForLocation(Path.fromOSString(path));
		if (iFile.length >= 1) {
			register(iFile[0], res2);
		}
	}

	public static void register(IResource res1, IResource res2) {
		if(res1 == null || res2 == null) {
			return;
		}
		if (!resourceMap.containsKey(res1)) {
			resourceMap.put(res1, res2);
		}
		if (!resourceMap.containsKey(res2)) {
			resourceMap.put(res2, res1);
		}
	}

	public static IResource get(IResource res) {
		return resourceMap.get(res);
	}
}
