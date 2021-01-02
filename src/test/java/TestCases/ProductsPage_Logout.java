package TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ProductsPage_Logout extends BaseTest{
    SoftAssert softAssert;

    @BeforeClass
    public void beforeClass(){
        loginPage.enterUserName(propertiesReader.getUserName());
        loginPage.enterPassword(propertiesReader.getPassword());
        loginPage.clickOnLoginBtn();
    }

    @Test
    public void logout(){
        softAssert = new SoftAssert();
        productsPage.clickOnBurgerMenu();
        productsPage.clickOnLogout();
        softAssert.assertTrue(loginPage.isNavigatedToLogin(), "User is not logged out successfully");
        softAssert.assertAll();
    }
}
