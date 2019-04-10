package com.qa.runner;

import com.qa.base.Base;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.testng.annotations.Test;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"features"},
        glue="com.qa.steps",
        plugin = { "pretty", "json:target/cucumber-reports/report.json"},
        tags={"not @Ignore"})
public class Runner extends AbstractTestNGCucumberTests
{

//    @BeforeSuite
//    public static void initialise(){
//
//    }

    @BeforeClass
    public static void setUp()
    {
        Base.getInstance();
    }

//    @BeforeMethod
//    public static void launchBrowser(){
//        System.out.println("Browser Launch");
//    }
    @Test()
    public void loginPageTest(){
        System.out.println("Login tested");
    }
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

    @AfterClass
    public static void tearDown()
    {
        Base.getInstance().close();

    }
}


