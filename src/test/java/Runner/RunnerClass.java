package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources\\.FeaturesFiles",
        glue = "StepDefinitions",
        dryRun = false,
        tags = ""

)
public class RunnerClass {

}
