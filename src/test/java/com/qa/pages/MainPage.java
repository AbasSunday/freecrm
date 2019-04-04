package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage
{
    // ==================================================
    // VARIABLES
    // ==================================================

    @FindBy (xpath = "//*[@class='navbar navbar-default']")
    WebElement navBar;

    // ==================================================
    // CONSTRUCTOR
    // ==================================================

    // ==================================================
    // GETTERS AND SETTERS
    // ==================================================

    public WebElement getMyAccountDropdown()
    {
        return base.getElementWhenClickable(navBar).findElement(By.id("li_myaccount"));
    }

    public WebElement getLoginDropdownOption()
    {
        return base.getElementWhenClickable(navBar).findElement(By.xpath("//*[text()=' Login']"));
    }
}