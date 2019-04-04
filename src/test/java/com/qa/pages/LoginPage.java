package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
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