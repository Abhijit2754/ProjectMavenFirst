package SeleniumBasic;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ModelPopup {

	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hirekar.in/");
		
		driver.findElement(By.xpath("//a[normalize-space()='Become a Seller']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));		
		
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='modal-join-name']")));
		
		element.sendKeys("Hellow");		
	}
}
