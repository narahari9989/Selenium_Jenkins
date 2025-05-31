package TestNG;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Wait_Selenium {
	WebDriver driver;

	
	@Test public void Test1() { driver=new ChromeDriver();
	 driver.get("https://www.google.com/"); WebElement
	 SearchBar=driver.findElement(By.name("q")); WebDriverWait wait = new
	 WebDriverWait(driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.visibilityOf(SearchBar)).sendKeys("Selenium");
	 
	  
	  }
	 
	@Test
	/*public void Test2() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement SearchBar1=driver.findElement(By.name("q"));
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).
				ignoring(Exception.class);
		WebElement foo=wait.until(new Function<WebDriver,Searchbar>)
		
		
	}*/

