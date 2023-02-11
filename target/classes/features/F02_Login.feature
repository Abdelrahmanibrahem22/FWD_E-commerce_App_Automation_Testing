@smoke
Feature: F02_Login | users could use login functionality to use their accounts
  Scenario: User could login with valid email and password
  Given User go to login page
  When User login with valid email and password
  Then User click on login button
  Then User login to the system successfully

  Scenario: User could not login with invalid email and password
    Given User go to login page
    When User login with invalid email or password
    Then User click on login button
    Then User could not login to the system
