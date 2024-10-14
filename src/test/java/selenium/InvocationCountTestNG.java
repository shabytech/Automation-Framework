package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCountTestNG {
	
////running the test case n number of times
	@Test(invocationCount = 3)
	public void Swiggy() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.swiggy.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		Thread.sleep(3000);
		
		driver.close();
			
			
		
	}

}
