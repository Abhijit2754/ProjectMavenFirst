package SeleniumBasic;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ManualyTextLikeOTP {
	
	public static void main(String []args)
	{
		WebDriverManager.chromedriver().setup(); 
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		System.out.println("Please enter the OTP sent to your mobile:");
		
        Scanner scanner = new Scanner(System.in);
        String Test = scanner.nextLine();
        
        WebElement data = driver.findElement(By.className("gLFyf"));
        
        data.sendKeys(Test);
        
        driver.findElement(By.className("gNO89b")).click();
                
	}
}
