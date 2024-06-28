package page;

import StepDefinition.config.DriverFactory;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YourCartPage {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    public YourCartPage() {
        this.driver = (AndroidDriver<MobileElement>) DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, 15);
    }

    By checkoutButton = MobileBy.xpath("//*[contains(@text, 'CHECKOUT')]");

    public void clickCheckoutButton() {
        MobileElement checkoutButtonElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(checkoutButton));
        checkoutButtonElement.click();
    }
}
