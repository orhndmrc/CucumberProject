Feature: Application Login

  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User log into app with username "jin" and password "1234"
    Then Homepage is populated
    And Cards are displayed "true"

  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User log into app with username "john" and password "4321"
    Then Homepage is populated
    And Cards are displayed "false"