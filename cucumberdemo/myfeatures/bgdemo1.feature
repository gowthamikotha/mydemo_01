Feature: My standard charted bank account

Background: Launching of the bank landing page
Given Sanju has done with browser configuration
Then he launches the application in his favourite chrome browser

Scenario: Sign in for Sanju
Given he clicks on sign in link
Then he enyers the valid creds
And he clicks on submit button

Scenario: Signup gor guest user
Given Guest user clicks on signup link
When he provide all the manadatory data
Then he clicks on sbmt and Id generated

Scenario: Sanju wanted to reset her password
Given he clicks on forgot password link
Then he enters the mobile number
And he receives otp and the same he provides
Then he is able to rest her password