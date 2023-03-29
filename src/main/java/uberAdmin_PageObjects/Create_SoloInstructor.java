package uberAdmin_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_SoloInstructor {

	WebDriver driver;
	
	Create_SoloInstructor(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="input[name='name']")
	WebElement brandName;
	
	@FindBy(css="div[id*='timeZone']")
	WebElement timeZone;
	
	@FindBy(xpath="//ul[@role='listbox']/li[1]")
	WebElement timeZone_eastern;
	
	@FindBy(xpath="//ul[@role='listbox']/li[2]")
	WebElement timeZone_central;
	
	@FindBy(xpath="//ul[@role='listbox']/li[3]")
	WebElement timeZone_mountain;
	
	@FindBy(xpath="//ul[@role='listbox']/li[4]")
	WebElement timeZone_pacific;
	
	@FindBy(css="input[name='address1']")
	WebElement address1;
	
	@FindBy(css="input[name='address2']")
	WebElement address2;
	
	@FindBy(css="input[name='city']")
	WebElement city;
	
	@FindBy(css="div[id*='state']")
	WebElement state;
	
	@FindBy(css="ul li:nth-child(3)")
	WebElement stateArizona;
	
	
	@FindBy(xpath="//div/ul/li")
	WebElement stateDropdownList;
	
	@FindBy(css="input[name='zip']")
	WebElement zip;
	
	@FindBy(css="input[name='firstName']")
	WebElement firstName;
	
	@FindBy(css="input[name='lastName']")
	WebElement lastName;
	
	@FindBy(xpath="//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-4']/div[@inputmode='numeric']/div/input")
	WebElement phoneNumber;
	
	@FindBy(css="input[name='emailId']")
	WebElement soloInstrcutorEmailID;
	
	@FindBy(css="input[name='alias']")
	WebElement companyAlias;
	
	@FindBy(xpath="//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-12 MuiGrid-grid-md-6 MuiGrid-grid-lg-4']/div[@inputmode='numeric']/div/input[@type='text']")
	WebElement merchantId;
	
	@FindBy(css="input[name='merchantUsername']")
	WebElement merchantUsername;
	
	@FindBy(css="input[name='merchantPassword']")
	WebElement merchantPassword;
	
	@FindBy(xpath="//div//div/div/button[@type='submit']")
	WebElement saveAndSendInvite;
	
	public WebElement BrandName()
	{
		return brandName;
	}
	public WebElement TimeZone()
	{
		return timeZone;
		
	}
	public WebElement TimeZone_eastern()
	{
		return timeZone_eastern;
	}
	public WebElement TimeZone_central()
	{
		return timeZone_central;
	}
	public WebElement TimeZone_mountain()
	{
		return timeZone_mountain;
	}
	public WebElement TimeZone_pacific()
	{
		return timeZone_pacific;
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
	public WebElement stateoption()
	{
		return stateArizona;
	}
	public WebElement StateDropdownList()
	{
		return stateDropdownList;
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
	public WebElement SoloInstrcutorEmailID()
	{
		return soloInstrcutorEmailID;
	}
	public WebElement CompanyAlias()
	{
		return companyAlias;
	}
	public WebElement MerchantId()
	{
		return merchantId;
	}
	public WebElement MerchantUsername()
	{
		return merchantUsername;
	}
	public WebElement MerchantPassword()
	{
		return merchantPassword;
	}
	public WebElement SaveAndSendInvite()
	{
		return saveAndSendInvite;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
