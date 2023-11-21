package test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.DevicesPage;
import pages.LoginPage;
import pages.WelcomePage;
import static org.assertj.core.api.Assertions.assertThat;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {


    @Test
    public void logIn() {
        WebElement moreButton = new LoginPage(driver, log)
                .logIn()
                .getMoreButton();
        assertThat(moreButton.isDisplayed()).withFailMessage("Log Out button is not displayed");


        new WelcomePage(driver, log)
                .goToDevices()
                .uncheckDefaultSpecialty()
                .selectSpecialty()
                .logSelectedCountry()
                .logCountryInTheTitle(); //możemy wywołyuwać bo mamy w metodahc "return this;"




      // assertThat(countryInTheTitleOfTheChart.getText()).contains("FR");
       //chce porówać dwie wartośći



//        assertThat(commonElements.FEEDBACK_WRAPPER.getAttribute("class"))
//                .withFailMessage("Adding new Product failed. " +
//                        "\n Actual Feedback message: " + commonElements.FEEDBACK_WRAPPER.getAttribute("class") +
//                        "\n Expected Feedback message: Feedback_Message_Success")
//                .isEqualTo("Feedback_Message_Success");



       // assertThat(countryInTheTitleOfTheChart.getText().isEqualTo(selectedCountry.getText());





        //todo albo zrobić asercje na coś w stylu:
        //todo  assertThat(commonElements.FEEDBACK_WRAPPER.getCssValue("background-color")).isEqualTo(commonElements.colorWrapperGreen);
        //todo zrobić asercje na prawidłowość wybranego kraju, specialty









    }
}
