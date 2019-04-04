Feature: PhpTravels Features

  Background:
    Given I access the phptravel "<Url>"
    And I select a My Account button
    And I click on login button

  Scenario Outline: Test 1. --->  Verify that User should be able login successfully

    Given The user should select on login button
    And  login page should be displayed
    Then User should enter "<Email>" and "<Password>"


    Examples:
      |Email|Password|Url|
      |bobhelix2002@gmail.com|Paypoint1996|https://www.phptravels.net/|