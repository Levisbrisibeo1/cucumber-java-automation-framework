package drivers;

import drivers.strategies.DriverStrategy;
import drivers.strategies.DriverStrategyImplementer;
import org.openqa.selenium.WebDriver;
import utils.Constants;

import java.time.Duration;

public class DriverSingleton {
    private static DriverSingleton instance = null;
    private static WebDriver driver;

    private DriverSingleton(String driver){
        instantiate(driver);
    }

    public WebDriver instantiate(String strategy){
        DriverStrategy driverStrategy = DriverStrategyImplementer.chooseStrategy(strategy);
        driver = driverStrategy.setStrategy();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        return driver;
    }

    public static DriverSingleton getInstance(String driver){
        if (instance == null){
            instance = new DriverSingleton(driver);
        }
        return instance;
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static void closeObjectInstance(){
        instance = null;
        driver.quit();
    }
}
