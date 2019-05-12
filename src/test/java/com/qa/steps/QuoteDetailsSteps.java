package com.qa.steps;

import com.qa.pom.pages.QuoteDetailsPage;
import com.qa.utill.Utils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

import java.util.List;

public class QuoteDetailsSteps extends BaseSteps
{
    private QuoteDetailsPage detailsPage = new QuoteDetailsPage();

    @When("User enters pets details")
    public void userEntersPetsDetails(DataTable table)
    {
        List<List<String>> data = table.asLists(String.class);

        String petName = data.get(1).get(1);
        String petType = data.get(2).get(1);
        String petBreed = data.get(3).get(1);
        String petDominantBreed = data.get(4).get(1);


        detailsPage.getPetNameInput().sendKeys(petName);
        detailsPage.getPetTypeSelector().selectPeType(Utils.getPetType(petType));


        driver.sleep(5000);

    }

    @Then("User gets quote")
    public void userGetsQuote() {
    }

    @Given("teatafs")
    public void teatafs() {
        driver.get("http://google.co.uk");
    }
}
