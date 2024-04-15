package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class BaseClass {

    public static WebDriver driver;

    public Wait<WebDriver> wait = new FluentWait<>(driver)
            .withTimeout(Duration.ofSeconds(60L))
            .pollingEvery(Duration.ofSeconds(1L));

    public void goTo(String url) {
        driver.get(url);
    }

    public void clickOnElement(By e) {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(e))).click();
    }

    public String getPageTitle(By e) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(e)).getText();
    }

    public String getValueOfElementAttribute(By e, String attribute) {
        WebElement element = driver.findElement(e);
        return element.getAttribute(attribute);
    }

    public void hoverOverElement(By e){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(e)).perform();
    }
}
