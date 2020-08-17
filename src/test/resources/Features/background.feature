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
Feature: Amazn search
  I want to use this template for my feature file
Background: 
    Given user is on amazon home page
    When user searches a product
    Then results for the product are displayed
    
  @tag1
  Scenario: Filter results
    Given user is on amazon search page
    When user filters using format
    Then results are filtered

  @tag1
  Scenario: sort results
    Given user is on amazon search page
    When user sorts using price
    Then results are sorted
  