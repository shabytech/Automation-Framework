package selenium; //This is package

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.google.common.base.CaseFormat;
import com.google.common.io.Files;

public class Syntax { //this is class

	public void syn() throws InterruptedException //this is method outside main method
	
	{
		WebDriver driver = new ChromeDriver(); //launching chrome browser
		   
		   driver.get("https://www.ironspider.ca/forms/checkradio.htm"); //launching the website
		   
		   driver.manage().window().maximize(); //maximize the window
		   
		   driver.manage().deleteAllCookies();  //delete all the cookies
		                                        //and allow to run the application without interruption
		   
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //providing the wait for 10 seconds 
		   
		   WebElement radio = driver.findElement(By.xpath("(//input[@type='checkbox'])[5]"));
		  //initializing webelement and finding the webelement by locater
		   
		   Select S = new Select(dd); // selecting the value in dropdown
		   
			
			S.selectByIndex(3); // selecting by index like value as 0,1,2,3...
			
			S.selectByVisibleText("Power BI & SQL"); // selecting directly by name
			
			S.selectByValue("mobile-automation"); // selecting by value provided in inspect
			
			File F = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(F, new File ("C:\\Users\\Shaby\\OneDrive\\Documents\\Screenshots.dropdown.png"));
			//taking the screenshot and saving it in folder
			
		   
		   radio.click(); //clicking on radio button or check box
		   
		   JavascriptExecutor Js = (JavascriptExecutor) driver; //script for scroll down   
	    	
	    	Js.executeScript("window.scrollBy(0,5500)");  //script for scroll down 
	    	
	    	Js.executeScript("window.scrollBy(0,-5500)");      //script for scroll up 
	    	
	    	List<WebElement> list1 =driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[3]"));
	    	//to display list of data using for loop and getText and list.size() method
	    	for (int i=0; i<list1.size(); i++ )
	    	{
	    		System.out.println(list1.get(i).getText());
	    	
	    	
	    	
	    	
	    	@Test    //annotation for TestNG
	    	@Test(priority = 1)   //prioritizing the test cases
	    	@Test(enabled = false)  //disabling the testcases
	    	@Test(invocationCount = 4)  //running the test case 4 number of times
	    	@Test(throw new SkipException("test Case skipped"));  //skipping test case
	    			
		   
		   Thread.sleep(5000);  //delaying for 5sec after the above click
		   
		   driver.close(); //closing the website window
		   
		   
				   
	}
	
	public static void main(String[] args) { //this is main method from where the java starts execution
		

	}

}
