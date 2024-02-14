Feature: validate ebay search

Scenario Outline: Validate ebay search 
Given User visit ebay homepage
When User type "<productname>" and click on search icon 
Then User should able to see expected product

Examples:
|productname|
|iphone 14 pro|