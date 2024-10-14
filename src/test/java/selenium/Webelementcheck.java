package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementcheck {
	
	public void locater()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goindigo.in/");
		WebElement loglink = driver.findElement(By.id("radio-input-triptype-roundTrip"));
		
		if (loglink.isDisplayed())
		{
			System.out.println("Test is Passed");
			
		}
		else
		{
			System.out.println("Test is failed");
		}
	}

	public static void main(String[] args) {
		Webelementcheck w = new Webelementcheck();
		w.locater();

	}

}
