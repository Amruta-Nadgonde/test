package utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementMethods {
	
	//WebTextBox
	
	public static void enterText(WebDriver driver, By locator, String text)
	{
		try
		{
			WebElement textBox = driver.findElement(locator);
			if(textBox.isDisplayed())
			{
				textBox.sendKeys(text);
			}
			
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Element not present");
		}
	}
	
	
	//WebButton
	
	public static void clickButton(WebDriver driver, By locator)
	{
		try
		{
			WebElement button = driver.findElement(locator);
			if(button.isDisplayed())
			{
				button.click();
			}
			
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Element not present");
		}
	}
	
	//Checkbox
	public static void selectCheckBox(WebDriver driver, By locator, String option)
	{
		List<WebElement> checkBoxes = driver.findElements(locator);
		
		for(WebElement cb : checkBoxes)
		{
			String val = cb.getAttribute("value");
			
			if(val.equalsIgnoreCase(option)&& !cb.isSelected())
			{
				cb.click();
				break;
				
			}
			
		}
	}
	
	public static void selectCheckBox(WebDriver driver, By locator)
	{
		WebElement checkBox = driver.findElement(locator);
		
			if(!checkBox.isSelected())
			{
				checkBox.click();
							
			}
	}
	
	public static void selectRadioBtn(WebDriver driver, By locator, String option)
	{
		List<WebElement> radios = driver.findElements(locator);
		
		for(WebElement rb : radios)
		{
			String val = rb.getAttribute("value");
			
			if(val.equalsIgnoreCase(option)&& !rb.isSelected())
			{
				rb.click();
				break;
				
			}
			
		}
	}
	
	//Dropdown
	public static void selectDDItem(WebDriver driver, By locator, String item)
	{
		
		WebElement dropdown = driver.findElement(locator);
		Select dd = new Select(dropdown);
		
		dd.selectByValue(item);
	}


	public static void verifyTableCell(WebElement we, String rowData)
	{
		List<WebElement> rows = we.findElements(By.tagName("tr"));
		
		for(WebElement r : rows)
		{
			List<WebElement> cols = r.findElements(By.tagName("td"));
			
			for(WebElement c : cols)
			{
				if ((c.getText().equalsIgnoreCase(rowData)))
						{
							System.out.println("found");
							break;
						}
			}
		}
	}
	
	public static void verifyTableCell(WebDriver driver, String table, int r, int c ,String rowData)
	{
		
		WebElement tCell = driver.findElement(By.xpath(table+"/tr["+r+"]/td["+c+"]"));
		
		if(tCell.getText().trim().equals(rowData))
		{
			System.out.println("found");
		}
		
		
		else
			System.out.println("Not found");
	}
	
	
	
	//WebTable
	//For static table
	public static void verifyTableRow(WebDriver driver, By locator, int rowNum, String data)
	{
		boolean flag = false;
		WebElement table = driver.findElement(locator);
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		WebElement row = rows.get(rowNum);		
		List<WebElement> cols = row.findElements(By.tagName("td"));
		for(WebElement c : cols)
		{
			System.out.println(c.getText().trim());
			if(c.getText().trim().equals(data))
			{
				flag = true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("found");
		}
		else
			System.out.println("Not found");
		
		
		
	}
	
	public static void clickMenuItem(WebDriver driver, By mainMenu, By subMenu , String menuItem ) throws InterruptedException
	{
		WebElement menu = driver.findElement(mainMenu);
		
		Actions builder = new Actions(driver);
		
		builder.moveToElement(menu).perform();
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		
		List<WebElement> subMneus = driver.findElements(subMenu);
		wait.until(ExpectedConditions.visibilityOfAllElements(subMneus));
		
		for(WebElement sb : subMneus)
		{
			if(sb.getText().trim().equals(menuItem))
			{
				sb.click();
				break;
			}
		}
		
	}


	public static void clickLink(WebDriver driver, By linkText) {
		try
		{
			WebElement button = driver.findElement(linkText);
			if(button.isDisplayed())
			{
				button.click();
			}
			
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Element not present");
		}
	}
	
}