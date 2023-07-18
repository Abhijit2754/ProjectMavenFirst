package SeleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {

	public static void main(String []args)
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com/");
		
		System.out.println("Google page title is : "+driver.getTitle());
		
		driver.navigate().to("https://www.facebook.com/");
		
		System.out.println("another page facebook page title is : "+driver.getTitle());
		
		driver.navigate().back();
		System.out.println("After comming back we have captchured the title of the page is it google or not  "+driver.getTitle());
		
		driver.navigate().forward();
		System.out.println("Check whether the navigation worked or not after navigating forward "+driver.getTitle());
		
		driver.quit();
	}	
}
