@regression
Feature: Register user

  @smoke
  Scenario: verify user can be register
    Given I launch the browser
    And I open the URL
    And I verify that home page visible successfully
    When I click on "Signup / Login" button
    And I verify "New User Signup!" is visible
    And I Enter name and email address
    And I Click Signup button
    And I Verify that ENTER ACCOUNT INFORMATION is visible
    And I Fill details: Title, Name, Email, Password, Date of birth
    And I Select checkbox Sign up for our newsletter!
    And I Select checkbox Receive special offers from our partners!
    And I  Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    And I  Click Create Account button
    And I Verify that ACCOUNT CREATED! is visible
    And I Click Continue button
    And I Verify that Logged in as username is visible
    Then I Click Delete Account button
    And I Verify that ACCOUNT DELETED! is visible and click Continue button


