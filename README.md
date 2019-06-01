

import pom.baseObjectPage.BaseElement;

import utility.enumBase.LocatorType;



public class PolicyPage {

    private BaseElement petPolicyNumberRadioButton = new BaseElement(LocatorType.XPATH, "//*[@id='registerForm']/div[1]/fieldset/div[2]/label", 10);
    private BaseElement petPolicyNumber = new BaseElement(LocatorType.ID, "policyNumber", 10);

    private BaseElement enterPolicyEmail = new BaseElement(LocatorType.ID, "registrationEmail", 10);
    private BaseElement nextButton = new BaseElement(LocatorType.ID, "registerSubmit", 10);

    private BaseElement submitEmailButton = new BaseElement(LocatorType.ID, "submitEmail", 10);


    public BaseElement getPetPolicyNumberRadioButton() {
        return petPolicyNumberRadioButton.get();
    }

    public BaseElement getPetPolicyNumber() {
        return petPolicyNumber.get();
    }

    public BaseElement getEnterPolicyEmail() {
        return enterPolicyEmail.get();
    }
    public BaseElement getNextButton(){

       return nextButton.get();
    }

    public BaseElement getSubmitEmailButton() {
        return submitEmailButton.get();
    }
}
