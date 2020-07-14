package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import TC.DashboardFunction;
import TC.LoginFunction;
import TC.MainFunction;
import Utils.Testbase;
import cucumber.api.cli.Main;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class DashBoardSteps extends Testbase {

	@Given("^user is in dashboard$")
	public void user_is_in_dashboard() throws Throwable {
		
		String Hometitle = driver.getTitle();
		Assert.assertEquals(" Overview ", Hometitle);
	}
	
	@Then("^user clicks on setup$")
	public void user_clicks_on_setup() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
			
	}

	@Then("^user clicks on outlets$")
	public void user_clicks_on_outlets() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    MainFunction.ClickOutlets();
	}

	@Then("^outlets page should be displayed$")
	public void outlets_page_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    MainFunction.Addoutlets();
	}

	
	
}
