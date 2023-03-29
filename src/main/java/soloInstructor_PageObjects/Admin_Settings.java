package soloInstructor_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_Settings extends Instructor_Modules_Abstract{

	WebDriver driver;
	public Admin_Settings(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="div h1")
	WebElement adminPageTitle;
	
	@FindBy(css="a[href='#/fit/solo-instructor/app/settings/companyDetails'] div")
	WebElement instructorDetailsBox;
	
	@FindBy(css="a[href='#/fit/solo-instructor/app/settings/reportSettings'] div")
	WebElement servicesAndProductsBox;
	
	@FindBy(css="a[href='#/fit/solo-instructor/app/settings/classesSettings'] div")
	WebElement sessionSettingsBox;
	
	@FindBy(css="a[href='#/fit/solo-instructor/app/settings/clientWaiver'] div")
	WebElement clientWaiverBox;
	
	@FindBy(css="a[href='#/fit/solo-instructor/app/settings/contractTerms'] div")
	WebElement policiesAndProceduresBox;
	
	@FindBy(css="a[href='#/fit/solo-instructor/app/settings/studios'] div")
	WebElement studiosBox;
	
	@FindBy(css="a[href='#/fit/solo-instructor/app/settings/packages'] div")
	WebElement packagesBox;
	
	@FindBy(css="a[href='#/fit/solo-instructor/app/settings/promoCodes'] div")
	WebElement promoCodesBox;
	
	@FindBy(css="a[href='#/fit/solo-instructor/app/settings/fitnessClassTemplate'] div")
	WebElement fitnessClassTemplateBox;
	
	@FindBy(css="a[href='#/fit/solo-instructor/app/settings/email'] div")
	WebElement emailSettingsBox;
		
	public WebElement AdminPageTitle()
	{
		return adminPageTitle;
	}
	public WebElement InstructorDetailsBox()
	{
		return instructorDetailsBox;
	}
	public WebElement ServicesAndProductsBox()
	{
		return servicesAndProductsBox;
	}
	public WebElement SessionSettingsBox()
	{
		return sessionSettingsBox;
	}
	public WebElement ClientWaiverBox()
	{
		return clientWaiverBox;
	}
	public WebElement PoliciesAndProceduresBox()
	{
		return policiesAndProceduresBox;
	}
	public WebElement StudiosBox()
	{
		return studiosBox;
	}
	public WebElement PackagesBox()
	{
		return packagesBox;
	}
	public WebElement PromoCodesBox()
	{
		return promoCodesBox;
	}
	public WebElement FitnessClassTemplateBox()
	{
		return fitnessClassTemplateBox;
	}
	public WebElement EmailSettingsBox()
	{
		return emailSettingsBox;
	}
	
}
