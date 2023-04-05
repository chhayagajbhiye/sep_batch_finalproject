Feature: Amazon Smoke Tests - Login Page
  @Jira-347
  Scenario: Verify User is able to successfully login Amazon page with valid credential
    Given User open Amazon site
    When User open login page
    Then User enters "username" and "password"
    When User click on login button
    Then User Validate homepage
@Jira-348
  Scenario: Verify user is not able to successfully login with invalid username and valid password
    Given User open Amazon site
    When User open login page
    Then User enters invalid "username" and valid "password"
    When User click on login button
    Then User should see an error message indicating that "we can not find an account with that username"

  Scenario: Verify user is not able to successfully login with valid username and invalid password
    Given User open Amazon site
    When User open login page
    Then User enters valid "username" and invalid "password"
    When User click on login button
    Then User should see an error message indicating that "your password is incorrect"

  Scenario: Verify user is not able to successfully login with empty credential
    Given User open Amazon site
    When User open login page
    Then User enters username as "" and password as ""
    When User click on login button
    Then User should see  error message
      | enter your username |
      | enter your password |

  Scenario: Verify User can reset their password # forgot password
    Given User open amazon site
    When the user open login page
    When the user clicks on the "Forgot password" link
    And the user enters their email address associated with their account
    And the user clicks on the "Submit" button
