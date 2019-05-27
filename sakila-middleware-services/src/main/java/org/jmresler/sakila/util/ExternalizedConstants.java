package org.jmresler.sakila.util;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public final class ExternalizedConstants {
	
	private static final String BUNDLE_NAME = "org.jmresler.sakila.util.externalized_constants"; //$NON-NLS-1$
	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

	private ExternalizedConstants() {
	}

	/**
	 * 
	 * @param key
	 * @return
	 */
	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
