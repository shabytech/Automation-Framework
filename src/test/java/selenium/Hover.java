package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover {
	
	public void hovering() throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://practice.expandtesting.com/hovers");
				
	    driver.manage().window().maximize();
	    
	    Thread.sleep(5000);
				
	    WebElement focus = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[2]"));
	    
	    Actions foc = new Actions(driver);
	   
	    foc.moveToElement(focus).build().perform();
	    
	    Thread.sleep(5000);
	    
	    driver.close();
	    
	   
	}

	public static void main(String[] args) throws InterruptedException {
		Hover H = new Hover();
		H.hovering();
		

	}

}
