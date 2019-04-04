package com.qa.steps;

import com.qa.base.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class LoginPageStepDef{

    Base base = Base.getInstance();
    @Given("^I access the phptravel \"([^\"]*)\"$")
    public void i_access_the_phptravel(String url) {
        base.get(url);
        System.out.println("Login Steps");
    }

    @Given("^I select a My Account button$")
    public void i_select_a_My_Account_button(){
        // Write code here that turns the phrase above into concrete actions
    }

    @Given("^I click on login button$")
    public void i_click_on_login_button() throws Throwable {

    }

    @Given("^The user should select on login button$")
    public void the_user_should_select_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Given("^login page should be displayed$")
    public void login_page_should_be_displayed(){
    }

    @Then("^User should enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_should_enter_and(String arg1, String arg2){
    }

}
