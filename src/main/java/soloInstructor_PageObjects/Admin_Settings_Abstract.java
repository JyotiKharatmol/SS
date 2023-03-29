package soloInstructor_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_Settings_Abstract extends Instructor_Modules_Abstract{

	WebDriver driver;
	public Admin_Settings_Abstract(WebDriver driver)
	{
		super(driver);
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div/div/a[@href='#/fit/solo-instructor/app/settings']/div")
	WebElement backToSettings;
	
	@FindBy(css="ul a[href*='companyDetails']")
	WebElement instructorDetails;
	
	@FindBy(css="a[href*='reportSettings']")
	WebElement servicesAndProducts;
	
	@FindBy(css="a[href*='classesSettings']")
	WebElement sessionSettings;
	
	@FindBy(css="a[href*='clientWaiver']")
	WebElement clientWaiver;
	
	@FindBy(css="a[href*='contractTerms']")
	WebElement policies_procedures;
	
	@FindBy(css="a[href*='studios']")
	WebElement studios;
	
	@FindBy(css="a[href*='packages']")
	WebElement packages;
	
	@FindBy(css="a[href*='promoCodes']")
	WebElement promoCodes;
	
	@FindBy(css="a[href*='fitnessClassTemplate']")
	WebElement fitnessClassTemplate;
	
	@FindBy(css="a[href*='email']")
	WebElement emailSettings;
	
	public WebElement BackToSettings()
	{
		return backToSettings;
	}
	public WebElement InstructorDetails()
	{
		return instructorDetails;
	}
	public WebElement ServicesAndProducts()
	{
		return servicesAndProducts;
	}
	public WebElement SessionSettings()
	{
		return sessionSettings;
	}
	public WebElement ClientWaiver()
	{
		return clientWaiver;
	}
	public WebElement Policies_procedures()
	{
		return policies_procedures;
	}
	public WebElement Studios()
	{
		return studios;
	}
	public WebElement Packages()
	{
		return packages;
	}
	public WebElement PromoCodes()
	{
		return promoCodes;
	}
	public WebElement FitnessClassTemplate()
	{
		return fitnessClassTemplate;
	}
	public WebElement emailSettings()
	{
		return emailSettings;
	}
	
}
