Feature: Login to Facebook
  This feature allows users to log into their Facebook account.

  Scenario: User cannot login with invalid credentials
    Given user navigates to facebook home page
      And user enters invalid email
      And an invalid password
    When user clicks on log in button
    Then user should see an error message

  Scenario: User can login with invalid credentials
    Given user navigates to facebook home page
    And user enters valid email
    And an valid password
    When user clicks on log in button
    Then user should log in successfully