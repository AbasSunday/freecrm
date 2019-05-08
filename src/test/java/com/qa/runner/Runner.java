package com.qa.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

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

//    @BeforeSuite
//    public static void initialise(){
//
//    }
//
//    @BeforeClass
//    public static void setUp()
//    {
//        SeleniumDriver.getInstance();
//    }
//
//    @BeforeMethod
//    public static void launchBrowser(){
//        System.out.println("Browser Launch");
//    }
//    @Test()
//    public void loginPageTest(){
//        System.out.println("Login tested");
//    }
//
//    @Test
//    public void accountPageTest(){
//        System.out.println("Account Page tested");
//    }
//
//    @Test
//    public void addressPageTest(){
//        System.out.println("address Page tested");
//    }
//
//    @AfterClass
//    public static void tearDown()
//    {
//        SeleniumDriver.getInstance().close();
//
//    }
}
