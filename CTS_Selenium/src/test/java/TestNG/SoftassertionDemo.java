package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftassertionDemo {
	@Test
	public void LaunchBrowser() {
		
	
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com/");
	System.out.println("Starting........");
	
	SoftAssert sf=new SoftAssert();
	String title=driver.getTitle();
	
	sf.assertEquals(title,"Facebook","Mismatvh");
	System.out.println("Ending........");
	sf.assertAll();
	}
	@Test
	public void demo() {
		System.out.println("Just for Demo");
		
	}

}
