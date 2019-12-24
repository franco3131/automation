package BasePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivers.driverSetup;

public class BasePage {

    private static final int TIMEOUT = 5;
    private static final int POLLING = 100;

    protected WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT), this);
        wait = new WebDriverWait(driver,15);
    }
    public void waitUntilElementIsDisplayed(WebElement element) throws Exception{
    	   WebDriverWait wait = new WebDriverWait(driver,30);
		   wait.until(ExpectedConditions.visibilityOf(element));
    }


}