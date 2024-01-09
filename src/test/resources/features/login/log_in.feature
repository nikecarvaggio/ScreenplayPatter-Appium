Feature: Log in

  Scenario: Try to log in with valid credentials
    Given "John Wick" wants to login in the app with username: "standard_user" and password: "secret_sauce"
    Then Verifies if the login was successfull