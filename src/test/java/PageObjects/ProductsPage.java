package PageObjects;

import Utilities.CommonActions;
import Utilities.ElementsActions;
import java.util.List;


public class ProductsPage {
    public boolean isNavigatedToProductPage(){
        return ElementsActions.getText(ObjectRepo.PRODUCTS_PAGE_TITLE).equals("Products");
    }

    public void sortProducts(String option){
        ElementsActions.selectElementFromDropdown(ObjectRepo.PRODUCTS_PAGE_SORT_DROPDOWN,option);
    }

    public Boolean isProductsSortedFromAtoZ(){
        List<String> productsRetrieved = ElementsActions.getElementsText(ObjectRepo.PRODUCTS_PAGE_NAMES);
        List<String> productsSorted = CommonActions.sortListFromAtoZ(productsRetrieved);
        return productsRetrieved.equals(productsSorted);
    }

    public Boolean isProductsSortedFromZtoA(){
        List<String> productsRetrieved = ElementsActions.getElementsText(ObjectRepo.PRODUCTS_PAGE_NAMES);
        List<String> productsSorted = CommonActions.sortListFromZtoA(productsRetrieved);
        return productsRetrieved.equals(productsSorted);
    }

    public Boolean isProductsSortedFromLtoH(){
        List<String> productsPricesRetrieved = ElementsActions.getElementsText(ObjectRepo.PRODUCTS_PAGE_PRICES);
        List<Float> productsPricesSorted = CommonActions.sortListFromLtoH(productsPricesRetrieved);
        return CommonActions.convertStringPriceListToFloat(productsPricesRetrieved).equals(productsPricesSorted);
    }

    public Boolean isProductsSortedFromHtoL(){
        List<String> productsPricesRetrieved = ElementsActions.getElementsText(ObjectRepo.PRODUCTS_PAGE_PRICES);
        List<Float> productsPricesSorted = CommonActions.sortListFromHtoL(productsPricesRetrieved);
        return CommonActions.convertStringPriceListToFloat(productsPricesRetrieved).equals(productsPricesSorted);
    }

    public void addProductToCart(int index){
        ElementsActions.clickOnElementFromListByIndex(index,ObjectRepo.PRODUCTS_PAGE_ADD_TO_CART_BTN);
    }

    public void removeProductFromCart(int index){
        ElementsActions.clickOnElementFromListByIndex(index,ObjectRepo.PRODUCTS_PAGE_REMOVE_FROM_CART_BTN);
    }

    public int getCartCounter(){
        return Integer.parseInt(ElementsActions.getText(ObjectRepo.PRODUCTS_PAGE_CART_COUNTER));
    }

    public void clickOnCart(){
        ElementsActions.clickOnElement(ObjectRepo.PRODUCTS_PAGE_CART_BTN);
    }

    public void clickOnBurgerMenu(){
        ElementsActions.clickOnElement(ObjectRepo.GENERIC_BURGER_MENU);
    }

    public void clickOnLogout(){
        ElementsActions.clickOnElement(ObjectRepo.GENERIC_LOGOUT_BTN);
    }

}
