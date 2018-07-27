package com.accenture.cucumbertest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import junit.framework.TestCase;


@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\git_lip\\MyFramework\\src\\test\\java\\com\\accenture\\cucumbertest\\login.feature")

public class RunnerClass extends TestCase {
	@Given("^I am on login page$")
	public void i_am_on_login_page() throws Throwable {
		System.out.println("Hello Given");
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I give tomsmith and SuperSecretPassword!$")
	public void i_give_tomsmith_and_SuperSecretPassword() throws Throwable {
		System.out.println("Hello When");
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should be login$")
	public void i_should_be_login() throws Throwable {
		System.out.println("Hello Then");
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	

}
