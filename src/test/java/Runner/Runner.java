package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\nugoyal\\IdeaProjects\\AutomationKT\\src\\test\\resources\\features",  // Path to your feature files
        glue = "C:\\Users\\nugoyal\\IdeaProjects\\AutomationKT\\src\\test\\java\\StepDefinations"      // Package containing your step definitions
        )

public class Runner {

}