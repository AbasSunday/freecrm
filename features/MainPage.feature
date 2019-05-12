Feature: Pet Insurance


  Scenario Outline: Main Page

    Given User opens sub page "details" in the quote page
    When User enters pets details
      | Input name           | Value     |
      | Pet name             | Matt      |
      | Pet type             | Cat       |
      | Pet breed            | Pedigree  |
      | Pet's Dominant Breed | Aidi      |
      | is vaxinated | true      |
    Then User gets quote


    Examples:
      | NameofPet|
      | Monday |