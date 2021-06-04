@login

Feature: As a user I should be able to login So that
  I can use the functionalities  of the app

  Scenario: User is able to login with correct username and password
    Given I am on the login page
    When  I login using username as "username" and password as "password"
    Then I am able to login in the app