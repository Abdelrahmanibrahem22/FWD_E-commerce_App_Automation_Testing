@smoke
Feature: F01_Register | users could register with new accounts
  Scenario: guest user could register with valid data successfully
    Given User go to register page
    And User select gender type
    When User enter valid data
    Then User click on register button
    Then Success message is displayed
