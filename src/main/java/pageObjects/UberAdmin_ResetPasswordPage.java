package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UberAdmin_ResetPasswordPage {

	WebDriver driver;
	
	public UberAdmin_ResetPasswordPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="input[name='emailId']")
	WebElement emailId;
	
	
	@FindBy(css="div.jss11 button")
	WebElement sendMeResetPasswordLinkButton;
	
	@FindBy(css="a[href*='login'] div")
	WebElement backToLoginButton;
	
	@FindBy(css="div.MuiAlert-message")
	WebElement resetPasswordAlert;
	
	
	
	public WebElement EmailIdOfResetPassword()
	{
		return emailId;
	}
	public WebElement sendMeResetPasswordLinkButton()
	{
		return sendMeResetPasswordLinkButton;
	}
	public WebElement BackToLoginButton()
	{
		return backToLoginButton;
	}
	public WebElement ResetPasswordAlert()
	{
		return resetPasswordAlert;
	}





}
