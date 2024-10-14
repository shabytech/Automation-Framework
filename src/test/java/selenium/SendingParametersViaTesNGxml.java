package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SendingParametersViaTesNGxml {
	
    @Parameters("runningBrowser")
	@Test
	public void myntra(String runningBrowser) throws InterruptedException
	
	{
    	
    	if (runningBrowser.equals ("chrome"))
    	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		Thread.sleep(3000);
		
		driver.close();
			
    	}	
    	else if (runningBrowser.equals ("edge"))
    	{
    		WebDriver driver = new EdgeDriver();
    		
    		driver.get("https://www.myntra.com/");
    		
    		driver.manage().window().maximize();
    		
    		driver.manage().deleteAllCookies();
    		
    		Thread.sleep(3000);
    		
    		driver.close();
    			
		}
    	
    	else 
    	{
            WebDriver driver = new FirefoxDriver();
    		
    		driver.get("https://www.myntra.com/");
    		
    		driver.manage().window().maximize();
    		
    		driver.manage().deleteAllCookies();
    		
    		Thread.sleep(3000);
    		
    		driver.close();
    				
		}
	}
}
