package utility;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	 
	    private static Wait<WebDriver> wait ;

	   
		
		public static  void waitForElementToBeVisible(WebElement webelement) {
			wait=new WebDriverWait(BaseClass.getDriver(),Duration.ofSeconds(3));
	         wait.until(ExpectedConditions.visibilityOf(webelement));
	    }
		
		public static void waitforElementToBeClickable(WebElement webelement)
		{
			wait=new WebDriverWait(BaseClass.getDriver(),Duration.ofSeconds(3));
	         wait.until(ExpectedConditions.elementToBeClickable(webelement));
		}
}
