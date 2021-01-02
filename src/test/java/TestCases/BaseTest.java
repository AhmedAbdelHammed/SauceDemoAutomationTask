package TestCases;

import PageObjects.CartPage;
import PageObjects.CheckoutPage;
import PageObjects.LoginPage;
import PageObjects.ProductsPage;
import Utilities.BrowserActions;
import Utilities.PropertiesReader;
import org.testng.annotations.*;

public class BaseTest {
    PropertiesReader propertiesReader;
    LoginPage loginPage;
    ProductsPage productsPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;

    @BeforeClass
    public void setup(){
        propertiesReader = new PropertiesReader();
        BrowserActions.navigateTo(propertiesReader.getURL());
        BrowserActions.maximizeBrowser();
        loginPage = new LoginPage();
        productsPage = new ProductsPage();
        cartPage = new CartPage();
        checkoutPage = new CheckoutPage();
    }

    @AfterSuite
    public void closeBrowser(){
        BrowserActions.closeBrowser();
    }
}
