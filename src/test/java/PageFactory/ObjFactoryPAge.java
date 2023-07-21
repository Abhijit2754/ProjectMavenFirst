package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ObjFactoryPAge {
	
	@FindBy(linkText = "Become a Seller")
	public WebElement link;
	
	@FindBy(xpath="//input[@id='modal-join-name']")
	public WebElement name;
	
	@FindBy(xpath="//input[@id='modal-join-email']")
	public WebElement email;
	
	@FindBy(xpath = "//input[@id='modal-join-username']")
	public WebElement username;
	
	@FindBy(name="mobile")
	public WebElement mobile;
	
	public ObjFactoryPAge(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnLink()
	{
		link.click();
	}
	
	public void waitForWhile() throws InterruptedException
	{
		Thread.sleep(5000);
	}
	
	public void insertValue(String CandidateName)
	{
		name.sendKeys(CandidateName);
	}
	
	public void addEmail(String passemail)
	{
		email.sendKeys(passemail);
	}
	
	public void addUsername(String pasUsernmae)
	{
		username.sendKeys(pasUsernmae);
	}
	
	public void addMobile(String mobileNumber)
	{
		mobile.sendKeys(mobileNumber);
	}
}
