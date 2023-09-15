package com.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisteredPageLocator {

	@FindBy(xpath="//div[@class=\"result\"]")
	public WebElement RegisterSuccesssText;
}
