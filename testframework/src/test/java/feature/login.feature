Feature: Login into the application

Scenario Outline: Positive Validations
Given Initialize the browser with "chrome"
And user navigates to "http://qaclickacademy.com"
And click on login link to land on secure login page
When the user enter the <username> and <password> and logs in
Then verify that the user is logged in unsuccessful
And closeBrowsers

Examples:

|username         | password |
|swaran@gmail.com | 123456   |
|tej@gmail.com    | 1xyz     |