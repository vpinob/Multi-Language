package appPackage.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.MissingResourceException;
import java.util.Properties;
import java.util.ResourceBundle;

public class Messages 
{
	private static String BUNDLE_NAME = getLanguageProperties();
        
	@SuppressWarnings("StaticNonFinalUsedInInitialization")
	private static ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

	public static String getBUNDLE_NAME() {
		return BUNDLE_NAME;
	}

	public static void setBUNDLE_NAME(String bUNDLE_NAME) {
		BUNDLE_NAME = bUNDLE_NAME;
	}

	public static ResourceBundle getRESOURCE_BUNDLE() {
		return RESOURCE_BUNDLE;
	}

	public static void setRESOURCE_BUNDLE(ResourceBundle rESOURCE_BUNDLE) {
		RESOURCE_BUNDLE = rESOURCE_BUNDLE;
	}
	
	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
	
        
	@SuppressWarnings("CallToPrintStackTrace")
	private static String getLanguageProperties() {

		Properties prop = new Properties();
		InputStream input = null;
		String language = null;
		try {

			input = new FileInputStream("language.properties");
			prop.load(input);
			language = prop.getProperty("language");

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return language;
	}
	
	public static void changeLanguage(String language, String country) {

			Properties propertie = new Properties();
			OutputStream outputStream = null;

			try {

				outputStream = new FileOutputStream("language.properties");
		propertie.setProperty("language", "appPackage.properties.Messages_"+language+"_"+country);
			propertie.store(outputStream, null);

		} 
		catch (IOException io) { io.printStackTrace(); } 
		finally {
			if (outputStream != null) {
				try { outputStream.close(); } 
				catch (IOException e) { e.printStackTrace(); }
			}
		}
	}
}
