package selenium;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicvalueselection {

	public void dyna()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://practice.expanding.com/radio-button");
		
		String colour = "Green";
		List <WebElement> colournames= driver.findElemnets (By.ClassName("form-check-label"));
		
		int len = colournames.size();
		
		for (int i = 0; i<len; i++);
		{
			if(Colournames.get(i).getText().equals(colour))
		}
		
		List <WebElement>buttonlist = driver.findElements(By.xpath("//input[@type='radio'] "));
		
		int len1 = buttonlist.size();
		 for 
	}
	
	public static void main(String[] args) {
		

	}
	

}
