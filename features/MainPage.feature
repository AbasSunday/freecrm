Feature: Pet Insurance

  Scenario Outline: Main Page

    Given User visit pet insurance url
    And  User clicks on getAQuote button
    Then User enter <petName> on the Pet name field


    Examples:
      | petName|
      | Monday |