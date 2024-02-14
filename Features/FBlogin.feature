Feature: validate facebook login

Scenario Outline:
Given user visiting facebook login page
When users enter "<email or phone number>" "<password>"
And When click on login button
Then user should able to login to fb

Examples:
|email or phone number | password |
|sinthia@gmail.com |Sinthia1234 |