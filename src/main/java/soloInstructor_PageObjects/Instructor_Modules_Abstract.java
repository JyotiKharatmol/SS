package soloInstructor_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Instructor_Modules_Abstract {

	WebDriver driver;
	
	public Instructor_Modules_Abstract(WebDriver driver)
	{		
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='#/fit/solo-instructor/app/settings']/div")
	WebElement settings;
	
	@FindBy(xpath="//a[@href='#/fit/solo-instructor/app/clients']/div[@role='button']")
	WebElement clients;
	
	@FindBy(xpath="//a[@href='#/fit/solo-instructor/app/calendar']/div[@role='button']")
	WebElement calendar;
	
	@FindBy(xpath="//a[@href='#/fit/solo-instructor/app']/div[@role='button']")
	WebElement dashbaord;
	
	@FindBy(xpath="//span[text()='LOG OUT']")
	WebElement logOut;
	
	public WebElement Settings()
	{
		return settings;
	}
	public WebElement Clients()
	{
		return clients;
	}
	public WebElement Calendar()
	{
		return calendar;
	}
	public WebElement Dashbaord()
	{
		return dashbaord;
	}
	public WebElement LogOut()
	{
		return logOut;
	}
	
}
