package stepDefinition;

import org.junit.runner.RunWith;  
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/krish/workspace1/Cucumber_Selenium/src/test/resources", 
				 glue = { "stepDefinition" }, 
				 plugin = { "pretty","junit:target/test.xml" })
public class SearchRunner {

}
