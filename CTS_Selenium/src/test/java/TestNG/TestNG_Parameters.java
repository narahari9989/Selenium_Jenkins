package TestNG;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG_Parameters {
	@Test(priority = 1)
	public void Login() {
		boolean product=true;
		if(product==false)
			throw new SkipException("False statement");
		//	Assert.fail("Fail");
		System.out.println("Login the page");
	}
	@Test(dependsOnMethods = "Login")
	public void SearchProduct() {
		System.out.println("Searct the product");
	}
	@Test(dependsOnMethods = "SearchProduct")
	public void AddCart() {
		System.out.println("add to the card");
	}
	

}
