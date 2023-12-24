package stepDefinations;

import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.JavaCompilerElements;
import pageObjects.LoginPageElements;
import utility.BaseClass;
import utility.Waits;
import io.cucumber.java.en.Then;

public class LoginPageActions {
	

	LoginPageElements loginElements=null;
	SoftAssert softasssert=new SoftAssert();
	public LoginPageActions() {

		this.loginElements = new LoginPageElements();

		PageFactory.initElements(BaseClass.getDriver(),loginElements);
	}


    @Given("the user is on the login page")
    public void givenTheUserIsOnTheLoginPage() {
    	
    	loginElements.SignInBtn.click();
    	
    }

    @When("the user enters {string} and {string}")
    public void whenTheUserEntersUsernameAndPassword(String username, String password) 
    {
    	Waits.waitForElementToBeVisible(loginElements.email);
    	loginElements.email.sendKeys(username);
    	Waits.waitForElementToBeVisible(loginElements.password);
    	loginElements.password.sendKeys(password);
    }

    @When("clicks the login button")
    public void whenClicksTheLoginButton() {
    	loginElements.loginBtn.click();
    }

    @Then("the user should be logged in successfully")
    public void thenTheUserShouldBeLoggedInSuccessfully()
    {
    	softasssert.assertTrue(loginElements.dashboard.isDisplayed());
    }

    @Then("the login should fail with an error message")
    public void thenTheLoginShouldFailWithAnErrorMessage()
    {
    	String expected=loginElements.erorrMsg.getText();
    	
    	softasssert.assertEquals("Sorry, we were not able to find a user with that username and password.", expected);
    }
}