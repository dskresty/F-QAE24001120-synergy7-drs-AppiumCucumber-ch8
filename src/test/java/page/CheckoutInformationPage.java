package page;

import StepDefinition.config.DriverFactory;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutInformationPage {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    public CheckoutInformationPage() {
        this.driver = (AndroidDriver<MobileElement>) DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, 15);
    }

    By firstName = MobileBy.AccessibilityId("test-First Name");
    By zipPostal = MobileBy.AccessibilityId("test-Zip/Postal Code");
    By lastName = MobileBy.AccessibilityId("test-Last Name");
    By continueButton = MobileBy.xpath("//*[contains(@text, 'CONTINUE')]");

    public void inputFirstName(String firstname) {
        MobileElement firstNameElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(firstName));
        firstNameElement.sendKeys(firstname);
    }

    public void inputLastName(String lastname) {
        MobileElement lastNameElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(lastName));
        lastNameElement.sendKeys(lastname);
    }

    public void inputZipPostal(String zippostal) {
        MobileElement zipPostalElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(zipPostal));
        zipPostalElement.sendKeys(zippostal);
    }

    public void clickContinueButton() {
        MobileElement continueButtonElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(continueButton));
        continueButtonElement.click();
    }
}
