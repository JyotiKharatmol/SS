package soloInstructor_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fitness_Session_Template extends Instructor_Modules_Abstract{

	WebDriver driver;
	public Fitness_Session_Template(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div/div/div/div/div/h2")
	WebElement fitnessSessionTitle;
	
	@FindBy(xpath="//div/div/div/div/div[2]/button")
	WebElement addFitnessSession;
	
	@FindBy(xpath="//tbody/tr[1]/td[4]/div/div[1]")
	WebElement copyFitnessSession;
	
	@FindBy(xpath="//tbody/tr[1]/td[5]/div/div[1]")
	WebElement deleteFitnessSession;
	
	@FindBy(xpath="//div/div/div/div/div[4]/div/div/div[1]/div/button")
	WebElement fitnessSessionPreviousStep;
	
	@FindBy(xpath="//div/div/div/div/div[4]/div/div/div[2]/div/button")
	WebElement fitnessSessionSaveAndContinue;
	
	public WebElement FitnessSessionTitle()
	{
		return fitnessSessionTitle;
	}
	public WebElement AddFitnessSession()
	{
		return addFitnessSession;
	}
	public WebElement CopyFitnessSession()
	{
		return copyFitnessSession;
	}
	public WebElement DeleteFitnessSession()
	{
		return deleteFitnessSession;
	}
	public WebElement FitnessSessionPreviousStep()
	{
		return fitnessSessionPreviousStep;
	}
	public WebElement FitnessSessionSaveAndContinue()
	{
		return fitnessSessionSaveAndContinue;
	}
}
