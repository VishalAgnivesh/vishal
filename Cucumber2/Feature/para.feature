Feature: login action
Scenario Outline: Successful login with valid credentials
Given user is open the application
When user click on to login link
And user enters "<username>" and "<password>"
Then message displayed login successfully

Examples:
|username  | password |
|lalitha   | password123 |
|admin     | password456 |