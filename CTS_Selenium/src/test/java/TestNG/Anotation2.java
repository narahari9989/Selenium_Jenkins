package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Anotation2 extends BaseTest {
	
	@Test(priority = 1)
	public void OpenURL() {
		driver.get("https://www.amazon.in/");
		System.out.println("Open the URL");
	}
	@Test(priority = 2)
	public void Login() {
		System.out.println("Login the page");
	}
	@Test(priority = 3)
	public void SearchProduct() {
		System.out.println("Searct the product");
	}
	@Test(priority = 4)
	public void AddCart() {
		System.out.println("add to the card");
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
