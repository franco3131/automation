package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BasePages.BasePage;

public class Adding extends BasePage {
	@FindBy(css = "button[id='plus']")
	public WebElement plusButton;
	
	   public Adding(WebDriver driver) {
	        super(driver);
	    }
	   
	   public int addTwoNumbers(int num1,int num2) throws Exception{
		   return num1+num2;
	   }
	   
	   public void clickPlusButton() throws Exception{
		   waitUntilElementIsDisplayed(plusButton);
		   plusButton.click();
	   }
	   
	 
}
