package Selenium_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program5_Dropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		
		WebElement ele=driver.findElement(By.id("themes"));
		
		List<WebElement>values=ele.findElements(By.tagName("option"));
		for(int i=0;i<values.size();i++) {
			String name=values.get(i).getText();
						values.get(i).click();
						
						if(values.get(i).isDisplayed()) {
							
							System.out.println(name+" :"+"Active");
						}
						else {
							System.out.println(name+" :"+"inActive");
						}
		}
		
		

	}

}
