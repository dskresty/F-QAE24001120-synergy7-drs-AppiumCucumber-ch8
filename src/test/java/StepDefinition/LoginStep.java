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
import page.HomePage;
import page.LoginPage;

public class LoginStep extends DriverFactory {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    public LoginStep() {
        this.driver = (AndroidDriver<MobileElement>) DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, 15);
    }

    @When("User is on login page")
    public void user_is_on_login_page() {
        loginPage.swagLabsLogoIsDisplayed();
    }

    @And("User input {string} as username")
    public void user_input_username(String username) {
        loginPage.inputUsername(username);
    }

    @And("User input {string} as password")
    public void user_input_password(String password) {
        loginPage.inputPassword(password);
    }

    @When("User click on login button")
    public void user_click_on_login_button() {
        loginPage.clickLoginButton();
    }

    @And("User input {string} as invalid username")
    public void user_input_invalid_username(String username) {
        loginPage.inputUsername(username);
    }

    @And("User input {string} as invalid password")
    public void user_input_invalid_password(String password) {
        loginPage.inputPassword(password);
    }

    @Then("User gets an error message")
    public void user_gets_an_error_message() {
        loginPage.errorMessageLoginIsDisplayed();
    }
}
