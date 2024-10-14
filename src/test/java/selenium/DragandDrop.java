package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	
	public void DandD() throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://practice.expandtesting.com/drag-and-drop");
		
		WebElement element1 = driver.findElement(By.id("column-a"));
		WebElement element2 = driver.findElement(By.id(" column-b"));
		
		Actions AC =  new Actions (driver);
		AC.dragAndDrop(element1, element2).build().perform();
		
	
		
		Thread.sleep(5000);
		
		driver.close();
		
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		DragandDrop dd = new DragandDrop();
		dd.DandD();
		

	}

}
