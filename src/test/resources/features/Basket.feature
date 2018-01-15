# new feature
# Tags: optional
    
Feature: Basket test cases
    
Scenario: My basket is empty
    Given I open adidas website
    And I select spanish location
    When I do mouse over the basket
    Then my basket is empty
