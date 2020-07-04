package stepDefs;

import io.cucumber.java.en.*;

public class Prerequisite {
    @Given("^validate the browser$")
    public void validate_the_browser() {
        System.out.println("deciding the browser to open");
    }

    @When("^browser is triggered$")
    public void browser_is_triggered() {
        System.out.println("Browser is triggered");
    }

    @Then("^check if browser is started$")
    public void check_if_browser_is_started(){
        System.out.println("Browser is started");
    }

}
