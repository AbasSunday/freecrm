package com.qa.pom.pages;

import com.qa.pom.base.BaseElement;
import com.qa.utill.enums.LocatorType;

public class DetailsPage {

    private BaseElement petName = new BaseElement(LocatorType.FORM_CONTROL_NAME, "//*[text()='Get A Quote']", 10);
    private BaseElement petType = new BaseElement(LocatorType.FORM_CONTROL_NAME, "//*[text()='Get A Quote']", 10);
    private BaseElement petBreedType = new BaseElement(LocatorType.FORM_CONTROL_NAME, "//*[text()='Get A Quote']", 10);



}
