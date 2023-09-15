package com.login.stepDefinition;

import com.assessment.utils.HelperUtils;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksLogin {
	@Before

	public void before() {

		HelperUtils.setDriver();

	}

	@After

	public void after() {

		HelperUtils.tearDown();

	}

}