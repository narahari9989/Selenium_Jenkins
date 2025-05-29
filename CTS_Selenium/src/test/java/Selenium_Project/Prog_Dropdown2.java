package Selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prog_Dropdown2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		
		Select sc=new Select(driver.findElement(By.id("themes")));
		//Thread.sleep(3000);
		//sc.selectByVisibleText("Family");
		sc.selectByIndex(3);

	}

}
