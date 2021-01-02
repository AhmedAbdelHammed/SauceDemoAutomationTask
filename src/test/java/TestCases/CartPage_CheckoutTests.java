package TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Arrays;
import java.util.List;

public class CartPage_CheckoutTests extends BaseTest{
    SoftAssert softAssert;
    int numberOfProductsAddedToCart = 0;
    List<Integer> productsIndices = Arrays.asList(1,2);
    static String checkoutMessage = "THANK YOU FOR YOUR ORDER";

    @BeforeClass
    public void beforeClass(){
        loginPage.enterUserName(propertiesReader.getUserName());
        loginPage.enterPassword(propertiesReader.getPassword());
        loginPage.clickOnLoginBtn();
        productsPage.addProductToCart(productsIndices.get(0));
        productsPage.addProductToCart(productsIndices.get(1));
        numberOfProductsAddedToCart = numberOfProductsAddedToCart + 2;
    }

    @Test
    public void viewCartAndValidateCount(){
        softAssert = new SoftAssert();
        productsPage.clickOnCart();
        softAssert.assertTrue(cartPage.isNavigatedToCart(), "User is not navigated to cart");
        softAssert.assertEquals(cartPage.getCartItemsCount(),numberOfProductsAddedToCart,
                "Number of items in cart is invalid");
        softAssert.assertAll();
    }

    @Test(dependsOnMethods = "viewCartAndValidateCount")
    public void navigateToCheckoutForm(){
        softAssert = new SoftAssert();
        cartPage.clickOnCheckout();
        softAssert.assertTrue(checkoutPage.isNavigatedToCheckoutForm(),"User is not navigated to checkout form");
        softAssert.assertAll();
    }

    @Test(dependsOnMethods = "navigateToCheckoutForm")
    public void fillCheckoutInformation(){
        softAssert = new SoftAssert();
        checkoutPage.enterFirstName(propertiesReader.getCheckOutFirstName());
        checkoutPage.enterLastName(propertiesReader.getCheckOutLastName());
        checkoutPage.enterPostalCode(propertiesReader.getCheckOutPostalCode());
        checkoutPage.clickContinue();
        softAssert.assertTrue(checkoutPage.isNavigatedToCheckoutConfirmation(),
                "User is not navigated to checkout confirmation page");
        softAssert.assertAll();
    }

    @Test(dependsOnMethods = "fillCheckoutInformation")
    public void cancelCheckout(){
        softAssert = new SoftAssert();
        checkoutPage.cancelCheckOutFromConfirmationPage();
        softAssert.assertTrue(productsPage.isNavigatedToProductPage(),
                "User should be navigated to product page after cancellation");
        softAssert.assertAll();
    }

    @Test(dependsOnMethods = "cancelCheckout")
    public void removeItemFromCart(){
        softAssert = new SoftAssert();
        productsPage.clickOnCart();
        cartPage.removeProductFromCartByIndex(productsIndices.get(0));
        numberOfProductsAddedToCart--;
        softAssert.assertEquals(cartPage.getCartItemsCount(),numberOfProductsAddedToCart
        ,"Product is not removed from cart");
        softAssert.assertAll();
    }

    @Test(dependsOnMethods = "removeItemFromCart")
    public void completeCheckout(){
        softAssert = new SoftAssert();
        cartPage.clickOnCheckout();
        checkoutPage.enterFirstName(propertiesReader.getCheckOutFirstName());
        checkoutPage.enterLastName(propertiesReader.getCheckOutLastName());
        checkoutPage.enterPostalCode(propertiesReader.getCheckOutPostalCode());
        checkoutPage.clickContinue();
        checkoutPage.clickOnFinish();
        softAssert.assertEquals(checkoutPage.getCheckoutMessage()
                ,checkoutMessage,"Checkout is not completed successfully");
        softAssert.assertAll();
    }
}
