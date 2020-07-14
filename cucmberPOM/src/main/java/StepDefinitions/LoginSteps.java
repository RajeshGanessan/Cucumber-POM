package StepDefinitions;

import org.junit.Assert;

import TC.LoginFunction;
import Utils.Testbase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginSteps extends Testbase{
	
	@Before
	public static void Login() {
		
		Testbase.Initialisation();
	}
	@Given("^user is in the Login page$")
	public void user_is_in_the_Login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String title = driver.getTitle();
		Assert.assertEquals("InEDGE - Sign In", title);
	}


	@Then("^user enters the email and password$")
	public void user_enters_the_email_and_password() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
			LoginFunction.Loggin_in();
			Login();
	}

	@Then("^Clicks on the login button$")
	public void clicks_on_the_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    LoginFunction.LoginButton();
	}

	@Then("^user should be on the homepage$")
	public void user_should_be_on_the_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String Hometitle = driver.getTitle();
		Assert.assertEquals("Dashboard", Hometitle);
	}


}
