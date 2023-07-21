package TestNgPrograms;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.assertEquals;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataProviderWithExcel {

    @Test(dataProvider = "loginDataProvider")
    public void testLogin(String username, String password) {

    	WebDriverManager.chromedriver().setup();
    	
    	WebDriver driver = new ChromeDriver();
    	    	
    	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    	
    	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
    	
    	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
    	
    	driver.findElement(By.xpath("//button[@type='submit']")).click();
    	
    	String title = driver.getTitle();
    	
    	if(title.equals("OrangeHRM"))
    	{
    		assert(true);
    	}
    	else
    	{
    		assert(false);
    	}
    	
    }

    @DataProvider(name = "loginDataProvider")
    public Object[][] getLoginTestData() throws IOException {
        FileInputStream file = new FileInputStream("C:\\Users\\admin\\Documents\\Doccuments for 2023\\Data.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        int lastRow = sheet.getLastRowNum(); // it returns the last row number
        int colCount = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[lastRow][colCount];

        for (int row = 0; row < lastRow; row++) {
            XSSFRow currentRow = sheet.getRow(row);

            String username = currentRow.getCell(0).toString();
            String password = currentRow.getCell(1).toString();

            data[row][0] = username;
            data[row][1] = password;            
        }

        workbook.close();
        return data;
    }
}