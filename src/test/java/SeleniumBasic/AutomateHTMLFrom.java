package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomateHTMLFrom {
	
	public static void main(String []args)
	{
	
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
			
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Abhijit");
			
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Paithane");
			
			driver.findElement(By.xpath("//input[@id='sex-0']")).click();
			
			driver.findElement(By.xpath("//input[@id='exp-5']")).click();
			
			driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("30/10/1990");
			
			WebElement  ele=driver.findElement(By.id("continents"));
			
			Select dropdown = new Select(ele);
			
			dropdown.selectByIndex(3);
			
			WebElement selectedOption = dropdown.getFirstSelectedOption();
			
	}
}
