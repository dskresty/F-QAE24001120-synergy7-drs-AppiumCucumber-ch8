package page;

import StepDefinition.config.DriverFactory;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class CheckoutOverviewPage {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    public CheckoutOverviewPage() {
        this.driver = (AndroidDriver<MobileElement>) DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, 15);
    }

    By finishButton = MobileBy.xpath("//*[contains(@text, 'FINISH')]");

    public void clickFinishButton() {
        MobileElement finishButtonElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(finishButton));
        finishButtonElement.click();
    }
}
