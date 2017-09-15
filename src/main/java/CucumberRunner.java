import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by drygoi on 20.05.17.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        // нужно заменить директории для работы в Windows.
//        format={"pretty", "src/target/report.html"},
        features={"src/main/resources"},
//      format={"pretty", "html:${HOME}/IdeaProjects/CucumberForPractise/src/target/report.html"},
//      features={"${HOME}/IdeaProjects/CucumberForPractise/src/main/resources"},
        glue = {"StepsDefinition"},
        tags = {"@Test1"}

)

public class CucumberRunner {
}
