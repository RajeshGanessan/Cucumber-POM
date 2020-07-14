package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.Testbase;

public class LoginPage extends Testbase{

	static By email = By.xpath("//input[@id='email']");
	static By password = By.xpath("//input[@id='password']");
	static By login_button = By.xpath("//button[@id='sign_in_button']");
	static By bookARoom = By.xpath("//button[@class='btn btn-default title_button']");
	static By meetingName = By.xpath("//form[@class='form_section']//div[2]//div[2]//input[1]");
	static By Date = By.xpath("//form[@class='form_section']//div[3]//div[2]//div[1]//input[1]");
	static By dateSelection = By.xpath("//span[contains(text(),'21')]");
	static By okButton= By.xpath("//div[contains(text(),'Ok')]");
	static By startTime = By.xpath("//form[@class='form_section']//div[4]//div[2]//div[1]//input[1]");
	static By endTime = By.xpath("//form[@class='form_section']//div[5]//div[2]//div[1]//input[1]");
	static By selectStartTime = By.xpath("//div[contains(text(),'07')]");
	static By selectEndTime = By.xpath("//div[contains(text(),'08')]");
	static By okbuttonStart= By.xpath("//div[contains(text(),'Ok')]");
	static By meetingType = By.xpath("//form[@class='form_section']//div[6]//div[2]//select[1]");
	static By noOfAttendees = By.xpath("//form[@class='form_section']//div[7]//div[2]//input[1]");
	static By meetingRoom = By.xpath("//form[@class='form_section']//div[8]//div[2]//select[1]");
	static By memberId = By.xpath("//form[@class='form_section']//div[9]//div[2]//input[1]");
	static By bookRoom = By.xpath("//button[@type='submit']");
	//email
	public static WebElement email() {
		return FindElement(email);
	}
	
	//password
	public static WebElement password() {
		return FindElement(password);
	}

	//login button 
	public static WebElement loginButton() {
		return FindElement(login_button);
	}

	public static WebElement bookARoom() {
		return FindElement(bookARoom);
	}
	
	public static WebElement MeetingName() {
		return FindElement(meetingName);
	}
	
	public static WebElement Date() {
		return FindElement(Date);
	}
	
	public static WebElement DateSelection() {
		return FindElement(dateSelection);
	}
	
	public static WebElement okButton() {
		return FindElement(okButton);
	}
	
	public static WebElement StartTime() {
		return FindElement(startTime);
	}
	
	public static WebElement EndTime() {
		return FindElement(endTime);
	}
	
	public static WebElement SelectStartTime() {
		return FindElement(selectStartTime);
	}
	
	public static WebElement SelectEndTime() {
		return FindElement(selectEndTime);
	}
	
	public static WebElement okButtonStart() {
		return FindElement(okbuttonStart);
	}
	
	public static WebElement meetingType() {
		return FindElement(meetingType);
	}
	
	public static WebElement noOfAttendees() {
		return FindElement(noOfAttendees);
	}
	
	public static WebElement meetingRoom() {
		return FindElement(meetingRoom);
	}
	
	public static WebElement memberId() {
		return FindElement(memberId);
	}
	
	public static WebElement BookRoom() {
		return FindElement(bookRoom);
	}
	
}
