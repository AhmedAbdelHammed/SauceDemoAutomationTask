package TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Arrays;
import java.util.List;

public class ProductsPage_CartTests extends BaseTest{
    SoftAssert softAssert;
    int numberOfProductsAddedToCart = 0;
    List<Integer> productsIndices = Arrays.asList(1,2);

    @BeforeClass
    public void beforeClass(){
        loginPage.enterUserName(propertiesReader.getUserName());
        loginPage.enterPassword(propertiesReader.getPassword());
        loginPage.clickOnLoginBtn();
    }

    @Test
    public void addProductToCart(){
        softAssert = new SoftAssert();
        productsPage.addProductToCart(productsIndices.get(0));
        productsPage.addProductToCart(productsIndices.get(1));
        numberOfProductsAddedToCart = numberOfProductsAddedToCart + 2;
        softAssert.assertEquals(productsPage.getCartCounter(),numberOfProductsAddedToCart,
                "Number of products added to cart is invalid");
        softAssert.assertAll();
    }

    @Test (dependsOnMethods = "addProductToCart")
    public void removeProductFromCart(){
        softAssert = new SoftAssert();
        productsPage.removeProductFromCart(productsIndices.get(0));
        numberOfProductsAddedToCart--;
        softAssert.assertEquals(productsPage.getCartCounter(),numberOfProductsAddedToCart,
                "Number of products after removing from cart is invalid");
        softAssert.assertAll();
    }

    @AfterClass
    public void resetCart(){
        if(numberOfProductsAddedToCart!=0){
            for(int i=0; i<numberOfProductsAddedToCart;i++){
                productsPage.removeProductFromCart(i+1);
            }
        }
    }
}
