package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageElements {

	@FindBy(how=How.XPATH, using="//div[@id='navbar-collapse-basic']/div/div[3]/div/button[2]/div/div")
	public WebElement SignInBtn ;
	
	@FindBy(how=How.ID, using="Email Addressjoe@example.com")
	public WebElement email ;
	
	@FindBy(how=How.ID, using="login_pwd")
	public WebElement password ;
	
	@FindBy(how=How.XPATH, using="//div[@id='hs-login-modal']/div/div/div/div[2]/form/button")
	public WebElement loginBtn ;
	
	
	@FindBy(how=How.XPATH, using="//span[contains(.,'Dashboard')]")
	public WebElement dashboard ;
	
	@FindBy(how=How.XPATH, using="//div[@id='hs-login-modal']/div/div/div/div[2]/form/p[2]")
	public WebElement erorrMsg ;
}
