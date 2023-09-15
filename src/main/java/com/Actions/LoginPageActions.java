package com.Actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.Locators.LoginPageLocators;
import com.assessment.utils.HelperUtils;

public class LoginPageActions {
	LoginPageLocators objloginPage;
	String strUserName,strPassword;
	public LoginPageActions()
	{
		this.objloginPage=new LoginPageLocators();
		PageFactory.initElements(HelperUtils.getDriver(), objloginPage);	
	}
	//set user in textbox

	   public void setUsername(String strUserName)
	    {
		    objloginPage.loginemail.sendKeys(strUserName);
	    }
	//set pass in textbox
		public void setPassword(String strPassword)
		{
			objloginPage.loginpassword.sendKeys(strPassword);
		}
    //click on login page
		public void clickLogin()
		{
			objloginPage.loginclick.click();
		}
		public void fileOpen() {
		File file=new File("src\\test\\resources\\Data1.properties");
		
		FileInputStream fileInput = null;
		try {
			fileInput =new FileInputStream(file);
		}catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fileInput);
		}catch (IOException e)
		{
			e.printStackTrace();
		}
		strUserName=prop.getProperty("username");
		strPassword=prop.getProperty("password");

		//Fill userName
		this.setUsername(strUserName);

		//Fill Password
		this.setPassword(strPassword);

		//click on login
		this.clickLogin();
		}
}

