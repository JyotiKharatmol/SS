package soloInstructor_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Session_Settings extends Instructor_Modules_Abstract{

	WebDriver driver;
	public Session_Settings(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="form div div div h2")
	WebElement sessionDetailsPageTitle;
	
	@FindBy(css="div input[type='text']")
	WebElement enterSessionType;

	@FindBy(xpath="//form/div/div[3]/div/div[2]/div[2]/div/button")
	WebElement addSessionType;
	
	@FindBy(css="p[class*='Mui-error']")
	WebElement sessionErrorMessage;
	
	@FindBy(xpath="//form/div/div[3]/div/div[1]/div/div/div[1]/button")
	WebElement sessionDeleteButton;
	
	@FindBy(xpath="//form/div/div[4]/div/div/div[1]/div/button")
	WebElement sessionSettingsPreviousStep;
	
	@FindBy(xpath="//form/div/div[4]/div/div/div[2]/div/button")
	WebElement sessionSettingsSaveForLater;
	
	@FindBy(xpath="//form/div/div[4]/div/div/div[3]/div/button")
	WebElement sessionSettingsSaveAndContinue;
	
	public WebElement SessionDetailsPageTitle()
	{
		return sessionDetailsPageTitle;
	}
	public WebElement EnterSessionType()
	{
		return enterSessionType;
	}
	public WebElement AddSessionType()
	{
		return addSessionType;
	}
	public WebElement SessionErrorMessage()
	{
		return sessionErrorMessage;
	}
	public WebElement SessionDeleteButton()
	{
		return sessionDeleteButton;
	}
	public WebElement SessionSettingsPreviousStep()
	{
		return sessionSettingsPreviousStep;
	}
	public WebElement SessionSettingsSaveForLater()
	{
		return sessionSettingsSaveForLater;
	}
	public WebElement SessionSettingsSaveAndContinue()
	{
		return sessionSettingsSaveAndContinue;
	}
	
	
}
