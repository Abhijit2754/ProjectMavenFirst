package SeleniumBasic;

import java.sql.DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenTwoTabAndCloseOneTime {

	public static void main(String []args)
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver1 = new ChromeDriver();
		
		WebDriver driver2 = new ChromeDriver();
		
		driver1.get("https://www.google.com");
		
		driver2.get("https://www.facebook.com");
		
		driver1.switchTo().window(driver1.getWindowHandle());		
	}
}
