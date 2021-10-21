package com.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtilsCF {

static Properties prop;
	
	public static String getProperties(String Key) {
		
		 prop= new Properties();
		 
		try {
			prop.load(new FileInputStream("D:\\Drivers\\dipsha\\ZaxxonCucumber\\src\\test\\java\\com\\testBase\\GlobalProperties.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop.getProperty(Key);
		
	}
	}


