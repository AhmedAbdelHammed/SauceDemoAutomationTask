package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverSingleton {
    private WebDriver driver;
    private static WebDriverSingleton webDriverSingleton = null;
    PropertiesReader propertiesReader;

    private WebDriverSingleton(){
        propertiesReader = new PropertiesReader();
        ChromeOptions options = new ChromeOptions();
        if(propertiesReader.runHeadless() == true) options.addArguments("--headless");
        WebDriverManager.chromedriver().clearDriverCache();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);

    }

    public static WebDriverSingleton getInstance(){
        if(webDriverSingleton == null){
            webDriverSingleton = new WebDriverSingleton();
        }
        return webDriverSingleton;
    }
    public WebDriver getDriver(){
        return driver;
    }
}
