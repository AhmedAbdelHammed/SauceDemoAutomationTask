package PageObjects;

import org.openqa.selenium.By;

public class ObjectRepo {

    //LoginPageLocators
    public static By LOGIN_PAGE_USERNAME = By.id("user-name");
    public static By LOGIN_PAGE_PASSWORD = By.id("password");
    public static By LOGIN_PAGE_BTN = By.id("login-button");

    //ProductsPageLocators
    public static By PRODUCTS_PAGE_TITLE = By.className("product_label");
    public static By PRODUCTS_PAGE_SORT_DROPDOWN = By.className("product_sort_container");
    public static By PRODUCTS_PAGE_NAMES = By.className("inventory_item_name");
    public static By PRODUCTS_PAGE_PRICES = By.xpath("//div[@class='inventory_item_price']");
    public static By PRODUCTS_PAGE_ADD_TO_CART_BTN = By.xpath("//button[@class='btn_primary btn_inventory']");
    public static By PRODUCTS_PAGE_REMOVE_FROM_CART_BTN = By.xpath("//button[@class='btn_secondary btn_inventory']");
    public static By PRODUCTS_PAGE_CART_COUNTER = By.xpath("//div[@id='shopping_cart_container']/a/span");
    public static By PRODUCTS_PAGE_CART_BTN = By.xpath("//div[@id='shopping_cart_container']/a");
    public static By GENERIC_BURGER_MENU = By.className("bm-burger-button");
    public static By GENERIC_LOGOUT_BTN = By.id("logout_sidebar_link");

    //CartPageLocators
    public static By CART_PAGE_TITLE = By.className("subheader");
    public static By CART_PAGE_REMOVE_FROM_CART_BTN = By.xpath("//button[@class='btn_secondary cart_button']");
    public static By CART_PAGE_CHECKOUT_BTN = By.xpath("//a[@class='btn_action checkout_button']");

    //CheckoutPageLocators
    public static By CHECKOUT_PAGE_FIRST_NAME = By.id("first-name");
    public static By CHECKOUT_PAGE_LAST_NAME = By.id("last-name");
    public static By CHECKOUT_PAGE_POSTAL_CODE = By.id("postal-code");
    public static By CHECKOUT_PAGE_CONTINUE_BTN = By.xpath("//input[@class='btn_primary cart_button']");
    public static By CHECKOUT_PAGE_TITLE = By.className("subheader");
    public static By CHECKOUT_SECOND_PAGE_FINISH_BTN = By.xpath("//a[@class='btn_action cart_button']");
    public static By CHECKOUT_SECOND_PAGE_CANCEL_BTN = By.xpath("//a[@class='cart_cancel_link btn_secondary']");
    public static By CHECKOUT_FINAL_PAGE_MESSAGE = By.className("complete-header");
}
