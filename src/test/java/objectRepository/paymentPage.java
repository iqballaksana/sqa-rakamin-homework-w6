package objectRepository;

import org.openqa.selenium.By;

public class paymentPage {
    // my cart page
    By btn_checkout = By.id("checkout");

    // checkout page
    By field_firstname = By.id("first-name");
    By field_lastname = By.id("last-name");
    By field_postalcode = By.id("postal-code");
    By btn_continue = By.id("continue");

    // checkout overview page
    By btn_finish = By.id("finish");

    // my cart page
    public By getBtn_checkout() { return btn_checkout; }

    // checkout page
    public By getField_firstname() { return field_firstname; }
    public By getField_lastname() { return field_lastname; }
    public By getField_postalcode() { return field_postalcode; }
    public By getBtn_continue() { return btn_continue; }

    // checkout overview page
    public By getBtn_finish() { return btn_finish; }
}
