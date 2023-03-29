package soloInstructor_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Policies_Procedures extends Instructor_Modules_Abstract{

	WebDriver driver;
	public Policies_Procedures(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="div[class='dropzone'] div input")
	WebElement uploadContract;
	
	@FindBy(css="input[type='text']")
	WebElement enterPoliciesTerm;
	
	@FindBy(css="button[aria-label='edit']")
	WebElement edit1stPoliciesTerm;
	
	@FindBy(xpath="//form/div/div[5]/div/div/div[2]/div[2]/div[1]/button")
	WebElement addPoliciesTerm;
	
	@FindBy(xpath="//form/div/div[5]/div/div/div[2]/div[2]/div[2]/button")
	WebElement cancelPoliciesTerm;
	
	@FindBy(xpath="//form/div/div[5]/div/div/div[1]/div/div/div/button[2]")
	WebElement delete1stPoliciesTerm;
	
	@FindBy(xpath="//form/div/div[6]/div/div/div[1]/div/button")
	WebElement policiesPreviousStep;
	
	@FindBy(xpath="//form/div/div[6]/div/div/div[2]/div/button")
	WebElement policiesSaveForLater;
	
	@FindBy(xpath="//form/div/div[6]/div/div/div[3]/div/button")
	WebElement policiesSaveAndContinue;
	
	public WebElement UploadContract()
	{
		return uploadContract;
	}
	public WebElement EnterPoliciesTerm()
	{
		return enterPoliciesTerm;
	}
	public WebElement Edit1stPoliciesTerm()
	{
		return edit1stPoliciesTerm;
	}
	public WebElement AddPoliciesTerm()
	{
		return addPoliciesTerm;
	}
	public WebElement CancelPoliciesTerm()
	{
		return cancelPoliciesTerm;
	}
	public WebElement Delete1stPoliciesTerm()
	{
		return delete1stPoliciesTerm;
	}
	public WebElement PoliciesPreviousStep()
	{
		return policiesPreviousStep;
	}
	public WebElement PoliciesSaveForLater()
	{
		return policiesSaveForLater;
	}
	public WebElement PoliciesSaveAndContinue()
	{
		return policiesSaveAndContinue;
	}
}
