package page;
import org.openqa.selenium.WebDriver;


import BasePages.BasePage;


public class HomePage extends BasePage {

	
	   public HomePage(WebDriver driver) {
	        super(driver);
	    }
	   

	    //*********Page Variables*********
	    String baseURL = "http://calculator.pro/";
	 

	 
	 
	    //*********Page Methods*********
	    //Go to Homepage
	    public HomePage goToURL (){
	        driver.get(baseURL);
	        return this;
	    }
	 
}
