Feature: Login feature file

Scenario Outline: A valid login scenario
Given the URL of demo web shop application
When user enters <username> as <type> username
And user enters <password> as password
Then user is in valid page

Examples:
|username         |password|type  |
|kannan1@gmail.com|test1234|admin |
|kannan2@gmail.com|test1234|vendor|
|kannan3@gmail.com|test1234|guest |