package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	static WebDriver driver;
	

	 
	 
	@FindBy(xpath = "//h1")
	public WebElement pageTitletxt;
	

	@FindBy(xpath = "//strong")
	public WebElement title;

	@FindBy(xpath = "//label[@for='Email']")
	public WebElement emaillabel;
	
	@FindBy(id ="Email")
	public WebElement useridfield;
	
	@FindBy(xpath = "//label[@for='//label[@for='Password']']")
	public WebElement passlabel;
	
	@FindBy(id="Password")
	public WebElement passwordfield;
	
	@FindBy(id="RememberMe")
	public WebElement rememberMecheckbox;
	
	@FindBy(xpath ="//button[text()='Log in']")
	public WebElement loginButton;
	
	@FindBy(xpath = "//p[contains (text() , 'Catalog')][1]")
	public WebElement Dashboard;
	
	@FindBy(xpath = " //p[contains(text(),' Products')]")
	public WebElement products;
	
	@FindBy(id= "SearchProductName")
	public WebElement productName;
	
	@FindBy(id ="SearchCategoryId")
	public WebElement categoryId;

	@FindBy(xpath = "//input[@class='check-box']")
	public WebElement checkbox;
	
	@FindBy(id = "SearchManufacturerId")
	public WebElement ManufacturerId;
	
	@FindBy(id = "SearchVendorId")
	public WebElement VendorId;
	
	@FindBy(id = "SearchWarehouseId")
	public WebElement WarehouseId;
	
	@FindBy(id = "SearchProductTypeId")
	public WebElement ProductTypeId;
	
	@FindBy(id = "SearchPublishedId")
	public WebElement PublishedId;
	
	@FindBy(id = "GoDirectlyToSku")
	public WebElement goDirectlyToSku; 
	
	@FindBy(xpath = "//button[@name='importexcel']")
	public WebElement importexcel;
	
	@FindBy(xpath = "//input[@class='form-control']")
	public WebElement ChooseFile;
	
	
	
	
	 


public Loginpage(WebDriver ldriver) {
	driver = ldriver;
	PageFactory.initElements(ldriver, this);

}

}


