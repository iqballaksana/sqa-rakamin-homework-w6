package objectRepository;

import org.openqa.selenium.By;

public class addCartButton {
    // login page
    By field_username = By.id("user-name");
    By field_password = By.id("password");
    By btn_login = By.id("login-button");

    // product page
    By btn_add_cart_backpack = By.id("add-to-cart-sauce-labs-backpack");
    By btn_add_cart_bike = By.id("add-to-cart-sauce-labs-bike-light");
    By btn_icon_cart = By.id("shopping_cart_container");

    // my cart page
    By list_product = By.className("cart_item");

    // login page
    public By getField_username(){
        return field_username;
    }
    public By getField_password(){
        return field_password;
    }
    public By getBtn_login(){
        return btn_login;
    }

    // product page
    public By getBtn_add_cart_backpack(){ return btn_add_cart_backpack; }
    public By getBtn_add_cart_bike(){ return btn_add_cart_bike; }
    public By getBtn_icon_cart(){ return btn_icon_cart; }

    // my cart page
    public By getList_product(){ return list_product; }
}
