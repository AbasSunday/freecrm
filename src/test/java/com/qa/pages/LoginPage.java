package com.qa.pages;

import com.qa.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
    // ==================================================
    // WEB ELEMENTS
    // ==================================================

    @FindBy (name = "username")
    WebElement emailInput;

    @FindBy (name = "password")
    WebElement passwordInput;

    @FindBy (xpath = "//button[text()='Login']")
    WebElement loginButton;

    // ==================================================
    // VARIABLES
    // ==================================================

    private Base base = Base.getInstance();

    // ==================================================
    // CONSTRUCTOR
    // ==================================================

    public LoginPage()
    {
        PageFactory.initElements(base.getWebDriver(), this);
    }

    // ==================================================
    // GETTERS AND SETTERS
    // ==================================================

    public WebElement getEmailInput()
    {
        return base.getElementWhenClickable(emailInput);
    }

    public WebElement getPasswordInput()
    {
        return base.getElementWhenClickable(passwordInput);
    }

    public WebElement getLoginButton()
    {
        return base.getElementWhenClickable(loginButton);
    }
}