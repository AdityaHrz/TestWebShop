package com.register.stepDefinition;

import org.testng.Assert;

import com.Actions.RegisterPageActions;
import com.assessment.utils.HelperUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class registerStepDefination {
	RegisterPageActions objRegister=new RegisterPageActions();
	
	@Given("user opens the URL {string}")
	public void user_opens_the_url(String URL) {
	    // Write code here that turns the phrase above into concrete actions
		HelperUtils.openPage(URL);
	}

	@When("user provides valid registration data")
	public void user_provides_valid_registration_data() {
	    // Write code here that turns the phrase above into concrete actions
		objRegister.Register();
	}

	@Then("user should be registered successfully")
	public void user_should_be_registered_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(objRegister.getHomePageText(),"Your registration completed");
	}
}
