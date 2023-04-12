
@SmokeTest
  Feature: Login Functionality
    Scenario: Login with corect username and password and
      Given Navigate to Campus
      When Enter username and password and click login button
      Then User should login succesfully
