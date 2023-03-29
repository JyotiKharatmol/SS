package soloInstructor_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Services_Products extends Instructor_Modules_Abstract{

	WebDriver driver;
	public Services_Products(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="form div div div h2")
	WebElement servicesPageTitle;
	
	@FindBy(css="input[type='text']")
	WebElement enterServiceOrProduct;

	@FindBy(xpath="//div/div[3]/div/div/div[2]/div[2]/div[1]/button")
	WebElement addCategory;
	
	@FindBy(css="p[class*='Mui-error']")
	WebElement servicesErrorMessage;
	
	@FindBy(xpath="//form/div/div[3]/div/div/div[1]/div/div/div/button")
	WebElement servicesDeleteButton;
	
	@FindBy(css="button[type='link']")
	WebElement servicesPreviousStep;
	
	@FindBy(xpath="//form/div/div[4]/div/div/div[2]/div/button")
	WebElement servicesSaveForLater;
	
	@FindBy(xpath="//form/div/div[4]/div/div/div[3]/div/button")
	WebElement servicesSaveAndContinue;
	
	public WebElement ServicesPageTitle()
	{
		return servicesPageTitle;
	}
	public WebElement EnterServiceOrProduct()
	{
		return enterServiceOrProduct;
	}
	public WebElement AddCategory()
	{
		return addCategory;
	}
	public WebElement ServicesErrorMessage()
	{
		return servicesErrorMessage;
	}
	public WebElement ServicesDeleteButton()
	{
		return servicesDeleteButton;
	}
	public WebElement ServicesPreviousStep()
	{
		return servicesPreviousStep;
	}
	public WebElement ServicesSaveForLater()
	{
		return servicesSaveForLater;
	}
	public WebElement ServicesSaveAndContinue()
	{
		return servicesSaveAndContinue;
	}	
}
