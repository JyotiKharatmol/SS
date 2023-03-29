package soloInstructor_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Client_Waiver extends Instructor_Modules_Abstract{

	WebDriver driver;
	public Client_Waiver(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="div[class='dropzone'] div input")
	WebElement uploadWaiver;
	
	@FindBy(css="input[type='text']")
	WebElement enterWaiverTerm;
	
	@FindBy(css="button[aria-label='edit']")
	WebElement edit1stWaiverTerm;
	
	@FindBy(xpath="//form/div/div[5]/div/div/div[2]/div[2]/div[1]/button")
	WebElement addWaiverTerm;
	
	@FindBy(xpath="//form/div/div[5]/div/div/div[2]/div[2]/div[2]/button")
	WebElement cancelWaiverTerm;
	
	@FindBy(xpath="//form/div/div[5]/div/div/div[1]/div/div/div/button[2]")
	WebElement delete1stWaiverTerm;
	
	@FindBy(xpath="//form/div/div[6]/div/div/div[1]/div/button")
	WebElement waiverPreviousStep;
	
	@FindBy(xpath="//form/div/div[6]/div/div/div[2]/div/button")
	WebElement waiverSaveForLater;
	
	@FindBy(xpath="//form/div/div[6]/div/div/div[3]/div/button")
	WebElement waiverSaveAndContinue;
	
	public WebElement UploadWaiver()
	{
		return uploadWaiver;
	}
	public WebElement EnterWaiverTerm()
	{
		return enterWaiverTerm;
	}
	public WebElement Edit1stWaiverTerm()
	{
		return edit1stWaiverTerm;
	}
	public WebElement AddWaiverTerm()
	{
		return addWaiverTerm;
	}
	public WebElement CancelWaiverTerm()
	{
		return cancelWaiverTerm;
	}
	public WebElement Delete1stWaiverTerm()
	{
		return delete1stWaiverTerm;
	}
	public WebElement WaiverPreviousStep()
	{
		return waiverPreviousStep;
	}
	public WebElement waiverSaveForLater()
	{
		return waiverSaveForLater;
	}
	public WebElement waiverSaveAndContinue()
	{
		return waiverSaveAndContinue;
	}
	
	
}
