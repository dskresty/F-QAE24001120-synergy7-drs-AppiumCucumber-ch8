package StepDefinition;

import StepDefinition.config.DriverFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.HomePage;
import page.LoginPage;

public class HomeStep {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    public HomeStep() {
        this.driver = (AndroidDriver<MobileElement>) DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, 15);
    }

    @Then("User is on home page")
    public void user_is_on_home_page() {
        homePage.productTextIsDisplayed();
    }

    @Given("User click sorting items button")
    public void user_click_sorting_items_button() {
        homePage.clickSortButton();
    }

    @When("User choose low to high button")
    public void user_choose_low_to_high_button() {
        homePage.clickSortButtonLoHi();
    }

    @Then("Items on home page will be sorted from low to high")
    public void items_on_home_page_will_be_sorted_from_low_to_high() {
        homePage.verifyProductPrice();
    }

    @Given("User add two products to cart")
    public void user_add_two_products_to_cart() {
        homePage.addFirstItem();
        homePage.addSecondItem();
    }

    @When("User click cart button")
    public void user_click_checkout_button() {
        homePage.clickCartButton();
    }
}
