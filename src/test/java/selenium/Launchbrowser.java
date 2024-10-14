package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbrowser {
	
	public void launch()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/mnjuser/profile");
		
		driver.close();
	}

	public static void main(String[] args) {
		Launchbrowser l = new Launchbrowser();
		l.launch();

	}

}
