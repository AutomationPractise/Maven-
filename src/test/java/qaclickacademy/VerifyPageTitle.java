package qaclickacademy;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.*;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;
import resources.dataLibrary;
import resources.UIElementsData;

public class VerifyPageTitle extends base{
	
	public LandingPage l;
	
	public UIElementsData d;

@BeforeMethod
public void basePageNavigation() throws IOException
{
	driver=initializeDriver();
	l= new LandingPage(driver);
	d=new UIElementsData();
}

/*@Test(dataProvider="title" , dataProviderClass=dataLibrary.class)

public void VerifyTitle(String expected_title)
{
	driver.get(prop.getProperty("URL"));
	l.getNo_thanks().click();
	String actual_title=l.getTitle().getText();
	Assert.assertEquals(actual_title, expected_title);
}
*/
@Test

public void VerifyTitle()
{
	l.getNo_thanks().click();
	String actual_title=l.getTitle().getText();
	//System.out.println(d.expectedTitle);
	Assert.assertEquals(actual_title, d.expectedTitle);
}

@AfterMethod
public void tearDown()
{
driver.close();	
}

/*@DataProvider

public Object[][] getData()
{
	Object[][] data= new Object[2][3];
	//0th row
	data[0][0]="user1@gmail.com";
	data[0][1]="123456";
	data[0][2]= "Restrictred user";
	//1st Row
	data[1][0]="user2@gmail.com";
	data[1][1]="1234567";
	data[1][2]= "Non Restrictred user";
	return data;
}*/
	
}
