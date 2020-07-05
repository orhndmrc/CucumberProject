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
import resources.Base;


public class SearchStepDefs {
   public WebDriver driver;
    @Given("^User is on GreenCart landing page$")
    public void user_is_on_greencart_landing_page()  {
        driver=Base.getDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    }
    @When("^User searched for (\\w+) Vegetable$")
    public void user_searched_for_something_vegetable(String fruit)  {
        driver.findElement(By.xpath("//input[@class='search-keyword']")).sendKeys(fruit);
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h4.product-name")));
    }
    @Then("^(\\w+) results are displayed$")
    public void something_results_are_displayed(String fruit)  {
        Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(fruit));
    }
    @Then("^verify selected (\\w+) items are displayed in checkout page$")
    public void verify_selected_brinjal_items_are_displayed_in_checkout_page(String fruit)  {
        Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(fruit));
    }
    @And("^Added items to cart$")
    public void added_items_to_cart()  {
        driver.findElement(By.cssSelector("a.increment")).click();
        driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
    }
    @And("^User proceeded to Checkout page for purchase$")
    public void user_proceeded_to_checkout_page_for_purchase()  {
        driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
    }

}
