package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {
	
	public void doub() throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://practice.expandtesting.com/context-menu");
		
		driver.manage().window().maximize();
		
		WebElement hit = driver.findElement(By.id("hot-spot"));
		
		Thread.sleep(5000);
		
		Actions D = new Actions(driver);
		D.doubleClick(hit).build().perform();
		
		driver.close();
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		Doubleclick L = new Doubleclick();
		L.doub();
		

	}

}