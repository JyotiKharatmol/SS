package SS_Uber;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.base;
import uberAdmin_PageObjects.Uber_Login;
import uberAdmin_PageObjects.Uber_ResetPassword;

public class ForgotPasswordPageTest extends base {
	
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeBrowser();
		driver.get(pro.getProperty("url"));
	}

	
	@Test
	public void ForgotPassword() throws IOException
	{
		Uber_Login l = new Uber_Login(driver);
		l.ForgotPassword().click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://smartstudio-stage.azul-arc.com/#/forgotPassword");
		Uber_ResetPassword r = new Uber_ResetPassword(driver);
		r.EmailIdOfResetPassword().sendKeys("jyoti.kharatmol@azularc.com");
		r.sendMeResetPasswordLinkButton().click();
		Assert.assertEquals(r.ResetPasswordAlert().getText(), "An email has been sent to you with a reset password link.");
	}
	
		
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

	
}
