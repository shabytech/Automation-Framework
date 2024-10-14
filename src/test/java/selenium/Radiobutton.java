package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {
	
	public void radio() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		driver.manage().window().maximize();
		
		
		
        WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        
        radio.click();
        
        Thread.sleep(5000);
        
        driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		
		Radiobutton r = new Radiobutton();
		r.radio();
	

	}

}
