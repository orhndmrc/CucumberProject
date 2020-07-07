package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutPage {
    public WebDriver driver;

    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }
    @FindBy(css = "a.increment")
    WebElement increment;

    @FindBy(xpath = "//button[text()='ADD TO CART']")
    WebElement addToCart;

    @FindBy(xpath = "//a[@class='cart-icon']//img[contains(@class,'')]")
    WebElement select;

    @FindBy(xpath = "//button[text()='PROCEED TO CHECKOUT']")
    WebElement proceedToCheckout;
 public void productAmount(){
     WebDriverWait wait = new WebDriverWait(driver,10);
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.increment")));
     increment.click();
 }
    public void addingToCart(){
        addToCart.click();
    }
    public void select(){
        select.click();
    }
    public void checkout(){
        proceedToCheckout.click();
    }
}
