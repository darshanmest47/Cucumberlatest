package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\eclipse2\\NewBDD\\resources\\Features",
		glue= {"stepdefs","Apphooks"},
		plugin= {"pretty"},
		monochrome = true,
		dryRun=false)

public class Testrunner {

}
