package TestCases;

import PageObjects.LoginPage;
import PageObjects.ProductsPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginPage_LoginSuccess extends BaseTest{

    SoftAssert softAssert;

    @Test
    public void loginSuccessfully(){
        softAssert = new SoftAssert();
        loginPage.enterUserName(propertiesReader.getUserName());
        loginPage.enterPassword(propertiesReader.getPassword());
        loginPage.clickOnLoginBtn();
        softAssert.assertTrue(productsPage.isNavigatedToProductPage(), "User is not logged in successfully and not navigated to products");
        softAssert.assertAll();
    }
}
