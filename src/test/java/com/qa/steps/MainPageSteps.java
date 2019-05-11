package com.qa.steps;

import com.qa.pom.pages.DetailsPage;
import com.qa.pom.pages.MainPage;
import com.qa.utill.PropertiesFileReader;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.io.FileNotFoundException;


public class MainPageSteps extends BaseSteps {
    private MainPage mainPage = new MainPage();
    private DetailsPage detailsPage = new DetailsPage();
    private PropertiesFileReader fileReader = new PropertiesFileReader();



    public MainPageSteps() throws FileNotFoundException {
    }

    @Given("User visit pet insurance url")
    public void user_visit_pet_insurance_url() {
        driver.get(fileReader.getProperties().getProperty("URL"));

    }

    @And("User clicks on getAQuote button")
    public void user_clicks_on_getAQuote_button() {
        mainPage.getQuoteButton().click();
    }

    @Then("User enter {string} on the Pet name field")
    public void user_enter_on_the_Pet_name_field(String petName) {
        //detailsPage.getPetName().click();
        detailsPage.getPetName().sendKeys("NameofPet");
    }




}