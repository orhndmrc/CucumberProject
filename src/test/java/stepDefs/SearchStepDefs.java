package stepDefs;

import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.CheckOutPage;
import pageObjects.Homepage;
import resources.Base;

import java.io.IOException;


public class SearchStepDefs {
   public WebDriver driver;
    Homepage h;
    CheckOutPage c;
    @Given("^User is on GreenCart landing page$")
    public void user_is_on_greencart_landing_page() throws IOException {
        driver=Base.getDriver();
    }

    @When("^User searched for (.+) Vegetable$")
    public void user_searched_for_something_vegetable(String fruit)  {
        h =new Homepage(driver);
        h.getSearch().sendKeys(fruit);
    }
    @Then("^(\\w+) results are displayed$")
    public void something_results_are_displayed(String fruit)  {
        Assert.assertTrue(h.nameValidation().getText().contains(fruit));
    }
    @Then("^verify selected (.+) items are displayed in checkout page$")
    public void verify_selected_brinjal_items_are_displayed_in_checkout_page(String fruit)  {
        Assert.assertTrue(h.nameValidation1().getText().contains(fruit));
    }
    @And("^Added items to cart$")
    public void added_items_to_cart()  {
         c = new CheckOutPage(driver);
         c.productAmount();
         c.addingToCart();
    }
    @And("^User proceeded to Checkout page for purchase$")
    public void user_proceeded_to_checkout_page_for_purchase()  {
        c.select();
        c.checkout();
    }

}
