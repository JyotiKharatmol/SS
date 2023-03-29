package soloInstructor_PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Instructor_Details extends Instructor_Modules_Abstract{

	WebDriver driver;
	public Instructor_Details(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//form/div/div/div/h2")
	WebElement instructorDetailsPageTitle;
	
	@FindBy(css="input[name='name']")
	WebElement brandName;
	
	@FindBy(css="div[id*='timeZone']")
	WebElement timeZone;
	
	@FindBy(css="div[id*='timeZone'] li")
	List<WebElement> timeZoneList;
	
	@FindBy(css="div[id*='timeZone'] li:nth-child(1)")
	WebElement easternTimeZone;
	
	@FindBy(css="div[id*='timeZone'] li:nth-child(2)")
	WebElement centralTimeZone;
	
	@FindBy(css="div[id*='timeZone'] li:nth-child(3)")
	WebElement mountainTimeZone;
	
	@FindBy(css="div[id*='timeZone'] li:nth-child(4)")
	WebElement pacificTimeZone;
	
	@FindBy(css="input[name='address1']")
	WebElement address1;
	
	@FindBy(css="input[name='address2']")
	WebElement address2;
	
	@FindBy(css="input[name='city']")
	WebElement city;
	
	@FindBy(css="div[id*='state']")
	WebElement state;
	
	@FindBy(css="div[id*='state'] ul li")
	List<WebElement> listOfStates;
	
	@FindBy(css="div[id*='state'] ul li:nth-child(11)")
	WebElement georgiaState;
	
	@FindBy(css="input[name='zip']")
	WebElement zip;
	
	@FindBy(css="input[name='firstName']")
	WebElement firstName;
	
	@FindBy(css="input[name='lastName']")
	WebElement lastName;
	
	@FindBy(xpath="//div[11]/div/div/input")
	WebElement phoneNumber;
	
	@FindBy(css="input[name='emailId']")
	WebElement emailId;
	
	@FindBy(css="input[name='alias']")
	WebElement companyAlias;
	
	@FindBy(xpath="//div[14]/div/div/input")
	WebElement merchantId;
	
	@FindBy(css="div[class='dropzone'] div input")
	WebElement browseImage;
	
	@FindBy(xpath="//div[18]/button")
	WebElement changePassword;
	
	@FindBy(css="div h1")
	WebElement createPasswordHeader;
	
	@FindBy(css="input[name='password']")
	WebElement newPassword;
	
	@FindBy(css="input[name='confirmPassword']")
	WebElement confirmPassword;
	
	@FindBy(css="button[type='submit']")
	WebElement submit;
	
	@FindBy(xpath="//div[@role='dialog']/div[1]/button")
	WebElement cancel;
	
	@FindBy(xpath="//div[19]/div/div/div[1]/div/button")
	WebElement instructorDetailSaveForLater;
	
	@FindBy(xpath="//div[19]/div/div/div[2]/div/button")
	WebElement instructorDetailSaveAndContinue;
	
	public WebElement InstructorDetailsPageTitle()
	{
		return instructorDetailsPageTitle;
	}
	public WebElement BrandName()
	{
		return brandName;
	}
	public WebElement TimeZone()
	{
		return timeZone;
	}
	public List<WebElement> TimeZoneList()
	{
		return timeZoneList;
	}
	public WebElement EasternTimeZone()
	{
		return easternTimeZone;
	}
	public WebElement CentralTimeZone()
	{
		return centralTimeZone;
	}
	public WebElement MountainTimeZone()
	{
		return mountainTimeZone;
	}
	public WebElement PacificTimeZone()
	{
		return pacificTimeZone;
	}
	public WebElement Address1()
	{
		return address1;
	}
	public WebElement Address2()
	{
		return address2;
	}
	public WebElement City()
	{
		return city;
	}
	public WebElement State()
	{
		return state;
	}
	public List<WebElement> ListOfStates()
	{
		return listOfStates;
	}
	public WebElement GeorgiaState()
	{
		return georgiaState;
	}
	public WebElement Zip()
	{
		return zip;
	}
	public WebElement FirstName()
	{
		return firstName;
	}
	public WebElement LastName()
	{
		return lastName;
	}
	public WebElement PhoneNumber()
	{
		return phoneNumber;
	}
	public WebElement EmailId()
	{
		return emailId;
	}
	public WebElement CompanyAlias()
	{
		return companyAlias;
	}
	public WebElement MerchantId()
	{
		return merchantId;
	}
	public WebElement BrowseImage()
	{
		return browseImage;
	}
	public WebElement ChangePassword()
	{
		return changePassword;
	}
	public WebElement CreatePasswordHeader()
	{
		return createPasswordHeader;
	}
	public WebElement NewPassword()
	{
		return newPassword;
	}
	public WebElement ConfirmPassword()
	{
		return confirmPassword;
	}
	public WebElement Submit()
	{
		return submit;
	}
	public WebElement Cancel()
	{
		return cancel;
	}
	public WebElement InstructorDetailSaveForLater()
	{
		return instructorDetailSaveForLater;
	}
	public WebElement InstructorDetailSaveAndContinue()
	{
		return instructorDetailSaveAndContinue;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
