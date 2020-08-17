#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login
  various scenarios for login

  @tag1
  Scenario: login with invalid uid and password
    Given User is on rediff login page
    When user enters invalid credentials
    Then user is displayed with error

	@tag1
  Scenario: navigates to registration
    Given User is on rediff login page
    When user clicks on create new account
    Then user is navigated to registarion page

 @tag1
  Scenario: Register with valid credentials
    Given User is on rediff login page    
    And User is directed to registraion page
    When user enters valid data
    Then user is registred
 