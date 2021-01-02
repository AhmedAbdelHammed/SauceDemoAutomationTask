package PageObjects;

import Utilities.ElementsActions;

public class LoginPage {

    public boolean isNavigatedToLogin(){
        return ElementsActions.isElementExistOnPage(ObjectRepo.LOGIN_PAGE_BTN);
    }

    public void enterUserName(String userName){
        ElementsActions.fillTextField(ObjectRepo.LOGIN_PAGE_USERNAME, userName);
    }

    public void enterPassword(String password){
        ElementsActions.fillTextField(ObjectRepo.LOGIN_PAGE_PASSWORD,password);
    }

    public void clickOnLoginBtn(){
        ElementsActions.clickOnElement(ObjectRepo.LOGIN_PAGE_BTN);
    }
}
