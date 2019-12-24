package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class driverSetup {

    public WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        //System.setProperty("headless", "false"); // You can set this property elsewhere
        //String headless = System.getProperty("headless");
        

        //if("true".equals(headless)) {
          //  ChromeOptions chromeOptions = new ChromeOptions();
        //    chromeOptions.addArguments("--headless");
      //      driver = new ChromeDriver(chromeOptions);
      //  } else {
            System.setProperty("webdriver.chrome.driver", "WebDriver/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        //}
    }

    @AfterSuite
    public void afterSuite() {
        if(null != driver) {
            driver.close();
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}