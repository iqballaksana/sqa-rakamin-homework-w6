package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import objectRepository.addCartButton;

import static config.env.driver;

public class addCart {
    public int duration = 10;
    WebDriverWait wait = new WebDriverWait(driver, duration);
    addCartButton elementAddCart = new addCartButton();

    @When("user click button add cart")
    public void user_click_button_add_cart() {
        WebElement btn_add_cart_backpack = driver.findElement(elementAddCart.getBtn_add_cart_backpack());
        btn_add_cart_backpack.click();
    }
    @And("user click another button add cart")
    public void user_click_another_button_add_cart() {
        WebElement btn_add_cart_bike = driver.findElement(elementAddCart.getBtn_add_cart_bike());
        btn_add_cart_bike.click();
    }
    @And("user click icon cart")
    public void user_click_icon_cart() {
        WebElement btn_icon_cart = driver.findElement(elementAddCart.getBtn_icon_cart());
        btn_icon_cart.click();
    }
    @Then("in my cart page will see a product being added")
    public void user_my_cart_page_will_see_a_product_being_added(){
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementAddCart.getList_product())
        );
    }
}
