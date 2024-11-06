Feature: Sign In using newly registered account

  Scenario: User successfully logs in with the registered account
    Given the user is on the login page
    When the user enters valid credentials and submits
    Then the user is redirected to the account dashboard
    And a welcome message with their name is displayed
