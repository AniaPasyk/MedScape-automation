package pages;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WelcomePage extends BasePageObject {


    @FindBy(xpath = "//span[text()=' More ']")
    private WebElement moreButton;

    @FindBy(xpath = "//button[@class='mat-focus-indicator navbar__button mat-stroked-button mat-button-base']/span[text()=' Logout ']")
    private WebElement logOutButton;

    @FindBy(xpath = "//span[text()=' General ']")
    private WebElement generalMenu;

    @FindBy(xpath = "//div[text()='Devices']")
    private WebElement devicesMenu;


    public WelcomePage(WebDriver driver, Logger log) {
        super(driver, log);

    }

    public DevicesPage goToDevices() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(generalMenu));
        generalMenu.click();
        wait.until(ExpectedConditions.elementToBeClickable(devicesMenu));
        devicesMenu.click();
        log.info("Devices menu successfully opened");
        return new DevicesPage(driver, log);
    }


    public LoginPage logOut() {
        logOutButton.click();
        log.info("Logout successfully executed");
        return new LoginPage(driver, log);
    }

    public WebElement getMoreButton() {
        log.info("Login successfully executed");
        return moreButton;
    }

}
