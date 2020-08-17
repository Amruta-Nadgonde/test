package utility;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserMethods {
	
	
		public static WebDriver launchFF(String url)
		{
			System.setProperty("webdriver.gecko.driver", "F:\\SeleniumDownloads\\Drivers\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();				
			driver.get(url);
			return driver;
			
		}
		
		public static WebDriver launchChrome(String url)
		{
			System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDownloads\\chromedriver_win32\\chromedriver.exe");			
			WebDriver driver = new ChromeDriver();				
			driver.get(url);
			return driver;
		}
		
		public static void verifyPageTitle(WebDriver driver, String expTitle)
		{
			
			String actTitle = driver.getTitle();
			if(actTitle.equals(expTitle))
			{
				System.out.println("Pass");
			}
			else
				System.out.println("Fail");
			
		}
		
		
		
	}
	
	





