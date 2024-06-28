package page;

import StepDefinition.config.DriverFactory;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class CheckoutCompletePage {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    public CheckoutCompletePage() {
        this.driver = (AndroidDriver<MobileElement>) DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, 15);
    }

    By completeText = MobileBy.xpath("//*[contains(@text, 'CHECKOUT: COMPLETE!')]");
    By thankYouText = MobileBy.xpath("//*[contains(@text, 'THANK YOU FOR YOU ORDER')]");
    By aboutOrderText = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Your order has been dispatched, and will arrive just as fast as the pony can get there!\")");
    By logoSauceLabs = MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(4)");
    By backHomeButton = MobileBy.xpath("//*[contains(@text, 'BACK HOME')]");

    public void completeTextIsDisplayed() {
        WebElement completeTextElement = wait.until(ExpectedConditions.visibilityOfElementLocated(completeText));
        completeTextElement.isDisplayed();
    }

    public void thankYouTextIsDisplayed() {
        WebElement thankYouTextElement = wait.until(ExpectedConditions.visibilityOfElementLocated(thankYouText));
        thankYouTextElement.isDisplayed();
    }

    public void aboutOrderTextIsDisplayed() {
        WebElement aboutOrderTextElement = wait.until(ExpectedConditions.visibilityOfElementLocated(aboutOrderText));
        aboutOrderTextElement.isDisplayed();
    }

    public void logoSauceLabsIsDisplayed() {
        WebElement logoSauceLabsElement = wait.until(ExpectedConditions.visibilityOfElementLocated(logoSauceLabs));
        logoSauceLabsElement.isDisplayed();
    }

    public void backHomeButtonIsDisplayed() {
        WebElement backHomeButtonElement = wait.until(ExpectedConditions.visibilityOfElementLocated(backHomeButton));
        backHomeButtonElement.isDisplayed();
    }
}
