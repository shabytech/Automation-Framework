package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	
	public void check() throws InterruptedException //declaring the method
	{
	   WebDriver driver = new ChromeDriver(); //launching chrome browser
	   
	   driver.get("https://www.ironspider.ca/forms/checkradio.htm"); //launching the website
	   
	   driver.manage().window().maximize(); //maximize the window
	   
	   WebElement check = driver.findElement(By.xpath("(//input[@type='checkbox'])[5]"));
	  //initializing webelement and finding the webelement by locater
	   
	   check.click();
	   
	   Thread.sleep(5000);
	   
	   driver.close(); //closing the website window
			   
			   
	}

	public static void main(String[] args) throws InterruptedException {
	
		Checkbox c = new Checkbox();
		c.check();
		

	}

}
