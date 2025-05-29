package CSSelectorDemo;

import org.testng.annotations.Test;

import TestNG.BaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.*;

public class ByCSSID extends BaseTest {
	
	@Test
	public void Cssid() {
		driver.get("https://www.amazon.in/");
		//# is ID for css selector
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Laptop",Keys.ENTER);

	}

}
