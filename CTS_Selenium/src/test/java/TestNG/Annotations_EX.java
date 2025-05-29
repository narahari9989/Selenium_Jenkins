package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_EX  {
	@BeforeSuite
	public void beforesuite() {
		System.out.println("++++++++++++++Before suite the report+++++++++++++");
	}
	@AfterSuite
	public void Aftersuite() {
		System.out.println("==============After suite send the report========");
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
	
	
	@Test(priority = 1)
	public void Login() {
		System.out.println("Login the page");
	}
	@Test(priority = 2)
	public void SearchProduct() {
		System.out.println("Searct the product");
	}
	@Test(priority = 3)
	public void AddCart() {
		System.out.println("add to the card");
	}
	@Test(priority = 4)
	public void AddAddress() {
		System.out.println("add the address");
	}
	@Test(priority = 5)
	public void PaymentGateway() {
		System.out.println("Pay the amout");
	}
	
	@AfterTest
	public void Logout() {
		System.out.println("++++++++++After test+++++++++++++++");
	}
	
}
