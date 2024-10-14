package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp {

	
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
    	
    	Thread.sleep(5000);
    	
    	driver.close();
    	
    	
    	
    	
    	
    }
	public static void main(String[] args) throws InterruptedException {
		
	     ScrollUp SU = new ScrollUp();
	     SU.scrolling1();
	     
	     
		

	}

}
