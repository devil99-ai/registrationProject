Feature: User Account Registration

  Scenario: User successfully registers an account
    Given the user is on the registration page
    When the user fills in valid registration details and submits
    Then a confirmation message "Thank you for registering with Main Website Store." is displayed
    And the user is redirected to their account dashboard
