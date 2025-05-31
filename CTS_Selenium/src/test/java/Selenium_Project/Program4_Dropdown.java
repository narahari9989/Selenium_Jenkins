package Selenium_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program4_Dropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.id("themes"));
		
		List<WebElement>values=dropdown.findElements(By.tagName("option"));
		System.out.println(values.size());
		for(int i=0;i<values.size();i++) {
			System.out.println(values.get(i).getText());
		}
		
		
		

	}

}
