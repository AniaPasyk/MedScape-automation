package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;

public class BasePageObject {

    protected WebDriver driver;
    protected static Logger log = LogManager.getLogger();
    protected WebDriverWait wait;

    protected BasePageObject(WebDriver driver, Logger log){
        this.driver = driver;
        this.log = log;
        PageFactory.initElements(driver, this);
    }



    }




