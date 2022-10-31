package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UberAdmin_CompanySoloTablePage {

	WebDriver driver;
	
	public UberAdmin_CompanySoloTablePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//div[@role='tablist']/button[1]/span[1]")
	WebElement companyTab;
	
	@FindBy(xpath="//div[@role='tablist']/button[2]/span[1]")
	WebElement soloInstructorTab;
	
	@FindBy(css="p button[type='button']")
	WebElement addCompanyButton;
	
	@FindBy(css="p button")
	WebElement addSoloButton;
	
	@FindBy(xpath="//div[@role='grid']/div[1]/div[1]")
	WebElement companyNameColumnHeader;
	
	@FindBy(xpath="//div[@role='grid']/div[1]/div[2]")
	WebElement companyAliasColumnHeader;
	
	@FindBy(xpath="//div[@role='grid']/div[2]")
	WebElement companyDataTable;
	
	@FindBy(xpath="//div[@role='columnheader'][1]")
	WebElement soloNameColumnHeader;
	
	@FindBy(xpath="//div[@role='columnheader'][2]")
	WebElement soloAliasColumnHeader;
	
	@FindBy(xpath="//div[@role='grid']/div[@role='rowgroup']")
	WebElement soloDataTable;
	
	@FindBy(css="div[class='jss20'] button")
	WebElement logoutButton;
	
	public WebElement CompanyTab()
	{
		return companyTab;
	}
	public WebElement SoloInstructorTab()
	{
		return soloInstructorTab;
	}
	public WebElement AddCompanyButton()
	{
		return addCompanyButton;
	}
	public UberAdmin_CreateSoloInstructorPage AddSoloButton()
	{
		addSoloButton.click();
		return new UberAdmin_CreateSoloInstructorPage(driver);
		
		
	}
	public WebElement CompanyNameColumnHeader()
	{
		return companyNameColumnHeader;
	}
	public WebElement CompanyAliasColumnHeader()
	{
		return companyAliasColumnHeader;
	}
	public WebElement CompanyDataTable()
	{
		return companyDataTable;
	}
	public WebElement SoloNameColumnHeader()
	{
		return soloNameColumnHeader;
	}
	public WebElement soloAliasColumnHeader()
	{
		return soloAliasColumnHeader;
	}
	public WebElement SoloDataTable()
	{
		return soloDataTable;
	}
	public WebElement LogoutButton()
	{
		return logoutButton;
	}
	
	
	
	
	
	
	
	
	
	
}
