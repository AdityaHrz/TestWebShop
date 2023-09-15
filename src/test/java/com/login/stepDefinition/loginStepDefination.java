package com.login.stepDefinition;

import com.assessment.utils.HelperUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepDefination {
	
	@Given("User is on the {string} page")
	public void user_is_on_the_page(String URL) {
	    // Write code here that turns the phrase above into concrete actions
		HelperUtils.openPage(URL);
	}

	@When("User provides valid aditya1@gmail.com and Aditya@{int}")
	public void user_provides_valid_aditya1_gmail_com_and_aditya(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("User clicks the Login button")
	public void user_clicks_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("User should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("User provides valid aoccnc@gmail.com and hsbcdbchd")
	public void user_provides_valid_aoccnc_gmail_com_and_hsbcdbchd() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
