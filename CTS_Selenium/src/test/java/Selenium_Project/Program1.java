package Selenium_Project;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Program1 {

	public static void main(String[] args) {
	//	WebDriver driver=new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new InternetExplorerDriver();
		
		//Get method
		driver.get("https://www.google.com/");
		
		/*Navigate methods 
		/driver.navigate().to("https://mail.google.com/");
		
		//driver.navigate().back();
		
		/driver.navigate().refresh();
		
		driver.navigate().forward();
		driver.navigate().back();
		
		//Get title of Webpage
		
		String title=driver.getTitle();
		System.out.println("Title of the webpage:"+title);
		
		//Get Current URL of the webpage
		
		String URl= driver.getCurrentUrl();
		System.out.println(URl);
		
		//Get Page Source Code to Webpage
		String SourceCode=driver.getPageSource();
		System.out.println(SourceCode);
		
		driver.close();
		
		driver.quit();x
		
		driver.manage().window().maximize();
		
		

		//Methods is Selenium webdriver
		
		1.get
		2.navigate-->refresh,forward,back
		3.getPageSource();
		4.getCurrentUrl();
		5.Switchto
		6.findElement
		7.findElements
		8.getWindowhandle
		9.getWindowhandles
		10.manage
		11.close
		12.quit
		13.gettilex
		
		//Locator is identify webelements
		
	ID():These is fastest locator for webelements generally its a unique name of Element
		Name():It is also used to identify webelements its define name of element
		
		classname(); These can also used to identify webelements by using classname.
		
		Linktext()/Partial link():
		
		These two locator are exclusive used to identify the links
		
		
		
		
		*/

	}

}
