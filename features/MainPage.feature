Feature: Pet Insurance

  Scenario Outline: Main Page

    Given User visit pet insurance url
    And  User clicks on getAQuote button
    Then User enter "<NameofPet>" on the Pet name field


    Examples:
      | NameofPet|
      | Monday |