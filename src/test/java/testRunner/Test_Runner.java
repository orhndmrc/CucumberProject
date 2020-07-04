package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
 //feature
@RunWith(Cucumber.class)
@CucumberOptions(
        //dryRun = true,---> to figure out whether steps mappep to step definitions.
        features = "src/test/java/features",
        glue = "stepDefs",
        tags = "@smoke or @regression or @mobile",
        plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json","junit:target/cukes.xml"}//gives us a report under target file

)
public class Test_Runner {
}
