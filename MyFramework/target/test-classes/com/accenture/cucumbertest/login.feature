#my first feature file
Feature: Login Functionality
Scenario: Login valid users
Given I am on login page
When I give tomsmith and SuperSecretPassword!
Then I should be login