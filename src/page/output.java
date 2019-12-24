package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.gargoylesoftware.htmlunit.javascript.host.Document;

import BasePages.BasePage;

public class output extends BasePage {
	@FindBy(css = "input[type=text]")
	public WebElement output;
	@FindBy(css = "#result")
	public WebElement equalButton;
	
	   public output(WebDriver driver) {
	        super(driver);
	    }
	   
	 public String getOutputText() throws Exception{
		   waitUntilElementIsDisplayed(output);
		  
		   return output.getAttribute("value");
	 }
	   public void clickEqual() throws Exception{
		   waitUntilElementIsDisplayed(equalButton);
		   equalButton.click();
	   }
	  
	  
}
