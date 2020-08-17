package stepDefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.BrowserMethods;

public class GoogleTest {
	WebDriver driver;
	
	@Given("^user is on Google home page$")
	public void user_is_on_Google_home_page() throws Throwable {
	  driver = BrowserMethods.launchChrome("https://www.google.com");
	}
	
	@When("^user searches for \"([^\"]*)\"$")
	public void user_searches_for(String search) throws Throwable {
	  driver.findElement(By.name("q")).sendKeys(search);
	  Thread.sleep(3000);
	  driver.findElement(By.cssSelector("div.sbl1 span")).click();
	   
	}

	@Then("^results for \"([^\"]*)\" are displayed$")
	public void results_for_are_displayed(String arg1) throws Throwable {
	   
		assertEquals("amazon - Google Search", driver.getTitle());
	}

	

	@When("^User searches for images$")
	public void user_searches_for_images() throws Throwable {
	   driver.findElement(By.linkText("Images")).click();
	}

	@Then("^results for searhed images are displayed$")
	public void results_for_searhed_images_are_displayed() throws Throwable {
	   System.out.println("Image search");
	}

	@When("^User searches for books$")
	public void user_searches_for_books() throws Throwable {
		driver.findElement(By.linkText("Books")).click();
	}

	@Then("^results for searhed books are displayed$")
	public void results_for_searhed_books_are_displayed() throws Throwable {
		 System.out.println("Book search");
	}



}
