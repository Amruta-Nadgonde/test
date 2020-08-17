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
  various scenarios for login feature

  @tag1
  Scenario: Login to echo track
    Given user is on echo login page
    When user enter valid userid and password
    Then user is logged in
    
  @tag1
  Scenario: Login to echo track
    Given user is on echo login page
    When user enter "amruta" and "@mruta"
    Then user is logged in
    
    
    @tag2
  Scenario Outline: Login dd
    Given user is on echo login page
    When user enters "<username>" and "<password>" 
    Then user is logged in

    Examples: 
      | username  | password | 
      | testuser1 | test@123 | 
      | testuser2 | test@123 | 

 