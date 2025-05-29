package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	protected WebDriver driver;
	String browser="chrome";
	@BeforeClass
	public void Openbrowser() {
		if(browser.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
			
		}
		else if(browser.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
		
		System.out.println("Opening the browser");
	}
	else if(browser.equalsIgnoreCase("ie")) {
	driver=new InternetExplorerDriver();
	}
	}
	@AfterClass
	public void CloseBrowser() {
		
		driver.quit();
		System.out.println("Logout the page");
	}


}
