package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clickonlink {

	public static void main(String []args)
	{
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://mayoclinic.org/");
		
		driver.manage().window().maximize();
		
		WebElement link = driver.findElement(By.linkText("Request appointment"));
		
		link.click();
		
		driver.findElement(By.partialLinkText("Referring")).click();
		
		driver.findElement(By.className("cmp-image__image")).click();
		
	}
}
