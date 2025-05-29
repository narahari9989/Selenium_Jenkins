package Selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.linkText("Gmail")).click();
		String actual = driver.getTitle();
		String Expected="Gmail";
		if(actual.contains(Expected)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		

	}

}
