package com.qa.runner;

import com.qa.base.Base;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"features"},
        glue="com.qa.steps",
        plugin = { "pretty", "json:target/cucumber-reports/report.json"},
        tags={"not @Ignore"})
public class Runner extends AbstractTestNGCucumberTests
{
    @BeforeClass
    public static void setUp()
    {
        Base.getInstance();
    }

    @AfterClass
    public static void tearDown()
    {

    }
}