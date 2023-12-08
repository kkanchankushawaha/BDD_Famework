package com.envision.ui.automation.configuration;

import com.envision.ui.automation.utilities.ReadInputDetails;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BrowserFactory {

    private WebDriver driver;

    public WebDriver getDriverInstance() {

        return this.driver;
    }

    @Before
    public void launchBrowser(Scenario scenario) {
        ReadInputDetails readData = new ReadInputDetails();
        String brname = readData.readPropertiesFile("src/test/resources/Properties/config.properties", "brname");

        switch (brname) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "driverexecutables/chromedriver.exe");
                this.driver = new ChromeDriver();
                break;
            case "firefox":
                this.driver = new FirefoxDriver();
                break;
            case "edge":
                //System.setProperty("webdriver.edge.driver", "driverexecutables/msedgedriver.exe");
                this.driver = new EdgeDriver();
                break;
            default:
                break;
        }
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        this.driver.manage().window().maximize();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (this.driver != null) ;
        this.driver.close();
        this.driver.quit();
    }
}
