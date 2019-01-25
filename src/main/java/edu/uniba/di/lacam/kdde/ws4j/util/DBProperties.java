/**
 * 
 */
package edu.uniba.di.lacam.kdde.ws4j.util;

import java.io.InputStream;
import java.util.Properties;
/**
 * @author Anurag
 *
 */
public class DBProperties {
 	static Properties configProperties;
	static {
		InputStream inputStream = DBProperties.class.getClassLoader().getResourceAsStream("db.properties");
		try {
			configProperties = new Properties();
			configProperties.load(inputStream);
		} catch (Exception e) {
 			e.printStackTrace();
		}
	}

	public static String getProperty(String key) {
		return (String) configProperties.get(key);
	}
}
