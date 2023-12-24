package utility;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonUtils 
{
	public static WebDriver driver =BaseClass.getDriver();
	static JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

	public static void selectByValueFromDropDown(WebElement element,String value)
	{
		Select select=new Select(element);
		select.selectByValue(value);
	}

	public static List<WebElement> getAllFromDropDown(WebElement element)
	{ 
		Select select=new Select(element);
		return select.getAllSelectedOptions();
	}

	public static String getFontSize( WebElement element)
	{
		
		//JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		String script = "return window.getComputedStyle(arguments[0], null).getPropertyValue('font-size');";
		return (String) jsExecutor.executeScript(script, element);
	}

	public static void clickByJavaScriptExecutor(WebElement element)
	{ 
	jsExecutor.executeScript("arguments[0].click();", element);
	}
	
	public static void scrollToElement(WebElement element) {

		
       // JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
       // jsExecutor.executeScript("arguments[0].scrollIntoView({ behavior: 'auto', block: 'center', inline: 'center' });", element);
        jsExecutor.executeScript("arguments[0].scrollIntoView();", element);    
	}

}
