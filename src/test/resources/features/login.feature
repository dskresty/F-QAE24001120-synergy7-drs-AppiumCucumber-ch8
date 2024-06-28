@Login
Feature: Login

  Scenario: User successfully login with valid credentials
    Given User is on login page
    And User input "standard_user" as username
    And User input "secret_sauce" as password
    When User click on login button
    Then User is on home page

  Scenario: User login with invalid credentials
    Given User is on login page
    And User input "standarduser" as invalid username
    And User input "secretsauce" as invalid password
    When User click on login button
    Then User gets an error message