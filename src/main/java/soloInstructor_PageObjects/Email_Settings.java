package soloInstructor_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Email_Settings extends Instructor_Modules_Abstract{

	WebDriver driver;
	public Email_Settings(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="input[name='email']")
	WebElement enterEmail;
	
	@FindBy(xpath="//div/div/div[11]/div/div/div[1]/div/button")
	WebElement emailSettingsPreviousStep;
	
	@FindBy(xpath="//div/div/div[11]/div/div/div[2]/div/button")
	WebElement emailSettingsSaveAndContinue;
	
	public WebElement EnterEmail()
	{
		return enterEmail;
	}
	public WebElement EmailSettingsPreviousStep()
	{
		return emailSettingsPreviousStep;
	}
	public WebElement EmailSettingsSaveAndContinue()
	{
		return emailSettingsSaveAndContinue;
	}
}
