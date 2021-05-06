Feature: Navigating to Myaccount login
  As a user I want to navigate to user login

  Background: 
    Given user navigate to the website

  Scenario: User navigating to myaccount login page
    When user clicks on my account link
    Then user should see the login screen