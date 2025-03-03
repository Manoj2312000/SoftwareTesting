Feature: Data driven login

@Excel

Scenario: User login from data using excel

Given User is on data driven login page
When Entering the username and password from the excel
Then User clicks login button
Then User logged in succesfully


