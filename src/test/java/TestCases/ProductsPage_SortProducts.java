package TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class ProductsPage_SortProducts extends BaseTest{

    SoftAssert softAssert;

    @BeforeClass
    public void beforeClass(){
        loginPage.enterUserName(propertiesReader.getUserName());
        loginPage.enterPassword(propertiesReader.getPassword());
        loginPage.clickOnLoginBtn();
    }

    @Test
    public void sortProductFromAtoZ(){
        softAssert = new SoftAssert();
        productsPage.sortProducts("az");
        softAssert.assertTrue(productsPage.isProductsSortedFromAtoZ(),"Products Sorting from A to Z is not working");
        softAssert.assertAll();
    }

    @Test
    public void sortProductFromZtoA(){
        softAssert = new SoftAssert();
        productsPage.sortProducts("za");
        softAssert.assertTrue(productsPage.isProductsSortedFromZtoA(),"Products Sorting from Z to A is not working");
        softAssert.assertAll();
    }

    @Test
    public void sortProductFromLtoH(){
        softAssert = new SoftAssert();
        productsPage.sortProducts("lohi");
        softAssert.assertTrue(productsPage.isProductsSortedFromLtoH(),"Products Sorting from Low to High is not working");
        softAssert.assertAll();
    }

    @Test
    public void sortProductFromHtoL(){
        softAssert = new SoftAssert();
        productsPage.sortProducts("hilo");
        softAssert.assertTrue(productsPage.isProductsSortedFromHtoL(),"Products Sorting from High to Low is not working");
        softAssert.assertAll();
    }
}
