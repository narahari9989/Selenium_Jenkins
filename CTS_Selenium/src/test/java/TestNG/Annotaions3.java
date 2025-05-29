package TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyReports.class)
public class Annotaions3 extends BaseTest {

	
	@Test(priority = 1)
	public void OpenURL() {
		driver.get("https://www.flipkart.com/");
		System.out.println("Open the URL");
	}
	@Test(priority = 2)
	public void Login() {
		System.out.println("Login the page");
	}
	@Test(priority = 3)
	
	public void SearchProduct() {
		Assert.fail();
		System.out.println("Searct the product");
	}
	
	@Test(priority = 5)
	public void AddAddress() {
		System.out.println("add the address");
	}
	@Test(priority = 6)
	public void PaymentGateway() {
		System.out.println("Pay the amout");
	}
	
	

}
