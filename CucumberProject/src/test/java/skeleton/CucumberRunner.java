package skeleton;

import org.junit.runner.RunWith;


import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","html:src/cucumber-reports"},monochrome=true,
features= {"src/test/resources/skeleton/login.feature"})

public class CucumberRunner {
	

}
