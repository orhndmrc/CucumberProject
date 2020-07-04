Feature: Go to https://rahulshettyacademy.com/AutomationPractice/ and do the actions

  Scenario: Positive test validating actions on RahulShittyAcademy
    Given initialize the browser with chrome
    And  navigate to "https://rahulshettyacademy.com/AutomationPractice" website
    When User selects "Dropdown Example" and "option1"
    And User hovers over on "Mouse Hover" and click on "Top" option
    Then Validating the landing page