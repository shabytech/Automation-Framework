package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {
	
	public void rig() throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://practice.expandtesting.com/context-menu");
		
		driver.manage().window().maximize();
		
		WebElement click = driver.findElement(By.id("hot-spot"));
		
		Thread.sleep(5000);
		
		Actions R = new Actions(driver);
		R.contextClick(click).build().perform();
		
		driver.close();
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		Rightclick L = new Rightclick();
		L.rig();
		

	}

}
