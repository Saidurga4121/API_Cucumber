package cucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		glue={"stepDefinitions"}  
	//	tags= {"@AddPlaceAPI"}
				)
public class TestRunner 
{
	// command to run from cmd mvn test -Dcucumber.options="--tags @AddPlace"
}
