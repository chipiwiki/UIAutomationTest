Feature: Help page dunctionality test cases

   Scenario: Help page menu
    Given I open adidas website
    When I select spanish location
    And I select help in menu
    Then the help page is displayed

  Scenario: Help page sugestions
      Given I open adidas website
      When I select spanish location
      And I select help in menu
      And I enter "ayuda" in search bar
      Then suggestions are displayed


