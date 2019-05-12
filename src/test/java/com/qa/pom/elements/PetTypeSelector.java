package com.qa.pom.elements;

import com.qa.pom.base.BaseElement;
import com.qa.utill.Utils;
import com.qa.utill.enums.ElementState;
import com.qa.utill.enums.LocatorType;
import com.qa.utill.enums.PetType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PetTypeSelector extends BaseElement
{
    public PetTypeSelector(String xpath)
    {
        super(LocatorType.XPATH, xpath, 10);
    }

    public void selectPeType(PetType petType)
    {
        WebElement input = webElement.findElement(By.xpath("//input[@value='" + Utils.getPetTypeName(petType) + "']"));
        clickWithJavaScript(input);
    }

    public PetTypeSelector get()
    {
        findElement(ElementState.CLICKABLE);
        return this;
    }
}
