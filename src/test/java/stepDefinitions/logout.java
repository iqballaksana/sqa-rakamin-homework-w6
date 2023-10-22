package stepDefinitions;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import objectRepository.logoutMenu;

import static config.env.driver;

public class logout {

    public int duration = 10;
    WebDriverWait wait = new WebDriverWait(driver, duration);
    logoutMenu elementLogout = new logoutMenu();

    @When("user click icon react burger")
    public void user_click_icon_react_burger() {
        WebElement btn_react_burger_menu = driver.findElement(elementLogout.getBtn_react_burger_menu());
        btn_react_burger_menu.click();
    }
    @And("user click logout link")
    public void user_click_logout_link() {
        wait.until(
                ExpectedConditions.presenceOfElementLocated(By.id("logout_sidebar_link"))
        );

        WebElement btn_logout = driver.findElement(elementLogout.getBtn_logout());
        btn_logout.sendKeys(Keys.ENTER);
    }
    @Then("user redirect to login page")
    public void user_redirect_to_login_(){
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementLogout.getBtn_login())
        );
    }
}
