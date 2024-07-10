package AppiumMobileTest.StepDefinitions;

import AppiumMobileTest.BaseTest;
import AppiumMobileTest.page.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HomeStep extends BaseTest {

    private HomePage homePage;

    @Before
    public void setup(){
//        setupDriver();
        homePage = new HomePage(driver);
    }

    @After
    public void tearDown(){
        resetApp();
    }

    @Then("user is on homepage")
    public void userIsOnHomepage() {
//        homePage = new HomePage(driver);
        assertEquals(homePage.productBannerDisplay(), "PRODUCTS");
    }

    @And("user click on filter button")
    public void userClickOnFilterButton() {
        homePage.clickFilterButton();
        assertTrue(homePage.setItemSortList());
    }

    @When("user select menu low to high filter")
    public void userSelectMenuLowToHighFilter() {
        homePage.clickLowToHigh();
    }

    @Then("user should see the items in low to high price order")
    public void userShouldSeeTheItemsInLowToHighPriceOrder() {
        assertTrue(homePage.verifyItemsSortedLowToHigh());
    }
}
