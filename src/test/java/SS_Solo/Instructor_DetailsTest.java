package SS_Solo;

import java.io.IOException;
import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.base;
import soloInstructor_PageObjects.Instructor_Details;
import uberAdmin_PageObjects.Uber_InstructorList;
import uberAdmin_PageObjects.Create_SoloInstructor;
import uberAdmin_PageObjects.Uber_Login;

public class Instructor_DetailsTest extends base{

	@BeforeTest
	public void initialize() throws IOException
	
	{
		driver = initializeBrowser();
		driver.get("https://smartstudio-stage.azul-arc.com/#/alias886/solo-instructor/login");
		Uber_Login u = new Uber_Login(driver);
		u.EmailID().sendKeys("jyoti.kharatmol@azularc.com");
		u.Password().sendKeys("Password@3");
		u.LoginButton();
	}
	
	@Test
	public void InstructorDetails()
	{
		Instructor_Details i = new Instructor_Details(driver);
		Assert.assertTrue(i.BrandName().getAttribute("value").contains("Cross-Fit"));
		Assert.assertTrue(i.TimeZone().getAttribute("value").contains("5ea194e6184c292bccec9bd5"));
		
		Assert.assertTrue(i.Address1().getAttribute("value").contains("1022 Highland Street"));
		
		Assert.assertTrue(i.City().getAttribute("value").contains("Atlanta"));
		
		Assert.assertTrue(i.State().getAttribute("value").contains("5fc649ea3e54e40452ba916c"));
		
		Assert.assertTrue(i.Zip().getAttribute("value").contains("30300"));
		
		Assert.assertTrue(i.FirstName().getAttribute("value").contains("Jyoti"));
		
		Assert.assertTrue(i.LastName().getAttribute("value").contains("Kharatmol"));
	
		Assert.assertTrue(i.PhoneNumber().getAttribute("value").contains("(234) 562-3235"));
		
		Assert.assertTrue(i.EmailId().getAttribute("value").contains("jyoti.kharatmol@azularc.com"));
		
		Assert.assertTrue(i.CompanyAlias().getAttribute("value").contains("alias886"));
		
		Assert.assertTrue(i.MerchantId().getAttribute("value").contains("234542"));
	
	}
	
	@AfterTest
	public void teardown()
	{
	driver.close();
	}
	
	
	
	
}
