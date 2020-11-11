Feature: As a user, I should be able to login using different valid credentials

  Background: common steps
    Given user is on the login page


  @scenario_outline
  Scenario Outline: Parametrized login as a <role>
    When user logs in as a "<role>"
    Then user should land on the dashboard page

    Examples:
      | role          |
      | driver        |
      | store manager |
      | sales manager |




