package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Scrolldown {

	
    public void scrolling1() throws InterruptedException
    {
    	WebDriver driver = new ChromeDriver();
    	
    	driver.get("https://www.cricbuzz.com/");
    	
    	driver.manage().window().maximize();
    	
    	driver.manage().deleteAllCookies();
    	
    	JavascriptExecutor Js = (JavascriptExecutor) driver;    
    	
    	Js.executeScript("window.scrollBy(0,5500)");       //script for scroll down
    	
    	Thread.sleep(5000);
    	
    	Js.executeScript("window.scrollBy(0,-5500)");      //script for scroll up 
    	
    	WebElement schedule = driver.findElement(By.xpath("//h2[normalize-space()='SCHEDULE'])[1]"));
    	
    	Js.executeScript("arguments[0].scrollIntoView();",  schedule); //Scroll till the webelement
    	
    	file f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.File);
    	Files.copy(f, new(""))
    	
    	
    	Thread.sleep(5000);
    	
    	driver.close();
    	
    	
    	
    	
    	
    }
	public static void main(String[] args) throws InterruptedException {
		
	     Scrolldown SU = new Scrolldown();
	     SU.scrolling1();
	     
	     
		

	}

}

