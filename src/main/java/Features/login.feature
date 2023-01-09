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

Feature: Free CRM Login 

#Scenario: CRM login with credentials

#Given user is already on login Page
#When title of login page is Free CRM
#Then user clicks on login link
#Then user enters username and password 
#Then user clicks on login button
#Then user is on home page

#with Example KeyWord
Scenario Outline: CRM login with credentials

Given user is already on login Page
When title of login page is Free CRM
Then user clicks on login link
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page

Examples:

	| username 						| password	  |
	| pvish1991@gmail.com | Test@123    |
	| jhonwilliam 				| William123  | 



 




