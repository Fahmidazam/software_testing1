Feature: Validate Amazon search

Scenario Outline: Validate Amazon search

Given user visits amazon home
When user types "<productname>" and click search icon
Then User should be able to see the expected product

Examples:
|productname| 
|flower vase |
