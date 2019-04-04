$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "PhpTravels Features",
  "description": "",
  "id": "phptravels-features",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Test 1. ---\u003e  Verify that User should be able login successfully",
  "description": "",
  "id": "phptravels-features;test-1.----\u003e--verify-that-user-should-be-able-login-successfully",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "The user should select on login button",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "login page should be displayed",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User should enter \"\u003cEmail\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "phptravels-features;test-1.----\u003e--verify-that-user-should-be-able-login-successfully;",
  "rows": [
    {
      "cells": [
        "Email",
        "Password",
        "Url"
      ],
      "line": 16,
      "id": "phptravels-features;test-1.----\u003e--verify-that-user-should-be-able-login-successfully;;1"
    },
    {
      "cells": [
        "bobhelix2002@gmail.com",
        "Paypoint1996",
        "https://www.phptravels.net/"
      ],
      "line": 17,
      "id": "phptravels-features;test-1.----\u003e--verify-that-user-should-be-able-login-successfully;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I access the phptravel \"\u003cUrl\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I select a My Account button",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 17,
  "name": "Test 1. ---\u003e  Verify that User should be able login successfully",
  "description": "",
  "id": "phptravels-features;test-1.----\u003e--verify-that-user-should-be-able-login-successfully;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "The user should select on login button",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "login page should be displayed",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User should enter \"bobhelix2002@gmail.com\" and \"Paypoint1996\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});