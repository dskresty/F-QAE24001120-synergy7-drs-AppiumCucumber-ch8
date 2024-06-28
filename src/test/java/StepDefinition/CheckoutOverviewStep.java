package StepDefinition;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import StepDefinition.config.DriverFactory;
import page.CheckoutInformationPage;
import page.CheckoutOverviewPage;

public class CheckoutOverviewStep {
    CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage();
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    public CheckoutOverviewStep() {
        this.driver = (AndroidDriver<MobileElement>) DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, 15);
    }

    @And("User click finish button")
    public void user_click_finish_button() {
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)");
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)");
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)");
        checkoutOverviewPage.clickFinishButton();
    }
}
