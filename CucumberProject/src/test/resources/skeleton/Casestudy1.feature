Feature: Registration feature file
Scenario: A valid registration scenario
Given  the url of test me app application
When  user clicks on sign up button
Then  the registration page opens.
When the user enters yashwanthsai7 as username
And  the user enters yashwanth as firstname
And  the user enters sai as lastname
And  the user enters yash1234 as password
And  the user enters yash1234 as confirm password
And  the user clicks on male as gender
And  the  user enters yashwanth@gmail.com as email
And  the user enters 1234567890 as mobile number
And  the user enters 12/11/1997 as dob
And  the user enters hyderabad as address
And  the user selects whatisyourbirthplace as security question
And  the user enters hyderabad as answer
When the user clicks on register button
Then  the user gets registered succesfully

