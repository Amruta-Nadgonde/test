package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.BrowserMethods;

public class AmazonTest {
	WebDriver driver;
	@Given("^user is on amazon home page$")
	public void user_is_on_amazon_home_page() throws Throwable {
	  driver = BrowserMethods.launchChrome("https://www.amazon.in/");
	}

	@When("^user searches a product$")
	public void user_searches_a_product() throws Throwable {
	   driver.findElement(By.id("twotabsearchtextbox")).sendKeys("cucumber books");
	   driver.findElement(By.cssSelector("input[value='Go']")).click();
	}

	@Then("^results for the product are displayed$")
	public void results_for_the_product_are_displayed() throws Throwable {
	  // Thread.sleep(5000);
		//assertEquals(driver.findElement(By.cssSelector(".a-color-state.a-text-bold")).getText(), 
		//	  "cucumber books");
	}

	@Given("^user is on amazon search page$")
	public void user_is_on_amazon_search_page() throws Throwable {
	   assertEquals("Amazon.in: cucumber books", driver.getTitle());
	}

	@When("^user filters using format$")
	public void user_filters_using_format() throws Throwable {
		WebElement chkBox = driver.findElement(By.xpath("//div[@id='filters']/ul[3]/li[1]/span/a/div/label/input"));
		if(!chkBox.isSelected())
		{
			chkBox.click();
		}
	}

	@Then("^results are filtered$")
	public void results_are_filtered() throws Throwable {
		 Thread.sleep(5000);
		assertEquals(driver.findElement(By.cssSelector("div.sg-col-inner a:nth-of-type(2)")).getText(), 
				  "Paperback");
	}

	@When("^user sorts using price$")
	public void user_sorts_using_price() throws Throwable {
	  driver.findElement(By.cssSelector(".a-dropdown-label")).click();
	  List<WebElement> sorts = driver.findElements(By.cssSelector("ul.a-nostyle.a-list-link li a"));
	  for(WebElement s : sorts)
	  {
		  if(s.getText().equals("Price: Low to High"))
		  {
			  s.click();
		  }
	  }
	}

	@Then("^results are sorted$")
	public void results_are_sorted() throws Throwable {
	  System.out.println("done");
	}

}
