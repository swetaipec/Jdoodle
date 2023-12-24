package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.JavaCompilerElements;

import utility.BaseClass;
import utility.CommonUtils;
import utility.Waits;

public class JavaCompilerActions 
{

	JavaCompilerElements jde=null;
	SoftAssert softasssert=new SoftAssert();
	public JavaCompilerActions() {

		this.jde = new JavaCompilerElements();

		PageFactory.initElements(BaseClass.getDriver(),jde);
	}



	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page()
	{
		BaseClass.openPage("https://www.jdoodle.com/online-java-compiler");
	}



	@Then("User sees Online Java Compiler IDE Text")
	public void user_sees_online_java_compiler_ide_text()
	{
		String expected=jde.javatxt.getText();

		softasssert.assertEquals("Online Java Compiler IDE", expected);

	}

	@Given("User sees the expand button")
	public void user_sees_the_expand_button()
	{

		softasssert.assertTrue(jde.expandBtn.isDisplayed());
	}

	@When("User clicks on expand button")
	public void user_click_on_expand_button()
	{
		jde.expandBtn.click();
	}

	@Then("Coding pan size got increased")
	public void coding_pan_size_got_increased()
	{
		System.out.println("test");
	}

	@Then("menu list item also not showing up")
	public void menu_list_item_also_not_showing_up()
	{
		
		softasssert.assertTrue(!jde.menuList.isDisplayed());
	}
	
	
	@Given("User sees the font size dropdown")
	public void userSeesthefontSizedropdonw()
	{
		softasssert.assertTrue(jde.fontSizeDropDown.isDisplayed());
		softasssert.assertAll();
	}
	
	@When("User selects {string} from dropdown")
	public void userselectFontSizeFromDropdonw(String fontSize)
	{
		CommonUtils.selectByValueFromDropDown(jde.fontSizeDropDown, fontSize);
	}

	@Then("User validate font size in coding pan should be same as {string}")
	public void userValidateFontSizeInCodingPan(String fontsize)
	{
		
		 String actualfontSize = CommonUtils.getFontSize(jde.codeingPan);
		 //
	
		 softasssert.assertEquals(actualfontSize,(fontsize+"px") );
		 softasssert.assertAll();
	}
	
	@Given("User sees the red cross button")
	public void userSeesTheRedCrossButton()
	{
		//Waits.waitForElementToBeVisible(jde.redCrossIcon);
		softasssert.assertTrue(jde.redCrossIcon.isDisplayed());
		softasssert.assertAll();
	}
	
	@When("User click on red cross button")
	public void userClickOnRedCrossButton()
	{
		
		jde.redCrossIcon.click();
	}
	
	@Then("left side menu item is disappear")
	public void lefSideMenuItemIsDisappear()
	{
		
		softasssert.assertTrue(!jde.leftSideMenu.isDisplayed());
		
		
		
	}
	
	@Then("User sees red Play icon to see the left side menu")
	public void userSeesRedPlayIcontoSeeTheLeftSideMenu()
	{
		
		
		softasssert.assertTrue(jde.redPlayIcon.isDisplayed());
		softasssert.assertAll();
	}
	
	@Given("User sees Upload Files Tab")
	public void userSeesUploadFilesTab()
	{
		CommonUtils.scrollToElement(jde.uploadFileTab);
		softasssert.assertTrue(jde.uploadFileTab.isDisplayed());
		softasssert.assertAll();
		
	}
	
	@When("User clicks on Upload Files Tab")
	public void userClickOnUploadFielsTab()
	{
	   jde.uploadFileTab.click();
	}
	
	@Then("User drag and drop a file for upload")
	public void userDragAndDropFielForUpload()
	{
		
		jde.DragAndDropOption.sendKeys(System.getProperty("user.dir")+"\\uploadFiles\\test.docx");
	}
}
