package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
	import org.testng.annotations.Test;

	public class ParallelRunningMultipleClassesTogether {
		

		@Test
		public void jiomart() throws InterruptedException
		{
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.jiomart.com/");
			
			driver.manage().window().maximize();
			
			driver.manage().deleteAllCookies();
			
			Thread.sleep(3000);
			
			driver.close();
				
				
			
		}
		
		
		@Test
		public void naukri() throws InterruptedException
		{
			WebDriver driver = new EdgeDriver();
			
			driver.get("https://www.naukri.com/");
			
			driver.manage().window().maximize();
			
			driver.manage().deleteAllCookies();
			
			Thread.sleep(3000);
			
			driver.close();
				
				
			
		}

		
		@Test
		public void amazon() throws InterruptedException
		{
			WebDriver driver = new FirefoxDriver();
			
			driver.get("https://www.amazon.com/");
			
			driver.manage().window().maximize();
			
			driver.manage().deleteAllCookies();
			
			Thread.sleep(3000);
			
			driver.close();
				
				
			
		}
		
		
		@Test
		public void monster() throws InterruptedException
		{
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.monster.com/");
			
			driver.manage().window().maximize();
			
			driver.manage().deleteAllCookies();
			
			Thread.sleep(3000);
			
			driver.close();
			
			
				
				
			
		}
		

	}
