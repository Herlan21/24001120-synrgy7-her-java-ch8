package AppiumMobileTest.page;

import AppiumMobileTest.BaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BaseTest {

// Locator
    By productBanner = By.xpath("//android.widget.TextView[@text='PRODUCTS']");

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


}


