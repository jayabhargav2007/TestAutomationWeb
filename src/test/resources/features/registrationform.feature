Feature: Registration after providing registration details 
  As a user I want to complete the registration process

  Background: 
    Given user navigate to the website
    When user clicks on my account link
    Then user should see the login screen

  Scenario: User completing the registration process
  Then user fills the registration form and clicks on register
  
    