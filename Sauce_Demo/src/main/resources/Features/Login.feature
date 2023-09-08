Feature: Login validation

  Scenario: To login woth valid credentials
    Given user launch the url
    When the user enter valid credentials
    And click the login button
    Then user Logout the page
