package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

@RunWith(Cucumber.class)
public class actionsStepDefs {
        static WebDriver driver;
        static Actions action;
        @Given("^initialize the browser with chrome$")
        public void initialize_the_browser_with_chrome() throws Throwable {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\demir\\NAAutoBoot\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        @And("^ navigate to \"([^\"]*)\" website$")
        public void navigate_to_something_website(String strArg1) throws Throwable {
            driver.get(strArg1);

        }
        @When("^User selects \"([^\"]*)\" and \"([^\"]*)\"$")
        public void user_selects_something_and_something(String strArg1, String strArg2) throws Throwable {
            WebElement target = driver.findElement(By.id("dropdown-class-example"));
            Select s = new Select(target);
            s.selectByValue("option1");

        }
        @And("^User hovers over on \"([^\"]*)\" and click on \"([^\"]*)\" option$")  //"([^"]*)\--->Regular Expressions
        public void user_hovers_over_on_something_and_click_on_something_option(String strArg1, String strArg2) throws Throwable {

            action = new Actions(driver);
            WebElement hover = driver.findElement(By.id("mousehover"));
            action.moveToElement(hover).build().perform();
            Thread.sleep(5000);
        }

        @Then("^Validating the landing page$")
        public void validating_the_landing_page() throws Throwable {
            driver.findElement(By.xpath("//a[@href='#top']")).click();
            String Actualurl = driver.getCurrentUrl();
            String Expectedurl = "https://rahulshettyacademy.com/AutomationPractice/#top";
            Assert.assertEquals(Expectedurl, Actualurl, "fail");
            System.out.println(Actualurl);
        }

    }
