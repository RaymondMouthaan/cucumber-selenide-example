import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports/html-report", "json:target/cucumber-reports/cucumber.json"},
        features = "src/test/resources/features",
        glue = {"org.mouthaan.google.steps"}
)
public class CucumberSelenideGoogleTest {
}
