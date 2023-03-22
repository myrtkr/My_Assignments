Feature: Loggin into and creating Lead in Testleaf Application

Scenario: Login for positive data

Given Launch the browser and maximize and load the url
And Enter username
And Enter the password
When Click on the login button
Then Verify that login is successful
 
When Click on Leads
And Click on Create Lead
Then Verify the create lead page is open

When Enter Company name and First name and Last name
Then Click on create lead
And Verify New Lead has been created



