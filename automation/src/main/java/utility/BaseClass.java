package utility;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import enums.Browsers;
import enums.OS;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	private static WebDriver driver;
	private static BaseClass baseclass;
	private BaseClass() {

		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--start-maximized");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
		baseclass=null;
	}

	// you can remove 
	public static void setUpDriver() {

		if (baseclass==null) {

			baseclass = new BaseClass();
		}

	}

	public static void openPage(String url) {
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
}
