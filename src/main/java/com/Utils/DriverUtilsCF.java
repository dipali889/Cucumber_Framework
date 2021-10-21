package com.Utils;

import org.openqa.selenium.WebDriver;

public class DriverUtilsCF {

	public static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver ldriver) {
		driver = ldriver;
	}
}


