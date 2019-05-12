package com.qa.pom.pages;

import com.qa.pom.base.BaseElement;
import com.qa.pom.base.BasePage;
import com.qa.pom.elements.PetTypeSelector;
import com.qa.utill.enums.LocatorType;

public class QuoteDetailsPage extends BasePage
{
    private BaseElement petNameInput = new BaseElement(LocatorType.ID, "pets.0.name", 10);
    private PetTypeSelector petTypeSelector = new PetTypeSelector("//div[@name='pets.0.type']");

    public BaseElement getPetNameInput()
    {
        return petNameInput.get();
    }

    public PetTypeSelector getPetTypeSelector() {
        return petTypeSelector.get();
    }
}
