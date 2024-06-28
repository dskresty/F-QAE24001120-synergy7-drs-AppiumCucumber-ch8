@Checkout
  Feature: Checkout items

    Background: User already login
      Given User is on login page
      And User input "standard_user" as username
      And User input "secret_sauce" as password
      When User click on login button
      Then User is on home page

    Scenario: Checkout two items from cart
      Given User add two products to cart
      When User click cart button
      And User click on checkout button
      And And User fills checkout information with first name "Doremi", last name "Fasola", and zip postal "123"
      And User click finish button
      Then User successfully checkout product