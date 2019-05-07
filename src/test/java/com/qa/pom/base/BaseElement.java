package com.qa.pom.base;

import com.qa.base.SeleniumDriver;
import com.qa.utill.enums.ElementState;
import com.qa.utill.enums.LocatorType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BaseElement {

    private WebElement webElement;
    private LocatorType locatorType;
    private String locator;
    private int timeOut;
    protected static final SeleniumDriver driver = SeleniumDriver.getInstance();


    public BaseElement(LocatorType locatorType, String locator, int timeOut){
        this.locatorType = locatorType;
        this.locator = locator;
        this.timeOut = timeOut;
    }

    public String getLocatorInfo(){

        return "Found By "+ locatorType + "[" +locator+ "]";
    }

    public void findElement(ElementState elementState){
        switch (locatorType){
            case ID:
                webElement = driver.getElement(By.id(locator), elementState, timeOut);
                break;
            case XPATH:
                webElement = driver.getElement(By.xpath(locator),elementState, timeOut);
                break;
            case FORM_CONTROL_NAME:
                webElement = driver.getElement(By.xpath("//*[@formcontrolname=\"" + locator + "\"]"), elementState, timeOut);
                break;
        }
    }
    public BaseElement get(ElementState elementState){
        findElement(elementState);
        return this;
    }

    public BaseElement get(){
        return get(ElementState.CLICKABLE);
    }

}


