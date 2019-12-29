package page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



import BasePages.BasePage;


public class numberButton extends BasePage {
@FindBy(css = "button[value='1']")
public WebElement buttonNumber1;
@FindBy(css = "button[value='2']")
public WebElement buttonNumber2;
@FindBy(css = "button[value='3']")
public WebElement buttonNumber3;
@FindBy(css = "button[value='4']")
public WebElement buttonNumber4;
@FindBy(css = "button[value='5']")
public WebElement buttonNumber5;
@FindBy(css = "button[value='6']")
public WebElement buttonNumber6;
@FindBy(css = "button[value='7']")
public WebElement buttonNumber7;
@FindBy(css = "button[value='8']")
public WebElement buttonNumber8;
@FindBy(css = "button[value='9']")
public WebElement buttonNumber9;
	//wait waiting=new wait();
	
	   public numberButton(WebDriver driver) {
	        super(driver);
	    }
	   
	   public void click1Button() throws Exception{
		   waitUntilElementIsDisplayed(buttonNumber1);
		   buttonNumber1.click();
	   }
	   public void click2Button() throws Exception{
		   waitUntilElementIsDisplayed(buttonNumber2);
		   buttonNumber2.click();
	   }
	   public void click3Button() throws Exception{
		   waitUntilElementIsDisplayed(buttonNumber3);
		   buttonNumber3.click();
	   }
	   public void click4Button() throws Exception{
		   waitUntilElementIsDisplayed(buttonNumber4);
		   buttonNumber4.click();
	   }
	   public void click5Button() throws Exception{
		   waitUntilElementIsDisplayed(buttonNumber5);
		   buttonNumber5.click();
	   }
	   public void click6Button() throws Exception{
		   waitUntilElementIsDisplayed(buttonNumber6);
		   buttonNumber6.click();
	   }
	   public void click7Button() throws Exception{
		   waitUntilElementIsDisplayed(buttonNumber7);
		   buttonNumber7.click();
	   }
	   public void click8Button() throws Exception{
		   waitUntilElementIsDisplayed(buttonNumber8);
		   buttonNumber8.click();
	   }
	   public void click9Button() throws Exception{
		   waitUntilElementIsDisplayed(buttonNumber9);
		   buttonNumber9.click();
	   }
}
