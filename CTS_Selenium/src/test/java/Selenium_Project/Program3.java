package Selenium_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicibank.com/");
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++) {
			
		
		System.out.println(links.get(i).getText());
		}

	}
	

}
