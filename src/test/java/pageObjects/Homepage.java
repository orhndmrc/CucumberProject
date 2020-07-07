package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {
    public WebDriver driver;

    public Homepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    By search = By.xpath("//input[@class='search-keyword']");

    public WebElement getSearch(){
        driver.findElement(search);
        return driver.findElement(search);

    }

    By product = By.cssSelector("h4.product-name");

    public WebElement nameValidation(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(product));
        return driver.findElement(product);
    }

    By product1 = By.cssSelector("p.product-name");
    public WebElement nameValidation1(){
        return driver.findElement(product1);
    }
}
