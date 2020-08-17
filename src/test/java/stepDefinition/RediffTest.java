package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.RediffLogin;
import pages.RediffReg;

public class RediffTest {

	RediffLogin rLogin;
	RediffReg rReg;
	@Given("^User is on rediff login page$")
	public void user_is_on_rediff_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDownloads\\chromedriver_win32\\chromedriver.exe");
		rLogin = new RediffLogin();
		rReg = new RediffReg();
		rLogin.open();
	}

	@When("^user enters invalid credentials$")
	public void user_enters_invalid_credentials() throws Throwable {
	   rLogin.login("amruta", "amruta");
	}

	@Then("^user is displayed with error$")
	public void user_is_displayed_with_error() throws Throwable {
	   rLogin.chkError("Wrong username and password combination.");
	}

	@When("^user clicks on create new account$")
	public void user_clicks_on_create_new_account() throws Throwable {
	   rLogin.goToReg();
	}

	@Then("^user is navigated to registarion page$")
	public void user_is_navigated_to_registarion_page() throws Throwable {
		System.out.println("done");
	}
	
	@Given("^User is directed to registraion page$")
	public void user_is_directed_to_registraion_page() throws Throwable {
		 rLogin.goToReg();
	}

	@When("^user enters valid data$")
	public void user_enters_valid_data() throws Throwable {
	   rReg.register("amruta");
	}

	@Then("^user is registred$")
	public void user_is_registred() throws Throwable {
	   System.out.println("Done");
	}
}
