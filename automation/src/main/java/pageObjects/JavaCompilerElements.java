package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class JavaCompilerElements
{
	
	@FindBy(how=How.XPATH, using="//h1[@class='text-md font-medium xl:text-lg']")
	public WebElement javatxt ;

	@FindBy(how=How.XPATH, using="//button[@class='rounded-md text-btn-secondary-hover']")
	public WebElement expandBtn;
	
	@FindBy(how=How.XPATH, using="//div[@id='navbar-collapse-basic']")
	public WebElement menuList;
	
	@FindBy(how=How.ID, using="fontSizeSelect")
	public WebElement fontSizeDropDown;
	
	@FindBy(how=How.CSS, using="#code .ace_content")
	public WebElement codeingPan;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div[6]/section/div[3]/div[1]/div[1]/button")
	public WebElement redCrossIcon;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div[6]/section/div[3]/div[1]/div[2]/div[1]/div[1]/div/div")
	public WebElement leftSideMenu;
	
	@FindBy(how=How.CSS, using=".fa-square-caret-right")
	public WebElement redPlayIcon;
	//upload elements start here********************************
	
	@FindBy(how=How.ID, using="tabs-input-files-item")
	public WebElement uploadFileTab;
	
	@FindBy(how=How.XPATH, using="//div[@id='splitUploadFilesComp']/div/button/input")
	public WebElement DragAndDropOption;
	
	
	
	//upload elements end here********************************
}
