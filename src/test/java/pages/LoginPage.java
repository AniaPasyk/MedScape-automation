package pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestArguments;

public class LoginPage extends BasePageObject {

    @FindBy(id = "mat-input-0")
    private WebElement userNameInput;

    @FindBy(id = "mat-input-1")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@class='mat-focus-indicator login__button mat-raised-button mat-button-base']" )
    private WebElement loginButton;


    public LoginPage(WebDriver driver, Logger log) {
        super(driver, log);

    }


    public WelcomePage logIn() {
        TestArguments.getUsername();
        userNameInput.sendKeys(TestArguments.getUsername());
        passwordInput.sendKeys(TestArguments.getPassword());
        loginButton.click();
        //log.info("Login successfully executed");
        return new WelcomePage(driver, log);
    }




}
