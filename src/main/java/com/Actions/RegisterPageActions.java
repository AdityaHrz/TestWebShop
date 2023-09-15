package com.Actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.Locators.RegisterPageLocators;
import com.assessment.utils.HelperUtils;

public class RegisterPageActions {
	RegisterPageLocators objRegisterPage;
	String strfname,strLname,strEmail,strPassword,strconfPassword;
	public RegisterPageActions()
	{
		this.objRegisterPage=new RegisterPageLocators();
		PageFactory.initElements(HelperUtils.getDriver(), objRegisterPage);	
	}
	
	//set FirstName in textbox
	   public void setfname(String strfame)
	    {
		    objRegisterPage.firstname.sendKeys(strfame);
	    }

	//set LastName in textbox
	   public void setlname(String strlame)
	    {
		    objRegisterPage.lastname.sendKeys(strlame);
	    }

	 //set Email in textbox
	   public void setemail(String email)
	    {
		    objRegisterPage.regemail.sendKeys(email);
	    }

	   //set password in textbox
	   public void setpassword(String password)

	    {
		    objRegisterPage.regpassword.sendKeys(password);
	    }
		
	   //set Confirm password in textbox
	   public void setConfpassword(String confpassword)
	    {
		    objRegisterPage.confirmregpassword.sendKeys(confpassword);
	    }
		
     //click on login page
		public void clickRegister()
		{

			objRegisterPage.registerbutton.click();
		}

		 //click on login page
		public void clickGender()
		{
			objRegisterPage.genderclick.click();
		}

		//get the username frome home page
		public String getHomePageText()
		{
			return objRegisterPage.RegisterSuccesssText.getText();
		}

		public void Register()
		{
			File file=new File("C:\\Users\\aghorpade\\Documents\\GitHub\\TestWebShop\\src\\test\\resources\\features\\RegisterData.properties");
			FileInputStream fileInput=null;
			try
			{
				fileInput=new FileInputStream(file);
			}
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}

			//creating object of properties file
			Properties prop=new Properties();
			try
			{
				prop.load(fileInput);
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			strfname=prop.getProperty("firstName");
			strLname=prop.getProperty("lastName");
			strEmail=prop.getProperty("email");
			strPassword=prop.getProperty("password");
			strconfPassword=prop.getProperty("confPassword");

			//click on Gender
			this.clickGender();

			//Fill first name
			this.setfname(strfname);


			//Fill last name
			this.setlname(strLname);

			//fill email
			this.setemail(strEmail);

			//fill password
			this.setpassword(strPassword);

			//fill confirm password
			this.setConfpassword(strconfPassword);

			//click on Register
			this.clickRegister();

		}

}