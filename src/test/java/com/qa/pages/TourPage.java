package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TourPage extends BasePage {

    // ==================================================
    // VARIABLES
    // ==================================================

    @FindBy(xpath = "//*[@class='navbar navbar-default']")
    WebElement navBar;

    @FindBy(xpath = "//*[@class='navbar navbar-default']")
    WebElement hotelElement;

    // ==================================================
    // CONSTRUCTOR
    // ==================================================

    // ==================================================
    // GETTERS AND SETTERS
    // ==================================================

}
