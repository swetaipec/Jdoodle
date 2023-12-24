package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



@CucumberOptions(
		features = "src/test/resources/Features",
		glue= {"stepDefinations","utility"},
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		tags="@regression",
		monochrome = true
		)
public class TestRunner extends AbstractTestNGCucumberTests {

	
       
    
}
