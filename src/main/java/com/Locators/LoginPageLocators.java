package com.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
	
	
	@FindBy(name = "Email")
	public WebElement loginemail;
	
	@FindBy(name = "Password")
	public WebElement loginpassword;
	
	@FindBy(xpath = "//input[@class='button-1 login-button' and @type='submit' and @value='Log in']")
	public WebElement loginclick;
	
}
