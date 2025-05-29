package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Reports {
	@Test
	public void LaunchBrowser() {
		
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	Reporter.log("title of the page"+driver.getTitle());
	Reporter.log("URL of the page"+driver.getCurrentUrl());
	//Reporter.log("Source code of webpage"+driver.getPageSource());

	
	

	}

}
