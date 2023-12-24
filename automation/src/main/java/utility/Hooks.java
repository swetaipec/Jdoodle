package utility;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks 
{
	private static final Logger logger = LoggerFactory.getLogger(Hooks.class);
	@Before
    public static void setUp() {
 
		
       BaseClass.setUpDriver();
    }
	
	@After
    public static void tearDown(Scenario scenario) throws IOException {
 
        //validate if scenario has failed
        if(scenario.isFailed()) {
             byte[] screenshot = ((TakesScreenshot) BaseClass.getDriver()).getScreenshotAs(OutputType.BYTES);
             String targetScreenshotFolderPath = "ExtentReports/Screenshots/";
             Files.createDirectories(Paths.get(targetScreenshotFolderPath));

             String screenshotFileName = scenario.getName().replaceAll("[^a-zA-Z0-9]", "_") + ".png";
             Path screenshotFilePath = Paths.get(targetScreenshotFolderPath, screenshotFileName);
             

             // Save screenshot to the specified file path
             Files.write(screenshotFilePath, screenshot);
            scenario.attach(screenshot, "image/png", "Failed Scenario Screenshot"); 
            logger.info("Screenshot saved at: {}", screenshotFilePath);
        }   
         
        BaseClass.tearDown();
    }

}
