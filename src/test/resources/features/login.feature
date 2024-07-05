
@login @regression
Feature: Login

  Background: User open the app and go to login page
    Given user is launch app
    And user is on login page

  @negative-test
  Scenario Outline: Login with username and password
    And user input username with <username>
    And user input password with <password>
    When user click on login button
    Then user able to see message <message>

    Examples:
      | username          | password          | message                                                        |
      | "standard_user"   | "wrong_password"  | "Username and password do not match any user in this service." |
      | "wrong_username"  | "wrong_password"  | "Username and password do not match any user in this service." |


#@login @regression
#Feature: Login
#
#  @positive-test @smoke
#  Scenario Outline: Login with valid email and password
#    Given user is on login page
#    And user input username with <username>
#    And user input password with <password>
#    When user click on login button
#    Then user is on homepage
#    Examples:
#      | username          | password          | message                           |
#      | "standard_user"   | "secret_sauce"    | "sauce"                           |
#      | "wrong_username"  | "secret_sauce"    | "wrong_username"                  |
#      | "wrong_password"  | "secret_password" | "wrong"                           |

#  @negative-test
#  Scenario: Login with invalid email and password
#    Given user is on login page
#    And user input username with "standard_user"
#    And user input password with "secret_sauce"
#    When user click on login button
#    Then user is on homepage