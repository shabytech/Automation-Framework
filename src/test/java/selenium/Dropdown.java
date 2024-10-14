package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Dropdown {
	
	public void dropdownlocater() throws InterruptedException, IOException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://codenboxautomationlab.com/registration-form/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		
		WebElement dd = driver.findElement(By.id("nf-field-22"));
		
		Select S = new Select(dd);
		
		//S.selectByIndex(3);
		
		//S.selectByVisibleText("Power BI & SQL");
		
		S.selectByValue("mobile-automation");
		
		Thread.sleep(5000);
		
		File F = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(F, new File ("C:\\Users\\Shaby\\OneDrive\\Documents\\Screenshots.dropdown.png"));
		
		
		driver.close();
		
		
		
		
		
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		
		Dropdown d = new Dropdown();
		d.dropdownlocater();
		

	}

}
