package com.register.stepDefinition;

import com.assessment.utils.HelperUtils;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksRegister {
	@Before

	public void before() {

		HelperUtils.setDriver();

	}

	@After

	public void after() {

		HelperUtils.tearDown();

	}

}