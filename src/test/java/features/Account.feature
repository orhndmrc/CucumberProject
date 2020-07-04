Feature: Application Login
  @smoke
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User log into app with username "jin" and password "1234"
    Then Homepage is populated
    And Cards are displayed "true"
