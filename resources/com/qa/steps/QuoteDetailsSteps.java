package com.qa.steps;

import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class QuoteDetailsSteps extends BaseSteps
{
    @When("User enters pets details")
    public void userEntersPetsDetails(DataTable table)
    {
        List<List<String>> data = table.asList(String.class);

        String petName = data.get(1).get(1);
        String petType = data.get(2).get(1);
        String petBreed = data.get(3).get(1);
        String petDominantBreed = data.get(4).get(1);
        boolean petDominantBreed = data.get(4).get(1);
    }
}
