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
Feature: Search Google
 Various scenarios for google Search
Background: 
		Given user is on Google home page
		When user searches for "amazon"
		Then results for "amazon" are displayed
  @tag1
  Scenario: Images Search
   
    When User searches for images
    Then results for searhed images are displayed
  

    @tag1
  Scenario: Videos Search
   
    When User searches for books
    Then results for searhed books are displayed
