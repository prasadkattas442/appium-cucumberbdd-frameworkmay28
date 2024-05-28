package com.qa.stepdef;

import com.qa.pages.BasePage;
import com.qa.pages.LoginPage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

public class EndToEndDef extends BasePage {
    private AppiumDriver driver;
    @AndroidFindBy (xpath =
            "//android.widget.TextView[@content-desc=\"test-Item title\" and @text=\"Sauce Labs Onesie\"]")
    public WebElement element1;
    @AndroidFindBy (xpath =
            "//android.widget.TextView[@content-desc=\"test-Item title\" and @text=\"Sauce Labs Backpack\"]")
    private WebElement element2;
    @Given("user unlock device")
    public void user_unlock_device() throws MalformedURLException, InterruptedException {
        Thread.sleep(3000);
        unlock();
        Thread.sleep(3000);

    }

    @When("User enter username as {string}")
    public void iEnterUsernameAs(String username) throws InterruptedException {
        new LoginPage().enterUserName(username);
    }

    @When("User enter password as {string}")
    public void iEnterPasswordAs(String password) {
        new LoginPage().enterPassword(password);
    }

    @When("User click on login button")
    public void iLogin() {
        new LoginPage().pressLoginBtn();
    }
    @Then("User click on ADD TO CART button")
    public void add_the_product_to_the_cart() throws InterruptedException {

       Thread.sleep(3000);
        clickOnAddToCart();
        Thread.sleep(3000);
    }
    @Then("Scroll to required element {string}")
    public void scroll_to_required_element(String string) {
        scrollAction(string);

    }
    @Then("User click on ADD TO CART button1")
    public void user_click_on_add_to_cart_button() {
        clickOnAddToCart1();
    }


    @When("User click on cart page")
    public void i_click_on_cart_button() {
        clickOnCart();
    }

    @When("user click on Checkout")
    public void user_click_on_checkout() throws InterruptedException {
        Thread.sleep(3000);
        clickOnCheckOut();
    }

    @When("user enter address {string}, {string} and {string}")
    public void user_enter_address_and(String string, String string2, String string3) throws InterruptedException {
        enterAddress(string, string2, string3);
        Thread.sleep(3000);
        continues();
        Thread.sleep(3000);

    }

    @When("click on finish button")
    public void click_on_finish_button() throws InterruptedException {
        Thread.sleep(3000);
        finish();
        Thread.sleep(3000);
    }

    @When("Lock the device")
    public void lock_the_device() throws MalformedURLException, InterruptedException {
        Thread.sleep(3000);
        lock();

    }

}
