
Feature: Testing guru99 login
1)valid case
2)invalid case

Background:
Given i should open the browser and naviagte to the login page of guru99
@PositiveTesting
Scenario Outline: To login with multiple data
When Enter the User Name "<user>"
And Enter the Password "<pass>"
And Click on the Submitbutton
Then I should see title as "<title>"
Examples:
|user|pass|title|
|user|user|Login: Mercury Tours|
|admin|admin|Login: Mercury Tours|
@NegativeTesting
Scenario: To Test the Login with invalid Credentials
When Enter the User Name "alok"
And Enter the Password "alok"
And Click on the Submitbutton
Then I should see title as "Welcome: Mercury Tours"