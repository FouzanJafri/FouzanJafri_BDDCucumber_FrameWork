
@tag
Feature: Product Search

  @tag1
  Scenario: Search product steps
    Given user on Home page
    And user should click on Search input feild
    When user can enter Product you want to search
    And user clicks on Search button
    Then user must see desired product
    
