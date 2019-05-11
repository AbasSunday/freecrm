$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/MainPage.feature");
formatter.feature({
  "name": "Pet Insurance",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Main Page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User visit pet insurance url",
  "keyword": "Given "
});
formatter.step({
  "name": "User clicks on getAQuote button",
  "keyword": "And "
});
formatter.step({
  "name": "User enter \"\u003cNameofPet\u003e\" on the Pet name field",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "NameofPet"
      ]
    },
    {
      "cells": [
        "Monday"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Main Page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User visit pet insurance url",
  "keyword": "Given "
});
formatter.match({
  "location": "MainPageSteps.user_visit_pet_insurance_url()"
});
