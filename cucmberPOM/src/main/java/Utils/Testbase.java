package Utils;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Testbase  {

	
	public static WebDriver driver;
	public static Properties prop;
	
	public Testbase() {
		
		try {
			prop=new Properties();
			FileInputStream fis = new FileInputStream("D:\\work\\Practice-Projects\\cucmberPOM\\src\\main\\java\\Utils\\Config.properties");
			prop.load(fis);
		} 
		catch(Exception e) {
			e.getMessage();
		}
	}
	
	// Browser Initialization
	public static void Initialisation() {
		
		String BrowserName = prop.getProperty("browser");
		System.out.println(BrowserName);
		
		if(BrowserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\work\\work_files\\eclipse_selenium_files\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(BrowserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","D:\\work\\work_files\\eclipse_selenium_files\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		String url = prop.getProperty("url");
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
			
		
	}
	
	//finding the  element
		public static WebElement FindElement(By element) {
			try {
				return driver.findElement(element);
			}	
			catch(Exception e) {
				System.out.println("Exception occured>>>>" +e.toString());
			}
			return null;
		}
		
		//Closing the browser
		public static void CloseBrowser() {
			
			driver.quit();
			
		}
		
		//wait 
		public static void wait(int count) throws InterruptedException {
			Thread.sleep(count);
		}
		
		//method to selectfrom dropdown
		public static void selectFromDropDown(WebElement element ,String value) {
			try {
				Select vselect = new Select(element);
				vselect.selectByVisibleText(value);
				
			}
			catch(Exception e) {
				System.out.println("Exception occured>>>>" + e.toString());
			}
		}
}
