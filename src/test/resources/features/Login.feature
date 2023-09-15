Feature: User Login

  @valid
  Scenario Outline: Valid User Login
    Given User is on the "https://demowebshop.tricentis.com/login" page
    When User provides valid <email> and <password>
    And User clicks the Login button
    Then User should be logged in successfully

    Examples:
      | email               | password   |
      | aditya1@gmail.com   | Aditya@123 |

  @invalid
  Scenario Outline: Invalid User Login
    Given User is on the "https://demowebshop.tricentis.com/login" page
    When User provides valid <email> and <password>
    And User clicks the Login button
    Then User should be logged in successfully

    Examples:
      | email               | password   |
      | aoccnc@gmail.com    | hsbcdbchd     |