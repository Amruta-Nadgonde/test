package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.Browser;
import utility.BrowserMethods;

public class Yelp {

	public static void main(String[] args) {
		WebDriver driver = BrowserMethods.launchChrome("https://www.yelp.com/");
		driver.findElement(By.id("find_desc")).click();
		driver.findElement(By.id("find_desc1")).click();
		
		driver.findElement(By.id("find_desc2")).click();
		
	}

}
