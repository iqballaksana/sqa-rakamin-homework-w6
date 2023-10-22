package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.addCartButton;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import objectRepository.paymentPage;

import static config.env.driver;

public class payment {
    public int duration = 10;
    WebDriverWait wait = new WebDriverWait(driver, duration);
    paymentPage elementPayment = new paymentPage();

    @When("user click checkout button")
    public void user_click_checkout_button(){
        WebElement btn_checkout = driver.findElement(elementPayment.getBtn_checkout());
        btn_checkout.click();
    }
    @Then("user redirected to checkout page")
    public void user_redirected_to_checkout_page(){
        wait.until(
            ExpectedConditions.visibilityOfElementLocated(elementPayment.getBtn_continue())
        );
    }
    @When("user input (.*) as firstname$")
    public void user_input_firstname(String firstname){
        WebElement field_firstname = driver.findElement(elementPayment.getField_firstname());
        field_firstname.isDisplayed();
        field_firstname.sendKeys(firstname);
    }
    @And("user input (.*) as last_name$")
    public void user_input_last_name(String last_name){
        WebElement field_last_name = driver.findElement(elementPayment.getField_lastname());
        field_last_name.isDisplayed();
        field_last_name.sendKeys(last_name);
    }
    @And("user input (.*) as postal_code$")
    public void user_input_postal_code(Integer postal_code){
        WebElement field_postal_code = driver.findElement(elementPayment.getField_postalcode());
        field_postal_code.isDisplayed();
        field_postal_code.sendKeys(String.valueOf(postal_code));
    }
    @And("user click button continue")
    public void user_click_button_continue(){
        WebElement btn_continue = driver.findElement(elementPayment.getBtn_continue());
        btn_continue.click();
    }
    @Then("user redirected to checkout overview page")
    public void user_redirected_to_checkout_overview_page(){
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementPayment.getBtn_finish())
        );
    }
    @When("user click button finish")
    public void user_click_button_finish(){
        WebElement btn_finish = driver.findElement(elementPayment.getBtn_finish());
        btn_finish.click();
    }
    @Then("user redirected to complete checkout page")
    public void user_redirected_to_complete_checkout_page(){
        wait.until(
                ExpectedConditions.urlMatches("https://www.saucedemo.com/checkout-complete.html")
        );
    }
}
