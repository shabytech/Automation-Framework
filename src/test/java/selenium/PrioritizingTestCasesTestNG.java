package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class PrioritizingTestCasesTestNG {
	
	String requirement ="No";
	//prioritizing the test cases

	@Test(priority=1)
	public void testng() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		Thread.sleep(3000);
		
		driver.close();
			
			
		
	}
	
	////running the test case n number of times
	@Test(invocationCount = 3)
	public void testng1() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.swiggy.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		Thread.sleep(3000);
		
		driver.close();
			
			
		
	}

	//disabling the test cases
	@Test(enabled = false)
	public void testng2() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		Thread.sleep(3000);
		
		driver.close();
			
			
		
	}
	
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
