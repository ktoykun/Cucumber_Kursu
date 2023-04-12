
Feature: Country Funtionality

  Scenario: Create a country
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

      And Navigate to country page
      When Enter name and code and click + button
      Then country should create succefully