package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait;

import BasePages.BasePage;


public class HomePage extends BasePage {

	
	   public HomePage(WebDriver driver) {
	        super(driver);
	    }
	   

	    //*********Page Variables*********
	    String baseURL = "https://classcalc.com/scientific-calculator";
	 

	 
	 
	    //*********Page Methods*********
	    //Go to Homepage
	    public HomePage goToURL (){
	        driver.get(baseURL);
	        return this;
	    }
	 
}
