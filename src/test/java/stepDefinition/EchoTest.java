package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.BrowserMethods;
import utility.WebElementMethods;

public class EchoTest {
	WebDriver driver;
	@Given("^user is on echo login page$")
	public void user_is_on_echo_login_page() throws Throwable {
	   driver = BrowserMethods.launchChrome("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
	}

	@When("^user enter valid userid and password$")
	public void user_enter_valid_userid_and_password() throws Throwable {
	    WebElementMethods.enterText(driver,By.id("txtCustomerID"), "testuser");
	    WebElementMethods.enterText(driver,By.id("txtPassword"), "test@user");
	    WebElementMethods.clickButton(driver, By.name("Butsub"));
	}

	@Then("^user is logged in$")
	public void user_is_logged_in() throws Throwable {
	   System.out.println("Done");
	   driver.close();
	}

	@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String usrname, String password) throws Throwable {
		 WebElementMethods.enterText(driver,By.id("txtCustomerID"), usrname);
		 WebElementMethods.enterText(driver,By.id("txtPassword"), password);
		 WebElementMethods.clickButton(driver, By.name("Butsub"));
	}
	
	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
		 WebElementMethods.enterText(driver,By.id("txtCustomerID"), username);
		 WebElementMethods.enterText(driver,By.id("txtPassword"), password);
		 WebElementMethods.clickButton(driver, By.name("Butsub"));
	}
	
	@When("^user enter valid credentails$")
	public void user_enter_valid_credentails(DataTable cred) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    List<List<String>> data = cred.raw();
	    WebElementMethods.enterText(driver,By.id("txtCustomerID"), data.get(0).get(0));
		WebElementMethods.enterText(driver,By.id("txtPassword"), data.get(0).get(1));
		WebElementMethods.clickButton(driver, By.name("Butsub"));
	}
	
	@When("^user enters valid credentails$")
	public void user_enters_valid_credentails(DataTable cred) throws Throwable {
		for(Map<String, String> data : cred.asMaps(String.class, String.class))
		{
		    WebElementMethods.enterText(driver,By.id("txtCustomerID"), data.get("username"));
			WebElementMethods.enterText(driver,By.id("txtPassword"), data.get("password"));
			WebElementMethods.clickButton(driver, By.name("Butsub"));
		}
	}
	
	@Given("^userid and password fileds are blank$")
	public void userid_and_password_fileds_are_blank() throws Throwable {
	   driver.findElement(By.id("txtCustomerID")).clear();
	   driver.findElement(By.id("txtPassword")).clear();
	}
}
