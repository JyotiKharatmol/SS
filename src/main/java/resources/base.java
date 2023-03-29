package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	public WebDriver driver;
	
	public Properties pro;
	
	public String username; 

	public WebDriver initializeBrowser() throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\jyoti_xfiqe3z\\GitSS\\src\\main\\java\\resources\\data.properties");
		
		pro = new Properties();
		pro.load(fis);
		String browserName = pro.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\jyoti_xfiqe3z\\Desktop\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();	
		}
		
		if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\jyoti_xfiqe3z\\OneDrive\\Documents\\GeckoDriver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			 driver = new FirefoxDriver();	
		}
		
		if(browserName.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\jyoti_xfiqe3z\\OneDrive\\Documents\\EdgeDriver\\edgedriver_win64\\msedgedriver.exe");
			 driver = new EdgeDriver();	
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
	
	public void getScreenshotPath(String testCaseName, WebDriver driver) throws IOException
{
		
		TakesScreenshot tst = (TakesScreenshot) driver;
	File source = 	tst.getScreenshotAs(OutputType.FILE);
	String destination = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
	
		FileUtils.copyFile(source, new File(destination));
		
	}
	public String generateRandomString()
	{
		username = "Pinklin" + new Random().nextInt(5000);
		return username;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
