package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting {
	
	
	@Test(dataProvider= "Credentials")
    public void DDT(String username, String password) throws InterruptedException
    {
    	
    	WebDriver driver = new EdgeDriver();
    	
    	driver.manage().deleteAllCookies();
    	
    	driver.get("https://www.naukri.com/");
    	
    	driver.manage().window().maximize();
    	
    	driver.findElement(By.linkText("Login")).click();
    	
    	Thread.sleep(3000);
    	
    	driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys(username);
    	
    	Thread.sleep(3000);
    	
    	driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(password);
    	Thread.sleep(3000);
    	
    	driver.findElement(By.xpath("//button[@type='submit']")).click();
    	
    	Thread.sleep(3000);
    	
    	driver.close();
    	
    	
    }
	
	@DataProvider(name = "Credentials")
	public Object[][] providedata()
	{
		Object [] [] data = new Object [4] [2];
		
		data [0] [0] = "shabymathew04@gmail.com";
		data [0] [1] = "shaby123";
		
		data [1] [0] = "priya04@gmail.com";
		data [1] [1] = "shaby123";
		
		
		data [2] [0] = "hazel04@gmail.com";
		data [2] [1] = "shaby123";
		
		data [3] [0] = "zane04@gmail.com";
		data [3] [1] = "shaby123";
		
		return data;
		
		
	}

}