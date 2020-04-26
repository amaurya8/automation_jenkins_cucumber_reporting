package stepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"json:target/Destination/cucumber.json","html:target/cucumberHtmlReport"},
		features = "classpath:features",
		glue = {"classpath:stepDefinitions"}
)

public class RunCukeTest {
}
