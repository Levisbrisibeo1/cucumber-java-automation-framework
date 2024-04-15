package drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Firefox implements DriverStrategy{
    @Override
    public WebDriver setStrategy() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("disable-infobars");
        return new FirefoxDriver(options);
    }
}
