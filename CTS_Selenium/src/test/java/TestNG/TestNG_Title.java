package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_Title {
	
	@Test
	public void title() {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getCurrentUrl());
	}

}
