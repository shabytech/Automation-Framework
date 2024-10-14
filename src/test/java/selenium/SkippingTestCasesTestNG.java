package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkippingTestCasesTestNG {
	
	String requirement = "No";
	
	
	
	//skipping the test cases
		@Test
		public void testng3() throws InterruptedException
		{
			if (requirement.equals("Yes"))
			{
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.bigbasket.com/");
			
			driver.manage().window().maximize();
			
			driver.manage().deleteAllCookies();
			
			Thread.sleep(3000);
			
			driver.close();
			
			}
			else
			{
			
			throw new SkipException("skip this testcase");
			}	
				
			
		}
		

	}



