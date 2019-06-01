public class LoginPage extends BaseSteps {

    private BaseElement loginEmail = new BaseElement(LocatorType.ID, "loginEmail", 10);
    private BaseElement loginPassword = new BaseElement(LocatorType.ID, "loginPassword", 10);
    private BaseElement showForgottenPasswordModal = new BaseElement(LocatorType.ID, "showForgottenPasswordModal",10);
    private BaseElement rememberUsername = new BaseElement(LocatorType.ID, "rememberUsername", 10);
    private BaseElement loginSubmitButton = new BaseElement( LocatorType.ID,"loginSubmit",15);
    private BaseElement loginTab = new BaseElement(LocatorType.ID, "login-tab", 10);

//    public LoginPage(){
//
//        PageFactory.initElements(driver, this);
//    }

    public BaseElement getLoginEmail() {
        return loginEmail.get();

    }

    public BaseElement getLoginPassword() {
        return loginPassword.get();
    }

    public BaseElement getShowForgottenPasswordModal() {
        return showForgottenPasswordModal.get();
    }

    public BaseElement getRememberUsername() {
        return rememberUsername.get();
    }

    public BaseElement getLoginSubmitButton(){

        return loginSubmitButton.get();
    }
    public BaseElement getLoginTab(){

        return loginTab.get();
    }
}
