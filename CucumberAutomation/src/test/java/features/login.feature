Feature: Login page validation


Scenario: to validate the login as mobile user
Given to validate the user access
When the user login with mobile access "ABCD" and "1234"
Then user should be successully login "true"


Scenario: to validate the login as normal web user
Given to validate the user access
When the user login with web  access "SWARAN" and "789456"
Then user should be successully login "false"