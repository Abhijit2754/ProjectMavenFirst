package SeleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextOf {
	
	public static void main(String []args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		
		driver.get("https://mayoclinic.org/");
		
		List<WebElement> element = driver.findElements(By.tagName("a"));
		
		int sizeoflink = element.size();
		
		System.out.println("All link avaible on page is : "+sizeoflink);
		
		for(int i = 0; i < sizeoflink ; i++)
		{
			WebElement ele = element.get(i);
			String text = ele.getText();
			
			if("Healthy Lifestyle".equals(text))
			{
				ele.click();
			}
		}
	}

}
