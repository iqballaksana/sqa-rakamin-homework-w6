package objectRepository;

import org.openqa.selenium.By;

public class loginPage {
    By field_username = By.id("user-name");

    By field_password = By.id("password");

    By btn_login = By.id("login-button");

    public By getField_username(){
        return field_username;
    }

    public By getField_password(){
        return field_password;
    }
    public By getBtn_login(){
        return btn_login;
    }
}
