Feature: To validate login functionality of facebook page

  Background: 
    Given User have to enter facebook login through grome browser

  Scenario: Tovalitate login with invalid and valid values
    When User have to enter invalid email and valid password
    And User have to click login button

  Scenario: To login with valid and valid values
    When User have to enter valid and valid values
    And User have to click login button
    Then User have to show credentials page
