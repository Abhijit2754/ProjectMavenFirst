package PageFactory;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelFactory extends BaseClass {
	
	@FindBy(xpath="//*[@id=\"APjFqb\"]")
	public static WebElement search;
	
	@FindBy(xpath="//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")
	public static WebElement button;
	
	
	public ExcelFactory(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		
		ExcelFactory fd = new ExcelFactory(driver);
		
		driver.get("https://www.google.com");
		
		search.sendKeys("Welcome to Boostmedia");
		
		button.click();
		
	}
}
