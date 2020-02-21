Feature: check whether the login page is working succesfully

Scenario: validate the login page with username and password

Given admin in the loginpage

When ensure that Admin cannot login with valid username and  valid password

Then admin cannot login  in to the homepage