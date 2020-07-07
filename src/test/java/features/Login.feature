Feature: Application Login

@regression
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User log into app with username "jin" and password "1234"
    Then Homepage is populated
    And Cards are displayed "true"
  @mobile
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User log into app with username "john" and password "4321"
    Then Homepage is populated
    And Cards are displayed "false"

  @smoke
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User sign up with following details
    |jenny | abcd | john@abcd.com| Australia | 343535|
    Then Homepage is populated
    And Cards are displayed "false"

  @regression
  Scenario Outline: Home page default login
    Given User is on NetBanking landing page
    When User log in to app with <Username> and <Password>
    Then Homepage is populated
    And Cards are displayed "true"

    Examples:
    |Username | Password |
    |user1    | pass1    |
    |user2    | pass2    |
    |user3    | pass3    |
    |user4    | pass4    |