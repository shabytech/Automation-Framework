package selenium;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FetchingDataFromExcel {
	DataFormatter df = new DataFormatter();
	
	@Test(dataProvider="testdata")
	public void excelTest(String fullname , String password, String email, String mobile) throws InterruptedException
	{
		
		WebDriver driver =  new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("register_Layer")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys(fullname);
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys(email);
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.id("mobile")).sendKeys(mobile);
		Thread.sleep(3000);
		driver.close();
	}
	
	@DataProvider(name = "testdata")
	public Object[][] provideData() throws IOException
	{
		
		FileInputStream fis = new FileInputStream("C:\\Users\\leoga\\OneDrive\\Desktop\\TestData1.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet s1 = wb.getSheet("tdata");
		
		int rowcount = s1.getPhysicalNumberOfRows();
		
		XSSFRow row = s1.getRow(0);
		
		int columncount = row.getLastCellNum();
		
		
		Object [] [] data = new Object [rowcount-1][columncount];
		
		for ( int i =0 ; i<rowcount-1; i++)
		{
			row = s1.getRow(i+1);
				for (int j = 0; j<columncount; j++)
				{
					
					XSSFCell cell = row.getCell(j);
					
					data [i][j] = df.formatCellValue(cell);
					
				}
			
			
		}
		
		return data;
		
		
		
	}
}
