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

    @FindBy(xpath = "//*[text()=' Login']")
    WebElement loginElement;

    @FindBy(xpath = "//*[@id='li_myaccount']/a")
    WebElement myAccountElement;

    @FindBy()
    WebElement titlePageText;

    // ==================================================
    // CONSTRUCTOR
    // ==================================================

    // ==================================================
    // GETTERS AND SETTERS
    // ==================================================


    public WebElement getMyAccountDropdown()
    {
        return base.getElementWhenClickable(navBar).findElement(By.id(String.valueOf(myAccountElement)));
    }

    public WebElement getLoginDropdownOption()
    {
        return base.getElementWhenClickable(navBar).findElement(By.xpath(String.valueOf(loginElement)));
    }

    public String getPageTitle(){
        return base.getTitle();
    }
}