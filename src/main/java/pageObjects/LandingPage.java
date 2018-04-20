package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LandingPage {
	
	public WebDriver driver;
	
	By login = By.cssSelector("a[href*='sign_in']");
	By no_thanks= By.xpath("//button[text()='NO THANKS']/following::div[1]");
	By title= By.cssSelector(".text-center>h2");
	
	public LandingPage(WebDriver driver)   // constructor
	{
		this.driver=driver;
	}
	
	
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}
	public WebElement getNo_thanks()
	{
		return driver.findElement(no_thanks);
	}
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}


}
