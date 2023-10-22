package objectRepository;

import org.openqa.selenium.By;

public class logoutMenu {

    By btn_login = By.id("login-button");
    By field_password = By.id("password");
    By field_username = By.id("user-name");
    By btn_react_burger_menu = By.id("react-burger-menu-btn");
    By btn_logout = By.id("logout_sidebar_link");

    public By getBtn_react_burger_menu() {
        return btn_react_burger_menu;
    }
    public By getBtn_logout() {
        return btn_logout;
    }
    public By getBtn_login(){
        return btn_login;
    }
    public By getField_username(){
        return field_username;
    }

    public By getField_password(){
        return field_password;
    }
}
