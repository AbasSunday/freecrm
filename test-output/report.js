$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/FrontPage.feature");
formatter.feature({
  "name": "Get Front Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Front Page should be displayed",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am in the front page",
  "keyword": "Given "
});
formatter.match({
  "location": "FrontPate.iAmInTheFrontPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the front page is displayed",
  "keyword": "When "
});
formatter.match({
  "location": "FrontPate.theFrontPageIsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the logo",
  "keyword": "And "
});
formatter.match({
  "location": "FrontPate.iShouldSeeTheLogo()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("features/Login.feature");
formatter.feature({
  "name": "Pet Insurance",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login",
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
  "name": "Details Page is displayed",
  "keyword": "And "
});
formatter.step({
  "name": "User enters a valid \"\u003cpetName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should be logged in",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "petName"
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
  "name": "Login",
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
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on getAQuote button",
  "keyword": "And "
});
formatter.match({
  "location": "MainPageSteps.user_clicks_on_getAQuote_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Details Page is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "MainPageSteps.details_Page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters a valid \"Monday\"",
  "keyword": "And "
});
formatter.match({
  "location": "MainPageSteps.user_enters_a_valid(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for element to be clickable: By.id: //*[@id\u003d\u0027pets.0.name\u0027] (tried for 10 second(s) with 500 milliseconds interval)\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:113)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:283)\n\tat com.qa.base.SeleniumDriver.getElement(SeleniumDriver.java:133)\n\tat com.qa.pom.base.BaseElement.findElement(BaseElement.java:39)\n\tat com.qa.pom.base.BaseElement.get(BaseElement.java:50)\n\tat com.qa.pom.base.BaseElement.get(BaseElement.java:55)\n\tat com.qa.pom.pages.DetailsPage.getPetName(DetailsPage.java:15)\n\tat com.qa.steps.MainPageSteps.user_enters_a_valid(MainPageSteps.java:34)\n\tat ✽.User enters a valid \"Monday\"(features/Login.feature:8)\nCaused by: org.openqa.selenium.NoSuchElementException: Cannot locate an element using By.id: //*[@id\u003d\u0027pets.0.name\u0027]\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027Abass-MBP-2.home\u0027, ip: \u0027fe80:0:0:0:1495:a13b:84c0:22e8%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.4\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: driver.version: SeleniumDriver\n\tat org.openqa.selenium.support.ui.ExpectedConditions.lambda$findElement$0(ExpectedConditions.java:896)\n\tat java.util.Optional.orElseThrow(Optional.java:290)\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:895)\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:44)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:206)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:202)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$22.apply(ExpectedConditions.java:657)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$22.apply(ExpectedConditions.java:654)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:260)\n\tat com.qa.base.SeleniumDriver.getElement(SeleniumDriver.java:133)\n\tat com.qa.pom.base.BaseElement.findElement(BaseElement.java:39)\n\tat com.qa.pom.base.BaseElement.get(BaseElement.java:50)\n\tat com.qa.pom.base.BaseElement.get(BaseElement.java:55)\n\tat com.qa.pom.pages.DetailsPage.getPetName(DetailsPage.java:15)\n\tat com.qa.steps.MainPageSteps.user_enters_a_valid(MainPageSteps.java:34)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:48)\n\tat cucumber.runtime.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:55)\n\tat cucumber.runner.TestStep.run(TestStep.java:42)\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:53)\n\tat cucumber.runner.TestCase.run(TestCase.java:47)\n\tat cucumber.runner.Runner.runPickle(Runner.java:44)\n\tat cucumber.api.testng.TestNGCucumberRunner.runScenario(TestNGCucumberRunner.java:56)\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.runScenario(AbstractTestNGCucumberTests.java:22)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:124)\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:583)\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:719)\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:989)\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:125)\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:109)\n\tat org.testng.TestRunner.privateRun(TestRunner.java:648)\n\tat org.testng.TestRunner.run(TestRunner.java:505)\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:455)\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:450)\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:415)\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:364)\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:84)\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1208)\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1137)\n\tat org.testng.TestNG.runSuites(TestNG.java:1049)\n\tat org.testng.TestNG.run(TestNG.java:1017)\n\tat org.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:73)\n\tat org.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:123)\n",
  "status": "failed"
});
formatter.step({
  "name": "User should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "MainPageSteps.user_should_be_logged_in()"
});
formatter.result({
  "status": "skipped"
});
});