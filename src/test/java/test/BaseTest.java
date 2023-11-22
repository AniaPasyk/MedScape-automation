package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.DriverFactory;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;
    protected static Logger log = LogManager.getLogger();

    private String pageUrl = "XXXXXXXXX";

    @BeforeMethod
    public void openUrl() {
        driver = DriverFactory.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        log.info("Opening page " + pageUrl);
        driver.get(pageUrl);
        log.info("Page opened");
    }

   // @AfterMethod
   // public void tearDown() {
   //     driver.quit();
   //     log.info("Page closed");
  //  }
}
// driver.manage().window().maximize();