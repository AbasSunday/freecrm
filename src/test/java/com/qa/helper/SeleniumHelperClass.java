package com.qa.helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SeleniumHelperClass {


    private WebElement webElement;

    public void selectDropDown(){
        Select select = new Select(webElement);
        select.selectByVisibleText("");
    }

}
