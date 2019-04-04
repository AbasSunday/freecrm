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
        glue = "steps",
        plugin = {"pretty", "json:target/cucumber-reports/report.json", "html:target/cucumber-reports"})
        //tags = {})
        //dryRun = false) // adding ~ before @ excludes execution of scenarios with tag, "@Execute"
                        //tags={"~@Ignore", "@Execute"})


public class Runner extends AbstractTestNGCucumberTests {

    @BeforeClass
    public static void setUp() {
        Base.getInstance();
        System.out.println("Set-up");
    }

    @AfterClass
    public static void tearDown() {
    }
}


