package PageObjects;

import Utilities.ElementsActions;

public class CheckoutPage {

    public boolean isNavigatedToCheckoutForm(){
        return ElementsActions.getText(ObjectRepo.CHECKOUT_PAGE_TITLE).
                equals("Checkout: Your Information");
    }

    public boolean isNavigatedToCheckoutConfirmation(){
        return ElementsActions.getText(ObjectRepo.CHECKOUT_PAGE_TITLE).
                equals("Checkout: Overview");
    }

    public void enterFirstName(String firstName){
        ElementsActions.fillTextField(ObjectRepo.CHECKOUT_PAGE_FIRST_NAME,firstName);
    }

    public void enterLastName(String lastName){
        ElementsActions.fillTextField(ObjectRepo.CHECKOUT_PAGE_LAST_NAME,lastName);
    }

    public void enterPostalCode(String postalCode){
        ElementsActions.fillTextField(ObjectRepo.CHECKOUT_PAGE_POSTAL_CODE,postalCode);
    }

    public void clickContinue(){
        ElementsActions.clickOnElement(ObjectRepo.CHECKOUT_PAGE_CONTINUE_BTN);
    }

    public void cancelCheckOutFromConfirmationPage(){
        ElementsActions.clickOnElement(ObjectRepo.CHECKOUT_SECOND_PAGE_CANCEL_BTN);
    }

    public void clickOnFinish(){
        ElementsActions.clickOnElement(ObjectRepo.CHECKOUT_SECOND_PAGE_FINISH_BTN);
    }

    public String getCheckoutMessage(){
        return ElementsActions.getText(ObjectRepo.CHECKOUT_FINAL_PAGE_MESSAGE);
    }
}
