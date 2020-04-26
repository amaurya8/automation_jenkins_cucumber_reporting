Feature: Wordpress Login
  As a user I should able to login into wordpress.

  Scenario: I login with valid credential
    Given I navigate to "https://wordpress.org/plugins/apply-online/"
    And I click on login button
    And I enter "imaurya8" into input field having id "username"
    And I enter "T038)h3xjb*OL1yb" into input field having passowrd
    When I click on element having button Login
    Then User should be able to logged in successfully
