package com.qa.steps;

public class FrontPate extends BaseSteps{


    @cucumber.api.java.en.Given("I am in the front page")
    public void iAmInTheFrontPage() {
        driver.get("https://www.google.com");
    }

    @cucumber.api.java.en.When("the front page is displayed")
    public void theFrontPageIsDisplayed() {

    }

    @cucumber.api.java.en.And("I should see the logo")
    public void iShouldSeeTheLogo() {
    }
}
