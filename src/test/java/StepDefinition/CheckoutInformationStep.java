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

public class CheckoutInformationStep {
    CheckoutInformationPage checkoutInformationPage = new CheckoutInformationPage();
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    public CheckoutInformationStep() {
        this.driver = (AndroidDriver<MobileElement>) DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, 15);
    }

    @And("And User fills checkout information with first name {string}, last name {string}, and zip postal {string}")
    public void user_filled_checkout_information(String firstName, String lastName, String zipPostal) {
        checkoutInformationPage.inputFirstName(firstName);
        checkoutInformationPage.inputLastName(lastName);
        checkoutInformationPage.inputZipPostal(zipPostal);
        checkoutInformationPage.clickContinueButton();
    }
}
