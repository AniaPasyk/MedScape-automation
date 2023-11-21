package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

    public static WebDriver getDriver() {
        ChromeOptions chromeOptions = new ChromeOptions(); //tworze opcje przeglądarki za pomocą kontruktora ChromeOption

        chromeOptions.addArguments(
                "--ignore-certificate-errors",
                "--start-maximized",
                "--incognito",
                "--ignore-certificate-errors");

       return new ChromeDriver(chromeOptions);


    }
}

//WebDriverManager.chromedriver().setup();
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments(new String[]{"--incognito"});
//        chromeOptions.addArguments(new String[]{"window-size=1980,1080"});
//        this.driver = new ChromeDriver(chromeOptions);

//    public static WebDriver getDriver() {
//        WebDriverManager.chromedriver().setup(); //rozwiązuje wymagany sterownik
//        System.setProperty("webdriver.http.factory", "jdk-http-client");
//
//        ChromeOptions chromeOptions = new ChromeOptions(); //tworze opcje przeglądarki za pomocą kontruktora ChromeOption
//        //chromeOptions.addArguments("--headless"); //aktywuje tryb bezinterfejsowy
//        chromeOptions.addArguments("--incognito");
//
//        return new ChromeDriver();

//ChromeOptions chromeOptions = new ChromeOptions(); //tworze opcje przeglądarki za pomocą kontruktora ChromeOption
//chromeOptions.addArguments("--headless"); //aktywuje tryb bezinterfejsowy

//    ChromeOptions chromeOptions = new ChromeOptions(); //tworze opcje przeglądarki za pomocą kontruktora ChromeOption
//
//        chromeOptions.addArguments(
//                "--incognito",
//                // "--window-size=2048,1536",
//                //  "--no-default-browser-check",
//                "--ignore-certificate-errors");
//                //  "--disable-popup-blocking",
//                // "--disable-dev-shm-usage",
//                //  "--no-sandbox");
//
//                return new ChromeDriver(chromeOptions);