package soloInstructor_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Promo_Codes extends Instructor_Modules_Abstract{

	WebDriver driver;
	public Promo_Codes(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div/div/div/div/div/h2")
	WebElement promoCodeTitle;
	
	@FindBy(xpath="//div/div/div/div/div[2]/button")
	WebElement addPromoCode;
	
	@FindBy(xpath="//tbody/tr[1]/td[5]/div/div[1]")
	WebElement copyPromoCode;
	
	@FindBy(xpath="//tbody/tr[1]/td[6]/div/div[1]")
	WebElement deletePromoCode;
	
	@FindBy(xpath="//div/div/div/div/div[4]/div/div/div[1]/div/button")
	WebElement promoCodesPreviousStep;
	
	@FindBy(xpath="//div/div/div/div/div[4]/div/div/div[2]/div/button")
	WebElement promoCodesSaveAndContinue;
	
	@FindBy(xpath="//div/div/div/div/div[4]/div/div/div[3]/div/button")
	WebElement promoCodesSkip;
	
	public WebElement PromoCodeTitle()
	{
		return promoCodeTitle;
	}
	public WebElement AddPromoCode()
	{
		return addPromoCode;
	}
	public WebElement CopyPromoCode()
	{
		return copyPromoCode;
	}
	public WebElement DeletePromoCode()
	{
		return deletePromoCode;
	}
	public WebElement PromoCodesPreviousStep()
	{
		return promoCodesPreviousStep;
	}
	public WebElement PromoCodesSaveAndContinue()
	{
		return promoCodesSaveAndContinue;
	}
	public WebElement PromoCodesSkip()
	{
		return promoCodesSkip;
	}
}
