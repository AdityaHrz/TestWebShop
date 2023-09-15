package com.Actions;




import org.openqa.selenium.support.PageFactory;

import com.Locators.RegisteredPageLocator;
import com.assessment.utils.HelperUtils;


 

public class AfterRegisteredActions {

	

RegisteredPageLocator registeredPageLocator=null;

	

	

	

	//constructor

	public  AfterRegisteredActions() {

		this.registeredPageLocator=new RegisteredPageLocator();

		PageFactory.initElements(HelperUtils.getDriver(), registeredPageLocator);

		

	}

 

	

	//get username from homepage

	public String getHomePageText() {

		return registeredPageLocator.RegisterSuccesssText.getText();
	}

	

 

}
