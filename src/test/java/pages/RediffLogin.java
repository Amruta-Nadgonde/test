package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLogin {
	static String url = "https://mail.rediff.com/cgi-bin/login.cgi";
	@FindBy(id = "login1")
	WebElement txtUsername;
	
	@FindBy(id="password")
	WebElement txtPassword;
	
	@FindBy(name="proceed")
	WebElement btnLogin;
	
	@FindBy(linkText = "Create a new account")
	WebElement lnkCreateAcc;
	
	@FindBy(xpath ="//div[@class='login-form']/div[1]")
	WebElement lblError;
	
	public RediffLogin()
	{
		PageFactory.initElements(Browser.driver(), this);
	}
	
	public void open()
	{
		Browser.open(url);
	}
	
	public void close()
	{
		Browser.close();
	}
	public void login(String uid, String pass)
	{
		txtUsername.sendKeys(uid);
		txtPassword.sendKeys(pass);
		btnLogin.click();
	}
	public void goToReg()
	{
		lnkCreateAcc.click();
	}
	
	public void chkError(String exp)
	{
		if(lblError.getText().equals(exp))
		{
			System.out.println("pass");
		}
	}
}
