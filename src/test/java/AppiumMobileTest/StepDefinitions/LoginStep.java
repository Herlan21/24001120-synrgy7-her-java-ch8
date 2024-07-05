package AppiumMobileTest.StepDefinitions;

import AppiumMobileTest.BaseTest;
import AppiumMobileTest.page.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import static org.testng.Assert.assertEquals;

public class LoginStep extends BaseTest {

    private LoginPage loginPage;

    // Initialize Driver
    @Before
    public void setup(){
        setupDriver();
    }

    @After
    public void tearDown(){
        resetApp();
    }

    // Steps
    @Given("user is launch app")
    public void userIsLaunchApp() {
    }

    @And("user is on login page")
    public void userIsOnLoginPage() {
        loginPage = new LoginPage(driver);
        loginPage.validateLoginPage(); // Ensure the login page is fully loaded
    }

    @And("user input username with {string}")
    public void userInputUsername(String username) {
        loginPage.inputUsername(username);
    }

    @And("user input password with {string}")
    public void userInputPasswordWithPassword(String password) {
        loginPage.inputPassword(password);
    }

    @When("user click on login button")
    public void userClickOnLoginButton() {
        loginPage.clickLoginButton();
    }

    @And("user able to see message {string}")
    public void userAbleToSeeMessageMessage(String message) {
        assertEquals(loginPage.getErrorMessage(), message);
    }
}
