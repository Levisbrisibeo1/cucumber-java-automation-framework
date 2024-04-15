package utils.hooks;

import drivers.DriverSingleton;
import io.cucumber.java.AfterAll;

public class TearDown {

    @AfterAll
    public static void closeBrowser() {
        DriverSingleton.closeObjectInstance();
    }
}
