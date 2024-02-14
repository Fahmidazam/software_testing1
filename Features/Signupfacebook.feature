Feature: validate facebook signup

Scenario Outline:
Given User visit facebook sign up form/page
When user type  valid "<first_name>" and  and  "<last_name>"                                        
When user type  valid "<email_address>" and "<password>"                                 
When user enter valid "<birthday>" user select option from "<gender>"
When User clicks on sign up button
Then User will be able to sign up successfully                              "

Examples:
|first_name|last_name|email_address|password|birthday|gender|
|Jack|jill|jack_jill@gmail.com|Abcd12324|1/1/2001|male|