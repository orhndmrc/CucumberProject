Feature: Application Login

  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User log into app with username and password
    Then Homepage is populated
    And Cards are displayed