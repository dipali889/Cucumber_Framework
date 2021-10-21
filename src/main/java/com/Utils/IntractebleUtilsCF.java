package com.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;


public class IntractebleUtilsCF {

static WebDriver driver;
	
	public static void setup() {
	
		String browsername = PropertiesUtilsCF.getProperties("driverName");
		switch(browsername.trim().toUpperCase()) {
		
		case"CHROME":{
			System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\dipsha\\ZaxxonCucumber\\Drivers\\chromedriver.exe");
			DriverUtilsCF.setDriver(new ChromeDriver());
			break;
		}
		
		case"FIREFOX":{
			System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\dipsha\\ZaxxonCucumber\\Drivers\\geckodriver.exe");
			DriverUtilsCF.setDriver(new FirefoxDriver());
			break;
		}

		case"ie":{
			System.setProperty("webdriver.ie.driver", "D:\\Drivers\\dipsha\\ZaxxonCucumber\\Drivers\\IEDriverServer.exe");
			DriverUtilsCF.setDriver(new FirefoxDriver());
			break;
		}
		default :{
			System.out.println("No matching case found");
			Assert.fail();
			
		   
		//DriverUtilsCF.getDriver().manage().window().maximize();  //for avoided in any case put out side the default  
		//DriverUtilsCF.getDriver().get(PropertiesUtilsCF.getProperties("url"));
		//DriverUtilsCF.getDriver().getTitle();
		
		}
		}}
		
	public static void getURL() {
		DriverUtilsCF.getDriver().get(PropertiesUtilsCF.getProperties("url"));
    }
	
	public static String getTitle() {
		return DriverUtilsCF.getDriver().getTitle();
		
	}
	
	 public static void tearDown() {
	  //DriverUtilsCF.getDriver().quit();
		 DriverUtilsCF.getDriver().quit();
	}

	
	
	}

	
	
	
	
