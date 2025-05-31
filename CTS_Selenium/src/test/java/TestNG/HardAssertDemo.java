package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertDemo {
	@Test
	public void LaunchBrowser() {
		
	
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com/");
	System.out.println("Starting........");
	
	
	String title=driver.getTitle();
	Assert.assertEquals(title, "Facebook","Mismatch");
	
	System.out.println("Ending........");
	
	}
	@Test
	public void demo() {
		System.out.println("Just for Demo");
		
	}
}
