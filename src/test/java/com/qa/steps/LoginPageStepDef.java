package com.qa.steps;

import com.qa.base.Base;
import com.qa.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class LoginPageStepDef
{
    // ==================================================
    // VARIABLES
    // ==================================================

    private Base base = Base.getInstance();
    private LoginPage loginPage = new LoginPage();

    // ==================================================
    // STEPS DEFINITIONS
    // ==================================================

    @Given("User visit url {string}")
    public void userVisitUrl(String url)
    {
        base.get(url);
    }

    @And("User login with valid {string} and {string}")
    public void userLoginWithValidAnd(String email, String password)
    {
        loginPage.getEmailInput().sendKeys(email);
        loginPage.getPasswordInput().sendKeys(password);
        loginPage.getLoginButton().click();
    }

    @Then("User should be logged in")
    public void userShouldBeLoggedIn()
    {

    }
}