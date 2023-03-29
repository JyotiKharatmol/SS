package soloInstructor_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends Instructor_Modules_Abstract{

	WebDriver driver;
	
	public Login(WebDriver driver)
	{	
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	@FindBy(css="div img")
	WebElement logo;
	
	@FindBy(tagName="h1")
	WebElement titleOfLoginPage;
	
	@FindBy(css="input[type=\"email\"]")
	WebElement username;
	
	@FindBy(css="input[type=\"password\"]")
	WebElement password;
	
	@FindBy(css="a[href='#/fit/solo-instructor/forgotPassword']")
	WebElement forgotPassword;
	
	@FindBy(css="button[type='submit']")
	WebElement loginButton;
	
	@FindBy(css="a[href='#/fit/solo-client/client/app']")
	WebElement customerAccount;

	@FindBy(css="a[href='#/fit/solo-client/client/app/login']")
	WebElement clientLogin;
	
	@FindBy(css="a[href='#/fit/solo-client/client/app/client-signup']")
	WebElement signUp;
	
	public WebElement SmartStudioLogo()
	{
		return logo;
	}
	public WebElement TitleOfLoginPage()
	{
		return titleOfLoginPage;
	}
	public WebElement Username()
	{
		return username;
	}
	public WebElement Password()
	{
		return password;
	}
	public WebElement ForgotPassword()
	{
		return forgotPassword;
	}
	public WebElement LoginButton()
	{
		return loginButton;
	}
	public WebElement CustomerAccount()
	{
		return customerAccount;
	}
	public WebElement ClientLogin()
	{
		return clientLogin;
	}
	public WebElement SignUp()
	{
		return signUp;
	}
	
	
	
	
}
