package Selenium_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3_Dropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		List<WebElement>dropdown=driver.findElements(By.tagName("Select"));
		System.out.println(dropdown.size());
		for(int i=0;i<dropdown.size();i++) {
			System.out.println(dropdown.get(i).getAttribute("name"));
		}
		
		

	}

}
