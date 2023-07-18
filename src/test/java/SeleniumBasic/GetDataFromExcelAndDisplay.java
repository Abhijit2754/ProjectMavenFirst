package SeleniumBasic;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetDataFromExcelAndDisplay {

    @Test(dataProvider = "loginDataProvider")
    public void testLogin(String username, String password) {

    	System.out.println("Username: " + username + " Password: " + password);   	
    	    			
    	if("Admin".equals(username) && "Paswword123".equals(password))
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