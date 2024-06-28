package StepDefinition;

import StepDefinition.config.DriverFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.HomePage;
import page.LoginPage;
import page.YourCartPage;
public class YourCartStep {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    YourCartPage yourCartPage = new YourCartPage();
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    public YourCartStep() {
        this.driver = (AndroidDriver<MobileElement>) DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, 15);
    }

    @And("User click on checkout button")
    public void user_click_on_checkout_button() {
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)");
        yourCartPage.clickCheckoutButton();
    }
}
