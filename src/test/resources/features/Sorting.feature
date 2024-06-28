@Sorting
  Feature: Sorting Items

    Background: User already login
      Given User is on login page
      And User input "standard_user" as username
      And User input "secret_sauce" as password
      When User click on login button
      Then User is on home page

    Scenario: Sorting items low to high
      Given User click sorting items button
      When User choose low to high button
      Then Items on home page will be sorted from low to high