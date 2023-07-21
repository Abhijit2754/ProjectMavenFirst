package SeleniumBasic;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifiyTitleOfPage {
	
	public static void main(String []args)
	{
			WebDriverManager.chromedriver().setup();		
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.hirekar.in/");		
	
			driver.findElement(By.xpath("//input[@placeholder='Find Services']")).sendKeys("ahhbijjiit");
	    	
	    	driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
			
			String ttle = driver.getTitle();
			
			String data = driver.getPageSource();
			
			boolean isTextAvailable = data.contains("No gig found, Please try another query.");
						
			if(isTextAvailable)
			{
				System.out.println("No service Aviablae");
			}
			else
			{
				System.out.println("Service Available with given text");
			}		
			
	}

}
