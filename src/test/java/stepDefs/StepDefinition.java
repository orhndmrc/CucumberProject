package stepDefs;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

public class StepDefinition {

        @Given("^User is on NetBanking landing page$")
        public void user_is_on_netbanking_landing_page()  {
          //code to navigate to login url
                System.out.println("navigated to login url");
        }

        @Then("^Homepage is populated$")
        public void homepage_is_populated()  {
            //home page validation
                System.out.println("Validated home page");
        }
        @When("^User log into app with username \"([^\"]*)\" and password \"([^\"]*)\"$")
        public void user_log_into_app_with_username_something_and_password_something(String strArg1, String strArg2)  {
//write codes to login with different users
                System.out.println(strArg1);
                System.out.println(strArg2);
        }
        @And("^Cards are displayed \"([^\"]*)\"$")
        public void cards_are_displayed_something(String strArg1) {
                System.out.println(strArg1);
        }

    }

