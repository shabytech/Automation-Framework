package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class AssertAndVerify {
	
	@Test
	public void jioTest() throws InterruptedException
	{
		WebDriver driver =  new EdgeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.jiomart.com/");
		driver.manage().window().maximize();
		String expectedname = "JioMar";
		
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt='JioMart']"));
		String text = logo.getText();// JioMart
		System.out.println(text);
		//SoftAssert or verify
		//SoftAssert S = new SoftAssert();
		//S.assertEquals(text, expectedname, "Test Stopped here");
	
		
		
		//HardAssert or assert
		WebElement logotext = driver.findElement(By.xpath("//img[@alt='JioMar']"));
		Assert.assertEquals(text, expectedname, "Test Stopped here");
		
		System.out.println("I am learning java");
		System.out.println("I am learning selenium");
		
		driver.close();
		//S.assertAll();
	}
}
