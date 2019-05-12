package com.qa.runner;

import com.qa.base.SeleniumDriver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"features"},
        glue="com.qa.steps",
        plugin = { "pretty", "html:test-output","json:target/cucumber-reports/report.json"},
        tags={"not @Ignore"},
        monochrome = true,
        strict = false,
        dryRun = false)

public class Runner extends AbstractTestNGCucumberTests
{
    @BeforeClass
    public static void setUp()
    {
        SeleniumDriver.getInstance().printTestDetails();
    }

    @AfterClass
    public static void TearDown()
    {
        SeleniumDriver.getInstance().onTestExecutionFinished();
    }
}
