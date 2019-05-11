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
  "name": "User enter \u003cpetName\u003e on the Pet name field",
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
  "name": "User enter Monday on the Pet name field",
  "keyword": "Then "
});
formatter.match({
  "location": "MainPageSteps.user_enter_Monday_on_the_Pet_name_field(String)"
});
formatter.result({
  "error_message": "cucumber.runtime.CucumberException: Step [User enter Monday on the Pet name field] is defined with 1 parameters at \u0027com.qa.steps.MainPageSteps.user_enter_Monday_on_the_Pet_name_field(String) in file:/Users/abas/Documents/freecrm/target/test-classes/\u0027.\nHowever, the gherkin step has 0 arguments.\nStep text: User enter Monday on the Pet name field\n\tat cucumber.runtime.PickleStepDefinitionMatch.arityMismatch(PickleStepDefinitionMatch.java:84)\n\tat cucumber.runtime.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:34)\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:55)\n\tat cucumber.runner.TestStep.run(TestStep.java:42)\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:53)\n\tat cucumber.runner.TestCase.run(TestCase.java:47)\n\tat cucumber.runner.Runner.runPickle(Runner.java:44)\n\tat cucumber.api.testng.TestNGCucumberRunner.runScenario(TestNGCucumberRunner.java:56)\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.runScenario(AbstractTestNGCucumberTests.java:22)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:124)\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:583)\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:719)\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:989)\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:125)\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:109)\n\tat org.testng.TestRunner.privateRun(TestRunner.java:648)\n\tat org.testng.TestRunner.run(TestRunner.java:505)\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:455)\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:450)\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:415)\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:364)\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:84)\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1208)\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1137)\n\tat org.testng.TestNG.runSuites(TestNG.java:1049)\n\tat org.testng.TestNG.run(TestNG.java:1017)\n\tat org.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:73)\n\tat org.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:123)\n",
  "status": "failed"
});
});