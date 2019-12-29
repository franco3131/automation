package drivers;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class driverSetup  {

    public WebDriver driver;

    @BeforeEach
    public void beforeSuite() throws Exception{
        //System.setProperty("headless", "false"); // You can set this property elsewhere
        //String headless = System.getProperty("headless");
        

        //if("true".equals(headless)) {
          //  ChromeOptions chromeOptions = new ChromeOptions();
        //    chromeOptions.addArguments("--headless");
      //      driver = new ChromeDriver(chromeOptions);
      //  } else {
            System.setProperty("webdriver.chrome.driver", "WebDriver/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
          
      
        //}
    }

    @AfterEach
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