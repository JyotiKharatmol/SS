package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UberAdmin_LoginPage {

	WebDriver driver;
	WebDriverWait wait;
	
	
	public UberAdmin_LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css="input[name='emailId']")
	WebElement emailID;
	
	@FindBy(css="input[name='password']")
	WebElement password;
	
	@FindBy(css="a[href*='forgotPassword']")
	WebElement forgotPassword;
	
	@FindBy(css="div[class='jss11'] button")
	WebElement loginbutton;
	
	
	@FindBy(xpath="//div[@role='alert']/div[2]")
	WebElement loginErrorMessage;
	
	
	public WebElement EmailID()
	{
		return emailID;
	}
	public WebElement Password()
	{
		return password;
	}
	public WebElement ForgotPassword()
	{
		return forgotPassword;
	}
	public UberAdmin_CompanySoloTablePage LoginButton()
	{
		loginbutton.click();
		return new UberAdmin_CompanySoloTablePage(driver);
	}
	public WebElement LoginErrorMessage()
	{
		return loginErrorMessage;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
