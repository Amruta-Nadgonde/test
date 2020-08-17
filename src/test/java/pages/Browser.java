package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	//this is test
	private static WebDriver driver = new ChromeDriver();
	
	public static WebDriver driver()
	{
		//returnd driver
		return driver;
	}
	
	public static void open(String url)
	{
		driver.get(url);
	}
	
	public static void close()
	{
		
	}

}
