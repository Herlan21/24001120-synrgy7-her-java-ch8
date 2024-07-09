package AppiumMobileTest.StepDefinitions;

import AppiumMobileTest.BaseTest;
import AppiumMobileTest.page.HomePage;
import AppiumMobileTest.page.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomeStep extends BaseTest {

    private HomePage homePage;

    @Before
    public void setup(){
        setupDriver();
    }
//
//    @After
//    public void tearDown(){
//        resetApp();
//    }

    @Then("user is on homepage")
    public void userIsOnHomepage() {
        homePage = new HomePage(driver);
        homePage.productBannerDisplay();
    }

//    @Given("User login using valid credentials")
//    public void userLoginUsingValidCredentials() {
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.validateLoginPage(); // Ensure the login page is fully loaded
//    }
//
//    @And("user is on the homepage")
//    public void userIsOnTheHomepage() {
//        homePage.validateOnPage();
//        homePage.productBannerDisplay();
//    }
//
//    @And("user click on filter button")
//    public void userClickOnFilterButton() {
//        homePage.clickFilterButton();
//    }
//
//    @When("user select menu low to high filter")
//    public void userSelectMenuLowToHighFilter() {
//        homePage.setItemSortList();
//
//    }
//
//    @Then("user should see the items in low to high price order")
//    public void userShouldSeeTheItemsInLowToHighPriceOrder() {
//    }
}
