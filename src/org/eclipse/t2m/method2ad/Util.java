package org.eclipse.mde.engineering;

import java.util.UUID;

public final class Util {

	public static String generateId() {
		return UUID.randomUUID().toString().replaceAll("-", "_");
	}

}
