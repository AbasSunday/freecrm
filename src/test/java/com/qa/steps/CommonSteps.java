package com.qa.steps;

import cucumber.api.java.en.And;

public class CommonSteps extends BaseSteps
{
    @And("User opens sub page {string} in the quote page")
    public void userOpensSubPageInTheQuotePage(String subpage)
    {
        driver.openQuotePage(subpage);
    }
}
