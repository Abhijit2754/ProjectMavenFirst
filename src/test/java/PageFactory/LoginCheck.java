package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCheck {

	public static void main(String arg[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://hirekar.in/");
		
		ObjFactoryPAge page = new ObjFactoryPAge(driver);
		
		page.ClickOnLink();
		page.waitForWhile();
		page.insertValue("Abhijit Paithane");
		page.addEmail("abhijitpaithane93@gmail.com");
		page.addUsername("Abhiji123");
		page.addMobile("9767472754");
		
	}
}
