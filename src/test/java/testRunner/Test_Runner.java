package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
 //feature
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepDefs",
        plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json"}//gives us a report under target file


)

public class Test_Runner {
}
