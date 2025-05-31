package Selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_Dropdowns {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		
		driver.findElement(By.id("themes")).sendKeys("Family");
	
		driver.findElement(By.id("duration_d")).sendKeys("2Nights+3Days");

	}

}
