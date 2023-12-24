Feature: JDoodle Login Test
Purpose of this file is to test login functionality of Jdoodle 
Background: Customer open the WebSite 
Given User is on Home Page



  Scenario Outline: User logs in with valid credentials
    Given the user is on the login page
    When the user enters "<username>" and "<password>"
    And clicks the login button
    Then the user should be logged in successfully

    Examples:
      | username  | password  |
      | user1     | password1 |
      
      Scenario Outline: User cannot log in with invalid credentials
    Given the user is on the login page
    When the user enters "<username>" and "<password>"
    And clicks the login button
    Then the login should fail with an error message

    Examples:
      | username    | password     |
      | invalidUser | invalidPass  |
      | fakeUser    | fakePass     |
      | testUser    | wrongPass    |
