package AppiumMobileTest.page;

import AppiumMobileTest.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BaseTest {

    private AndroidDriver driver;

    // Constructor
    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
    }

    // Locator
    By usernameField = AppiumBy.accessibilityId("test-Username");
    By passwordField = AppiumBy.accessibilityId("test-Password");
    By loginButton = By.xpath("//android.view.ViewGroup[@content-desc='test-LOGIN']");
//    By errorMessage = By.xpath("//android.view.ViewGroup[@content-desc='test-Error message']");
    By errorMessage = By.xpath("//android.widget.TextView[@text='Username and password do not match any user in this service.']");

    public void validateLoginPage() {
        wait.until(ExpectedConditions.presenceOfElementLocated(usernameField));
        wait.until(ExpectedConditions.presenceOfElementLocated(passwordField));
        wait.until(ExpectedConditions.presenceOfElementLocated(loginButton));

//        driver.findElement(usernameField).isDisplayed();
//        driver.findElement(passwordField).isDisplayed();
//        driver.findElement(loginButton).isDisplayed();
    }

    // Method for Action
    public void inputUsername(String username) {
//        driver.findElement(usernameField).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField)).sendKeys(username);
    }

    public void inputPassword(String password) {
//        driver.findElement(passwordField).sendKeys(password);
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField)).sendKeys(password);
    }

    public void clickLoginButton() {
//        driver.findElement(loginButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton)).click();
    }

    public String getErrorMessage() {
//        driver.findElement(errorMessage).isDisplayed();
        return wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage)).getText();
    }
}
