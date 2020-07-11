/**
 * 
 */
package com.selenium.reusablecomponent;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author gslab
 *
 */
public class PropertyOperations {
	
	static Properties prop;
	
	public static String getProperty(String key) throws Exception {
		
		String propfilepath=System.getProperty("user.dir")+"/resources/config.properties";
		
		prop=new Properties();
		FileInputStream fis=new FileInputStream(propfilepath);
		prop.load(fis);
		String value=prop.get(key).toString();
		
		if(value.isEmpty()){
			throw new Exception("value is not specified for key: "+key+" in property file");
		}
		
		return value;
		
	}
}
