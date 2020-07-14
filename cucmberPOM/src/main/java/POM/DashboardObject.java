package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.Testbase;

public class DashboardObject extends Testbase {

	
	static By setup = By.xpath("//li[@id='menu_setup']//a");
	static By outlets = By.xpath("//a[contains(text(),'Outlets')]");
	static By add_outlets = By.xpath("//a[@id='add_new_branch']");
	
	public static WebElement setup() {
		return FindElement(setup);
	}
	
	public static WebElement Outlets() {
		return FindElement(outlets);
	}
	
	public static WebElement AddOutlets() {
		return FindElement(add_outlets);
	}
}
