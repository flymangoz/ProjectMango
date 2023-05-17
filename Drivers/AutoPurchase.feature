Feature: User should be able to login automation exercise application and purchase men tshirt

Scenario: User should be able to login with valid creditional and able to purchase men tshirt and log out

Given User is able to open any browser 
And user is able to enter the URL "https://automationexercise.com/login"
And user is able to enter email address
And user is able to enter password
When user is able to click login button
Then user is able to login and verified "Automation Exercise" on UI
