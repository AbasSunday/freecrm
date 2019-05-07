package com.qa.pom.pages;

import com.qa.pom.base.BaseElement;
import com.qa.pom.base.BasePage;
import com.qa.utill.enums.LocatorType;

public class MainPage extends BasePage {

    private BaseElement getQuoteButton = new BaseElement(LocatorType.XPATH, "//*[text()='Get A Quote']", 10);


    public BaseElement getGetQuoteButton(){
        return getQuoteButton.get();
    }

}
