@homepage
Feature: Home Page

  Background: User launch the app and login using valid credentials
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    When user click on login button
    Then user is on homepage

  Scenario: User filter item from low to high price
    When user click on filter button
    And user select menu low to high filter
    Then user should see the items in low to high price order

  Scenario: User Checkout selected items in the cart shopping
    Given user add the product to the cart
    And user