package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "classpath:features", glue = {"steps","utils/hooks"},
        tags = "not @ignore",
        plugin = {"pretty", "html:target/html_report.html"}
)

public class Runner extends AbstractTestNGCucumberTests {
}
