package Runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/resources/features", glue = "Test", tags = "@Test", // @smoke and
																											// not @ct01
		dryRun = false, monochrome = true, plugin = { "pretty", "json:target/cucumber-report.json",
				"html:target/cucumber-report.html" }

)
public class Executar {

}
