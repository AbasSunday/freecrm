Feature: Pet Insurance

  Scenario Outline: Login

    Given User visit pet insurance url
    And User clicks on getAQuote button
    And Details Page is displayed
    And User enters a valid "<petName>"
    Then User should be logged in

    Examples:
      | petName|
      | Monday |