package stepDefinitions;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import objectRepository.loginPage;

import static config.env.driver;

public class login {
    public int duration = 10;
    WebDriverWait wait = new WebDriverWait(driver, duration);
    loginPage elementLogin = new loginPage();

    @Given("user in on saucedemo login page")
    public void user_is_on_saucedemo_login_page() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementLogin.getBtn_login())
        );
    }
    @When("user input (.*) as username$")
    public void user_input_username(String username) {
        WebElement field_username = driver.findElement(elementLogin.getField_username());
        field_username.isDisplayed();
        field_username.sendKeys(username);
    }
    @And("user input (.*) as password$")
    public void user_input_password(String password) {
        WebElement field_password = driver.findElement(elementLogin.getField_password());
        Assert.assertTrue(field_password.isEnabled());
        field_password.sendKeys(password);
    }
    @And("user click enter")
    public void user_click_enter() {
        WebElement btn_login = driver.findElement(elementLogin.getBtn_login());
        btn_login.sendKeys(Keys.ENTER);
    }
    @Then("user verify (.*) login result$")
    public void user_verify_success_login_result(String status) {
        if (status.contains("success")){
            wait.until(
                    ExpectedConditions.presenceOfElementLocated(By.className("inventory_container"))
            );
        }else{
            driver.findElement(By.className("error"));
        }
    }
}
