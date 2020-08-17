package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffReg {
	@FindBy(css="#tblcrtac tbody tr:nth-of-type(3) td:nth-of-type(3) input")
	 WebElement txtname;
	
	public RediffReg() {
		
		PageFactory.initElements(Browser.driver(), this);
	}

	public void register(String name)
	{
		txtname.sendKeys(name);
		
	}
}
