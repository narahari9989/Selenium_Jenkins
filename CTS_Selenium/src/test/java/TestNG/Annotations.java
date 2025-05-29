package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations  {
	@BeforeSuite
	public void beforesuite() {
		System.out.println("++++++++++++++Before suite the report+++++++++++++");
	}
	@AfterSuite
	public void Aftersuite() {
		System.out.println("==============After suite send the report========");
	}
	@BeforeGroups("Demo group")
	public void bfgroup() {
		System.out.println("==============before group========");
	}
	@AfterGroups("Demo group")
	public void afgroup() {
		System.out.println("==============after group========");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("*********Before class **********");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("*********After class **********");
	}

	@BeforeTest
	public void OpenURL() {
		
		System.out.println("++++++++++++++Before test+++++++++++++");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("===========Before Method============");
	}
	
	@AfterMethod
	public void Aftermethod() {
		System.out.println("===========After Method============");
	}
	
	
	@Test(groups = "Demo group")
	public void Login() {
		System.out.println("Login the page");
	}
	
	
	@AfterTest
	public void Logout() {
		System.out.println("++++++++++After test+++++++++++++++");
	}
	
}
