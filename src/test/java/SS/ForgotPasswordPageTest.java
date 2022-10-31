package SS;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.UberAdmin_LoginPage;
import pageObjects.UberAdmin_ResetPasswordPage;
import resources.base;

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
		UberAdmin_LoginPage l = new UberAdmin_LoginPage(driver);
		l.ForgotPassword().click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://smartstudio-stage.azul-arc.com/#/forgotPassword");
		UberAdmin_ResetPasswordPage r = new UberAdmin_ResetPasswordPage(driver);
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
