package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;

public class EndtoEndApplicationAutomation {
	
	public void EndtoEnd() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/");
			
			
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.id("input-email")).sendKeys("shaby.technoworld.com"); //entering the values using send keys.
		
		driver.findElement(By.id("input-password")).sendKeys("shaby@123");
		
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		
		driver.findElement(By.xpath("//img[@title='naveenopencart']" )).click();
		
		driver.findElement(By.name("search")).sendKeys("iPhone");
		
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		
		List<WebElement>productList = driver.findElements(null)
		)
		
		
		
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
		       
		
		
		
		
		
		
		
		
	}
	
	
	

	public static void main(String[] args) throws InterruptedException {
		
		EndtoEndApplicationAutomation e = new EndtoEndApplicationAutomation();
		e.EndtoEnd();
		

	}

}
