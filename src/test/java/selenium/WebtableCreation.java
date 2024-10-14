package selenium;

import java.security.PublicKey;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableCreation {
	
	public void table()
	{
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/tables");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	
	WebElement due = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]/td[4]"));
    System.out.println(due.getText());
	
	WebElement lastname = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]/td[1] "));
	System.out.println(lastname.getText());
	
	WebElement firstname = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[4]/td[2]"));
	System.out.println(firstname.getText());
	
	//List<WebElement>  list1 = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[3]"));
	
	//for (int i = 0; i<list1.size(); i++)
	{
	//	System.out.println(list1.get(i).getText());
	}
	
	List<WebElement> list1 =driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[3]"));
	
	for (int i=0; i<list1.size(); i++ )
	{
		System.out.println(list1.get(i).getText());
	
	}
	driver.close();
	
	
}
public static void main(String[] args) {
	WebtableCreation W = new WebtableCreation();
	W.table();
}
}
	
	
  
