package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\003KT8744\\eclipse-workspace\\CucumberFramework\\src\\main\\java\\Features\\loginn.feature"
		,glue={"stepDefinitions"},
		format= {"pretty","html:test-output/cucumber-reports/report.html", 
				           "json:json_output/cucumber.json",
				           "junit:junit_output/cucumber.xml"},
		strict = true,// it will check the mapping ,but even if mapping is not correct ,it will execute but will give pending execption todo:implement me
		monochrome = true ,// gives the output in readable format
		dryRun=false, // if dryrun is true ...then it will just check the mapping.if it is flase , then it will execute the testcase
//		 tags= {"@SmokeTest"} // executes only smoke scearios from feature file
//	     tags= {"@SmokeTest, @RegressionTest"} // executes either smoke or regression
//		 tags= {"@SmokeTest", "@RegressionTest"}// executes both smoke and regression
		tags= {"~SmokeTest", "@RegressionTest"} // doesnt execute the smoke
		)
public class TestRunner 
{

}
