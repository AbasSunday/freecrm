package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelPage {

    // ==================================================
    // VARIABLES
    // ==================================================

    @FindBy(xpath = "//*[@class='navbar navbar-default']")
    WebElement navBar;

    @FindBy(xpath = "//*[text()=' Login']")
    WebElement loginElement;

    @FindBy(id = "li_myaccount")
    WebElement myAccountElement;

    // ==================================================
    // CONSTRUCTOR
    // ==================================================

    // ==================================================
    // GETTERS AND SETTERS
    // ==================================================


}
