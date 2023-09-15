package com.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPageLocators {
	@FindBy(xpath = "//input[@id=\"gender-male\"]")
	public WebElement genderclick;
	
	@FindBy(xpath = "//input[@id=\"FirstName\"]")
	public WebElement firstname;
	
	@FindBy(xpath = "//input[@id=\"LastName\"]")
	public WebElement lastname;
	
	@FindBy(xpath = "//input[@id=\"Email\"]")
	public WebElement regemail;
	
	@FindBy(xpath = "//input[@id=\"Password\"]")
	public WebElement regpassword;
	
	@FindBy(xpath = "//input[@id=\"ConfirmPassword\"]")
	public WebElement confirmregpassword;
	
	@FindBy(xpath = "//input[@id=\"register-button\"]")
	public WebElement registerbutton;
	
	
	
}