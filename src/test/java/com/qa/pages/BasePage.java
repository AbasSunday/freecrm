package com.qa.pages;

import com.qa.base.Base;
import org.openqa.selenium.support.PageFactory;

public class BasePage
{
    // ==================================================
    // VARIABLES
    // ==================================================

    protected Base base = Base.getInstance();

    // ==================================================
    // CONSTRUCTOR
    // ==================================================

    public BasePage()
    {
        PageFactory.initElements(base.getWebDriver(), this);
    }
}