package TC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.model.Test;

import POM.LoginPage;
import Utils.Testbase;

public class DashboardFunction extends Testbase {

	
	public static void clickBookRoom() {
		
		
		LoginPage.bookARoom().click();
	}
	
	public static void title() {
		
		boolean roomBooking_title = FindElement(By.xpath("//div[@class='main_title']")).isDisplayed();
		if(roomBooking_title) {
			System.out.println("Is displaying");
		}
	}
	
	
	public static void Entering_room_details() throws InterruptedException {
		
		LoginPage.MeetingName().sendKeys("Hack day Discussion");
		wait(1000);
		LoginPage.Date().click();
		wait(1000);
		LoginPage.DateSelection().click();
//		LoginPage.okButton().click();
		
		wait(1000);
		//Selecting the start time
				LoginPage.StartTime().click();
//				wait(1000);
				LoginPage.SelectStartTime().click();
				wait(1000);
				LoginPage.okButtonStart().click();
				
				//Selecting the start time
				LoginPage.EndTime().click();
				wait(1000);
				LoginPage.SelectEndTime().click();
				wait(1000);
				LoginPage.okButtonStart();
				
				
				
//				selectFromDropDown(LoginPage.meetingType(), "2");
				
				LoginPage.noOfAttendees().sendKeys("07");
				
				selectFromDropDown(LoginPage.meetingRoom(), "Oval");
				
//				LoginPage.memberId().sendKeys("rajesh ganessan");
	}
	
	
	public static void Clicking_BookRoom() {
		
		//Clicking Book a room buttom
		
		LoginPage.BookRoom().click();
	}
}
