package page;

import StepDefinition.config.DriverFactory;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends DriverFactory {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    public LoginPage() {
        this.driver = (AndroidDriver<MobileElement>) DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, 15);
    }

    By loginTextBox = MobileBy.AccessibilityId("test-Username");
    By passwordTextBox = MobileBy.AccessibilityId("test-Password");
    By loginButton = MobileBy.AccessibilityId("test-LOGIN");
    By swagLabsLogo = MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(0)");
    By errorMessageLogin = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Username and password do not match any user in this service.\")");
    public void inputUsername(String username) {
        MobileElement usernameField = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(loginTextBox));
        usernameField.sendKeys(username);
    }

    public void inputPassword(String password) {
        MobileElement passwordField = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(passwordTextBox));
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        MobileElement loginButtonElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton));
        loginButtonElement.click();
    }

    public void swagLabsLogoIsDisplayed() {
        MobileElement swagLabsLogoElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(swagLabsLogo));
        swagLabsLogoElement.isDisplayed();
    }

    public void errorMessageLoginIsDisplayed() {
        MobileElement errorMessageLoginElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessageLogin));
        errorMessageLoginElement.isDisplayed();
    }
}