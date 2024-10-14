package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Numberoflinks {
	
	public void links()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://practice.expandtesting.com/radio-buttons");
		
		driver.manage().window().maximize();
		
		
		driver.findElements(By.tagname())
		
	}

	public static void main(String[] args) {
		

	}

}
