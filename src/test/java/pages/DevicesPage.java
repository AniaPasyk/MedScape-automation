package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static utils.SleepThread.sleep;

public class DevicesPage extends BasePageObject {

   // private WebDriver driver;
   // private static Logger log = LogManager.getLogger();
  //  WebDriverWait wait;

    @FindBy(id = "mat-select-2")
    private WebElement selectSpecialtyFilter;

    @FindBy(id = "mat-option-10")
    private WebElement allSpecialty;

    @FindBy(xpath = "//span[text()=' specialty ']")
    private WebElement specialty;
    // $x("//*[@id='mat-option-12']/span[text()=' specialty ']"); - xpath na specialty

    @FindBy(tagName = "body")
    private WebElement body;

    @FindBy(xpath = "//span[text()=' Search ']")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@class='highcharts-subtitle']//text()[2]")
    private WebElement countryInTheTitleOfTheChart;

    @FindBy(xpath = "//*[@class='highcharts-subtitle']//text()[3]")
    private WebElement dateInTheTitleOfTheChart;

    @FindBy(xpath = "//*[@class='highcharts-subtitle']//text()[1]")
    private WebElement specialtyInTheTitleOfTheChart; //ale nie wiem czy dobry xpath

    @FindBy(xpath = "//*[@id='mat-select-value-3']")
    private WebElement selectedSpecialtyName;

    @FindBy(xpath = "//*[@id='mat-select-value-1']/span/span")
    private WebElement selectedCountry;


    public DevicesPage(WebDriver driver, Logger log) {
        super(driver,log);
        //PageFactory.initElements(driver, this);
    }

    public DevicesPage uncheckDefaultSpecialty() {
        selectSpecialtyFilter.click();
        log.info("Select Specialty filter has been expanded");
        allSpecialty.click();
        log.info("Default value 'all' - unchecked");
        return this;


    }

    public DevicesPage selectSpecialty() {
        specialty.click();
        log.info("'specialty' successfully selected ");
        body.click();
        searchButton.click();
        log.info("'Search' button has been clicked");
        sleep(30000);
        return this;
    }


   // public WebElement getCountryInTheTitleOfTheChart() {
       // return countryInTheTitleOfTheChart.getText();

 //   }




    public void checkCorrectnessNameOfSpecialty() {
       // wait = new WebDriverWait(driver, Duration.ofSeconds(30));

       // wait.until(ExpectedConditions.visibilityOf(specialtyInTheTitleOfTheChart));
        sleep(30000);
        String specialtyChartTitle = specialtyInTheTitleOfTheChart.getText();
        String selectedSpecialty = selectedSpecialtyName.getText();

        if (specialtyChartTitle.equalsIgnoreCase(selectedSpecialty)) {
            System.out.println("Name of title is " + specialtyChartTitle
                    + " is the same as selected specialty "
                    + selectedSpecialty);
        } else {
            System.out.println("Texts doesn't equals");

        }
    }

    public void checkCorrectnessSelectedCountry() {
        // wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        // wait.until(ExpectedConditions.visibilityOf(specialtyInTheTitleOfTheChart));
        sleep(30000);
       // String countryInTheChartTitle = countryInTheTitleOfTheChart.getText();
        //String selectedCountry1 = selectedCountry.getText();

        if (countryInTheTitleOfTheChart.getText()==selectedCountry.getText()) {
            System.out.println("Name of title is " + selectedCountry.getText()
                    + " is the same as selected specialty "
                    + countryInTheTitleOfTheChart.getText());
        } else {
            System.out.println("Texts doesn't equals");

        }
    }

    public void logGetTextSelectedCountry() {
        System.out.println("Text got: " + selectedCountry.getText());
    }

    public void logGetTitleCountryName() {
        System.out.println("Text got: " + countryInTheTitleOfTheChart.getText());
    }

    public DevicesPage logSelectedCountry() {
        selectedCountry.getText();
        return this; //jeśli używamy this to możemy wywoływać w teście metody po kropce
        //bo zwracamy ten page object i używamy wciąż tych metod co w tym page objecie
    }

    public WebElement  getTextTitleCountry() {
        return selectedCountry;
    }

    public DevicesPage logCountryInTheTitle() {
        countryInTheTitleOfTheChart.getText();
        log.info(countryInTheTitleOfTheChart.getText());
        return this; //jeżeli w tej metodzie chcemy zwrócić bieżący obiekt
    }

}



