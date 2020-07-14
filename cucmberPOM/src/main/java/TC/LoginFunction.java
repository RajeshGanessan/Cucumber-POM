package TC;

import org.junit.Assert;

import POM.LoginPage;
import Utils.Testbase;
import runner.testRunner;

public class LoginFunction extends Testbase{

	
	public static void Loggin_in() throws InterruptedException {
		
	String email = prop.getProperty("email");
	String password = prop.getProperty("password");
	
	//entering email 
	LoginPage.email().sendKeys(email);
	Thread.sleep(1000);
	
//	//entering password
	LoginPage.password().sendKeys(password);
	

	}
	
	public static void LoginButton() {
		
	//clicking login button
		LoginPage.loginButton().click();
	  
	}
	
	public static void homePage() {
		
		String homeTitle = driver.getTitle();
		
		Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software", homeTitle);
	}
	
	public static void getTitle() {
		
		String title = driver.getTitle();
		Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software", title);
		
	}
}
