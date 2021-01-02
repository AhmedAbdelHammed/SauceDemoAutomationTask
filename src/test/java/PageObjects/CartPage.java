package PageObjects;

import Utilities.ElementsActions;

public class CartPage {

    public boolean isNavigatedToCart(){
        return ElementsActions.getText(ObjectRepo.CART_PAGE_TITLE).equals("Your Cart");
    }

    public void removeProductFromCartByIndex(int index){
        ElementsActions.clickOnElementFromListByIndex(index,ObjectRepo.CART_PAGE_REMOVE_FROM_CART_BTN);
    }

    public int getCartItemsCount(){
        return ElementsActions.getElementsCount(ObjectRepo.CART_PAGE_REMOVE_FROM_CART_BTN);
    }

    public void clickOnCheckout(){
        ElementsActions.clickOnElement(ObjectRepo.CART_PAGE_CHECKOUT_BTN);
    }

}
