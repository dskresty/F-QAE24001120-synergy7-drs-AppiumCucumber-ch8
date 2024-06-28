package page;

import StepDefinition.config.DriverFactory;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class HomePage {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    public HomePage() {
        this.driver = (AndroidDriver<MobileElement>) DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, 15);
    }

    By productText = MobileBy.xpath("//*[contains(@text, 'PRODUCTS')]");
    By sortButton = MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(5)");
    By sortButtonLoHi = MobileBy.xpath("//*[contains(@text, 'Price (low to high)')]");
    By itemPrice = MobileBy.xpath("//*[contains(@content-desc, 'test-Price')]");
    By firstItem = MobileBy.xpath("//*[contains(@text, 'ADD TO CART')]");
    By secondtItem = MobileBy.xpath("//*[contains(@text, 'ADD TO CART')]");
    By cartButton = MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(3)");
    public void productTextIsDisplayed() {
        MobileElement productTextElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(productText));
        productTextElement.isDisplayed();
    }

    public void clickSortButton() {
        MobileElement sortButtonElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(sortButton));
        sortButtonElement.click();
    }

    public void clickSortButtonLoHi() {
        MobileElement sortButtonLoHiElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(sortButtonLoHi));
        sortButtonLoHiElement.click();
    }

    public List<Double> verifyProductPrice() {
        List<Double> prices = new ArrayList<>();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(itemPrice));
        List<MobileElement> priceElements = driver.findElements(itemPrice);
        for (WebElement priceElement : priceElements) {
            String priceText = priceElement.getText().replace("$", "");
            System.out.println("Harga yang ditemukan: " + priceText);
            prices.add(Double.parseDouble(priceText));
        }
        return prices;
    }

    public void addFirstItem() {
        MobileElement firstItemElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(firstItem));
        firstItemElement.click();
    }

    public void addSecondItem() {
        MobileElement secondItemElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(secondtItem));
        secondItemElement.click();
    }

    public void clickCartButton() {
        MobileElement cartButtonElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(cartButton));
        cartButtonElement.click();
    }
}
