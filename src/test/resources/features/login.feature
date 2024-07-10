@login
Feature: Login

  Background: User open the app and go to login page
    Given user is launch app
    And user is on login page

  Scenario Outline: Login with invalid credentials
    And user input username with <username>
    And user input password with <password>
    When user click on login button
    Then user sees error message <message>
    Examples:
      | username         | password         | message                                                        |
      | "standard_user"  | "wrong_password" | "Username and password do not match any user in this service." |
      | "wrong_username" | "wrong_password" | "Username and password do not match any user in this service." |

  @valid-login
  Scenario: Login with valid credentials
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    When user click on login button
    Then user is on homepage