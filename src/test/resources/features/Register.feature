Feature: User Registration

  Scenario: Register with valid data
    Given user opens the URL "https://demowebshop.tricentis.com/register"
    When user provides valid registration data
    Then user should be registered successfully

