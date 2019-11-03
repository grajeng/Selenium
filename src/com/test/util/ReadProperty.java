package com.test.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperty {

	private static ReadProperty instance = null; 
	  
    Properties prop = new Properties(); 
	InputStream inputStream;
    // private constructor restricted to this class itself 
    private ReadProperty() throws IOException 
    { 
    	
    	inputStream = getClass().getClassLoader().getResourceAsStream("selenium.properties");
    	 
		if (inputStream != null) {
			prop.load(inputStream);
		} else {
			//throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
		}
    } 
  
    // static method to create instance of Singleton class 
    public static ReadProperty getInstance() throws IOException 
    { 
        if (instance == null) 
        	instance = new ReadProperty(); 
  
        return instance; 
    } 
    
    public String getValue(String key) {
    	
    	return prop.getProperty(key);
    }
}
