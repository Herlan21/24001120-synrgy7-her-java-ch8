package AppiumMobileTest.page;

import AppiumMobileTest.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BaseTest {

    private final AndroidDriver driver;

    public HomePage(AndroidDriver driver) {
        this.driver = driver;
    }

    // Locator
    By productBanner = By.xpath("//android.widget.TextView[@text='PRODUCTS']");
    By filterButton = AppiumBy.accessibilityId("test-Modal Selector Button");
    By itemSortList = By.xpath("//android.widget.ScrollView[@content-desc='Selector container']");
    By lowToHigh = By.xpath("//android.widget.TextView[@text='Price (low to high)']");
    By itemPrice = By.xpath("//android.widget.TextView[@content-desc='test-Price' and @text='$7.99']");
    By item1 = By.xpath("(//android.view.ViewGroup[@content-desc='test-ADD TO CART'])[1]");
    By item2= By.xpath("(//android.view.ViewGroup[@content-desc='test-ADD TO CART'])[2]");
    By shoppingCart = By.xpath("//android.view.ViewGroup[@content-desc='test-Cart']");
    By checkoutButton = AppiumBy.accessibilityId("test-CHECKOUT");

    public void swipeToElementWithText(String text) {
        driver.findElement(
                new AppiumBy.ByAndroidUIAutomator(
                        String.format(
                                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"%s\"))", text)));
    }

    // Action Method
    public String productBannerDisplay(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(productBanner)).getText();
    }

    public void clickFilterButton(){
        wait.until(ExpectedConditions.elementToBeClickable(filterButton)).click();
    }

    public void clickLowToHigh(){
        wait.until(ExpectedConditions.elementToBeClickable(lowToHigh)).click();
    }

    public void clickShoppingCart(){
        wait.until(ExpectedConditions.elementToBeClickable(shoppingCart)).click();
    }

    public boolean setItemSortList(){
       return wait.until(ExpectedConditions.visibilityOfElementLocated(itemSortList)).isDisplayed();
    }

    public boolean verifyItemsSortedLowToHigh(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(itemPrice)).isDisplayed();
    }

    // Method to check if home page is displayed
//    public boolean isHomePageDisplayed() {
//        return wait.until(ExpectedConditions.visibilityOfElementLocated(productBanner)).isDisplayed();
//    }
}
