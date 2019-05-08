package com.qa.steps;

import com.qa.pom.pages.MainPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MainPageSteps extends BaseSteps{
    private MainPage mainPage = new MainPage();

    @Given("User visit pet insurance url")
    public void user_visit_pet_insurance_url() {
        driver.get("https://petprotect.co.uk/");
    }

    @And("User clicks on getAQuote button")
    public void user_clicks_on_getAQuote_button() {
        mainPage.getQuoteButton().click();

    }

    @And("Details Page is displayed")
    public void details_Page_is_displayed() {

    }

    @And("User enters a valid {string}")
    public void user_enters_a_valid(String string) {

    }

    @Then("User should be logged in")
    public void user_should_be_logged_in() {

    }

}
