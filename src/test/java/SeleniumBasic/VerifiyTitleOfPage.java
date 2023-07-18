package SeleniumBasic;

import java.sql.DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifiyTitleOfPage {
	
	public static void main(String []args)
	{
			WebDriverManager.chromedriver().setup();
			
			ChromeOptions headless = new ChromeOptions();
			
			headless.addArguments("--headless");
			
			WebDriver driver = new ChromeDriver(headless);
			
			driver.get("https://www.google.com/");
			
			driver.manage().window().maximize(); 
			
			String ttle = driver.getTitle();
			
			System.out.println("Title is "+ttle);
			
			if(ttle.equals("Google"))
			{
				System.out.println("Title is matched");
			}
			else
			{
				System.out.println("title is not matched");
			}
			
			driver.close();
	}

}
