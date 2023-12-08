@ValidateGooglePageScenario
Feature: Title of your feature
  I want to use this template for my feature file

  @ValidateTitle_1
  Scenario: Enter Email in Sign In Page
    When User navigate to Google Page
    And User enter Gmail Link in Google Page
    And User clicks Sign in Button to Login
    And User enter Email "Rose@gmail.com"


  @ValidateTitle_2
  Scenario: Create New Account
    When User navigate to Google Page
    And User enter Gmail Link
    And User click Create New Account