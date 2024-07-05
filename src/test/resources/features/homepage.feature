
@User-Login-With-Valid-Credentials @loginpage
Feature: Sorting Item

Scenario: Login with valid credentials
Given user is on login page
And user input username with "standard_user"
And user input password with "secret_sauce"
When user click on login button
Then user is on homepage


@User-sorting-item-low-high @homepage
  Background : User launch the app and login using valid credentials
    Given User login using valid credentials
    And user is on the homepage

  Scenario : User filter item from low to high price
    And user click on filter button
    When user select menu low to high filter
    Then user should see the items in low to high price order
