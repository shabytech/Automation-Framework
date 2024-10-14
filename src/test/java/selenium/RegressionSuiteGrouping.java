package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

	import org.testng.annotations.Test;

	public class RegressionSuiteGrouping {
		

		@Test(groups = {"regressionTest"})
		public void myntra() throws InterruptedException
		{
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.myntra.com/");
			
			driver.manage().window().maximize();
			
			driver.manage().deleteAllCookies();
			
			Thread.sleep(3000);
			
			driver.close();
				
				
			
		}
		
		
		@Test
		public void swiggy() throws InterruptedException
		{
			WebDriver driver = new EdgeDriver();
			
			driver.get("https://www.swiggy.com/");
			
			driver.manage().window().maximize();
			
			driver.manage().deleteAllCookies();
			
			Thread.sleep(3000);
			
			driver.close();
				
				
			
		}

		
		@Test(groups = {"regressionTest"})
		public void flipkart() throws InterruptedException
		{
			WebDriver driver = new FirefoxDriver();
			
			driver.get("https://www.flipkart.com/");
			
			driver.manage().window().maximize();
			
			driver.manage().deleteAllCookies();
			
			Thread.sleep(3000);
			
			driver.close();
				
				
			
		}
		
		
		@Test
		public void bigbasket() throws InterruptedException
		{
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.bigbasket.com/");
			
			driver.manage().window().maximize();
			
			driver.manage().deleteAllCookies();
			
			Thread.sleep(3000);
			
			driver.close();
			
			
				
				
			
		}
		

	}


