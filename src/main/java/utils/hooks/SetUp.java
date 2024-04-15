package utils.hooks;

import io.cucumber.java.*;
import drivers.DriverSingleton;
import org.jsoup.Connection;
import org.openqa.selenium.WebDriver;
import pages.BaseClass;
import utils.FrameworkProperties;

import java.io.IOException;

public class SetUp extends BaseClass{
    Scenario scenario;
    static FrameworkProperties frameworkProperties = new FrameworkProperties();

    @BeforeAll
    public static void setDriver() {
        try {
            DriverSingleton driverSingleton = DriverSingleton.getInstance(frameworkProperties.getProperty("browser"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        BaseClass.driver = DriverSingleton.getDriver();
    }

    @Before
    public static void clearCookies() {
        driver.navigate().refresh();
        driver.manage().deleteAllCookies();
    }

    @Before
    public void getScenarioDetails(Scenario scenario) {
        this.scenario = scenario;
    }

}
