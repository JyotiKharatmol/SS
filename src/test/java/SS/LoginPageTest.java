package SS;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.UberAdmin_CompanySoloTablePage;
import pageObjects.UberAdmin_LoginPage;
import pageObjects.UberAdmin_ResetPasswordPage;
import resources.base;

public class LoginPageTest extends base {
	
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeBrowser();
		driver.get(pro.getProperty("url"));
	}
	
	@Test
	public void verifyLoginWithCorrectCredentials() throws IOException
	{	
		UberAdmin_LoginPage l = new UberAdmin_LoginPage(driver);
		l.EmailID().sendKeys("jyoti.kharatmol@azularc.com");
		l.Password().sendKeys("Password@3");
		l.LoginButton();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.urlContains("https://smartstudio-stage.azul-arc.com/#/app"));
		Assert.assertEquals(driver.getCurrentUrl(), "https://smartstudio-stage.azul-arc.com/#/app");
		UberAdmin_CompanySoloTablePage u = new UberAdmin_CompanySoloTablePage(driver);
		u.LogoutButton().click();
		
	}
	
	@Test(dataProvider="getValue")
	public void verifyLoginWithIncorrectCredentials(String EmailId, String Password) throws IOException
	{	
		driver.get(pro.getProperty("url"));
		UberAdmin_LoginPage l = new UberAdmin_LoginPage(driver);
		l.EmailID().sendKeys(EmailId);
		l.Password().sendKeys(Password);
		l.LoginButton();
		Assert.assertEquals(driver.getCurrentUrl(), "https://smartstudio-stage.azul-arc.com/#/login");
	}
	@DataProvider
	public Object[][] getValue()
	{
		Object[][] data = new Object[3][2];
		data[0][0] = "jyotikharatmol@azularc.com";
		data[0][1]= "Password@3";
	
		data[1][0] = "jyoti.kharatmol@azularc.com";
		data[1][1]= "Password@1";
		
		data[2][0] = "jyotikharatmol@azularc.com";
		data[2][1]= "Password@T";
		
	  return data;
	}
	
	@Test
	public void verifyLoginWithNoData() throws IOException
	{
		
		UberAdmin_LoginPage l = new UberAdmin_LoginPage(driver);
		l.EmailID().sendKeys("");
		l.Password().sendKeys("");
		Assert.assertTrue(driver.findElement(By.cssSelector("button[type='submit']")).getAttribute("tabindex").contains("-1"));
	}
	
		
	@AfterTest
	public void teardown()
	{
	//	driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
