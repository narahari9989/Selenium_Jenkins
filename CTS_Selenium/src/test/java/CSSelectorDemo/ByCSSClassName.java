package CSSelectorDemo;
import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.*;
import org.testng.annotations.Test;

import TestNG.BaseTest;
public class ByCSSClassName extends BaseTest {
	
	@Test
	public void browserLaunch() throws InterruptedException {
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		//driver.findElement(By.cssSelector(".gLFyf")).sendKeys("kindle",Keys.ENTER);
		
	driver.findElement(By.cssSelector("textarea[id='APjFqb'][class='gLFyf']")).sendKeys("Dharani",Keys.ENTER);
	}

}
