package AppiumMobileTest.StepDefinitions;

import AppiumMobileTest.BaseTest;
import AppiumMobileTest.page.LoginPage;
import AppiumMobileTest.page.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginStep extends BaseTest {

    private LoginPage loginPage;
    private HomePage homePage;

    // Initialize Driver
    @Before
    public void setup(){
        loginPage = new LoginPage(driver);
    }

    // Steps
    @Given("user is launch app")
    public void userIsLaunchApp() {
    }

    @And("user is on login page")
    public void userIsOnLoginPage() {

        loginPage.validateLoginPage();
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

    @Then("user sees error message {string}")
    public void userSeesErrorMessage(String message) {
        assertEquals(loginPage.getErrorMessage(), message);
    }

//    @Then("user is on homepage")
//    public void userIsOnHomepage() {
//        homePage = new HomePage(driver);
//        assertTrue(homePage.isHomePageDisplayed());
//    }
}
