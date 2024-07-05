package AppiumMobileTest.StepDefinitions;

import AppiumMobileTest.page.HomePage;
import io.cucumber.java.en.Then;

public class HomeStep {

    HomePage homePage = new HomePage();

    @Then("user is on homepage")
    public void userIsOnHomepage() {
        homePage.validateOnPage();
        homePage.productBannerDisplay();
    }
}
