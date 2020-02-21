package stepdefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition {
	
	

	    @Given("^admin in the loginpage$")
	    public void admin_in_the_loginpage() throws Throwable {
	    	
	    	System.out.println("athira");
	        
	    }

	    @When("^ensure that Admin cannot login with valid username and  valid password$")
	    public void ensure_that_admin_cannot_login_with_valid_username_and_valid_password() throws Throwable {
	    	
	    	System.out.println("athira1");
	       
	    }

	    @Then("^admin login  in to the homepage$")
	    public void admin_login_in_to_the_homepage() throws Throwable {
	    	
	    	System.out.println("athira2");
	    }

	}


