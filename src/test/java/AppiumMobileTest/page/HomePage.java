package AppiumMobileTest.page;

import AppiumMobileTest.BaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BaseTest {

// Locator
    By productBanner = By.xpath("//android.widget.TextView[@text='PRODUCTS']");
    By filterButton = AppiumBy.accessibilityId("test-Modal Selector Button");
    By itemSortList = By.xpath("//android.widget.ScrollView[@content-desc='Selector container']");
    By lowToHigh = By.xpath("//android.widget.TextView[@text='Price (low to high)']");

    public void validateOnPage() {
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.accessibilityId("test-Cart")));
    }

    public void swipeToElementWithText(String text) {
        driver.findElement(
                new AppiumBy.ByAndroidUIAutomator(
                        String.format(
                                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"%s\"))",
                                text)));
    }

// Action Method
    public void productBannerDisplay(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(productBanner)).getText();
    }

    public void clickFilterButton(){
        wait.until(ExpectedConditions.elementToBeClickable(filterButton)).click();
    }

    public void setItemSortList(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(itemSortList));
    }

    public void itemLowHigh(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(lowToHigh));
    }
}


