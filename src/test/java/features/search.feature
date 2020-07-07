Feature: Search and place order for vegetables
@SmokeTest
  Scenario: Search for items and validate results
    Given User is on GreenCart landing page
    When User searched for Cucumber Vegetable
    Then Cucumber results are displayed

  @SeleniumTest
  Scenario Outline: Search for items and then move to checkout page
    Given User is on GreenCart landing page
    When User searched for <Name> Vegetable
    And Added items to cart
    And User proceeded to Checkout page for purchase
    Then verify selected <Name> items are displayed in checkout page

Examples:
  |Name     |
  |Brinjal  |
  |Beetroot |


