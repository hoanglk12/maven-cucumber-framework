package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/liveguru/features", 
		glue = "liveguru.stepDefinitions", 
		monochrome = true, 
		plugin = { "pretty", "html:target/site/cucumber-report-default", "json:target/site/cucumber_liveGuru.json" }, 
		snippets = SnippetType.CAMELCASE, 
		tags = {"@register_and_login"})
public class LiveGuruTestRunner {

}
