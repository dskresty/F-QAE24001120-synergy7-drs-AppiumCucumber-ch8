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
import page.CheckoutCompletePage;
public class CheckoutCompleteStep {
    CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage();
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    public CheckoutCompleteStep() {
        this.driver = (AndroidDriver<MobileElement>) DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, 15);
    }

    @Then("User successfully checkout product")
    public void user_successfully_checkout_product() {
        //assert complete order Page
        checkoutCompletePage.completeTextIsDisplayed();
        checkoutCompletePage.thankYouTextIsDisplayed();
        checkoutCompletePage.aboutOrderTextIsDisplayed();
        checkoutCompletePage.logoSauceLabsIsDisplayed();
        checkoutCompletePage.backHomeButtonIsDisplayed();
    }
}
