Feature: PhpTravels

  Scenario Outline: Login
    Given User visit url "https://www.phptravels.net/"
    And User clicks on myaccount
    And User login with valid "<Email>" and "<Password>"
    Then User should be logged in

    Examples:
      | Email                  | Password     |
      | bobhelix2002@gmail.com | Paypoint1996 |