package resources;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {

	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop = new Properties();
		//FileInputStream fis = new FileInputStream("C:\\Users\\EKTA-PC\\Mavenjava\\src\\main\\java\\resources\\Data.properties");
		FileInputStream fis=new FileInputStream(new File(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\Data.properties"));
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		String URL=prop.getProperty("URL");
		String chromeExePath= prop.getProperty("chromeExePath");
		
		if(browserName.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", chromeExePath);
			  driver=new ChromeDriver();
			  driver.get(URL);
		}
		
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\EKTA-PC\\Downloads\\geckodriver.exe");
			 driver=new FirefoxDriver();
			 driver.get(URL);
			 
		}
		else if (browserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\EKTA-PC\\Downloads\\MicrosoftWebdriver.exe");
			driver=new InternetExplorerDriver();
			driver.get(URL);
		}
		
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		return driver;
	}
}
