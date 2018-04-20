package qaclickacademy;
import java.io.IOException;


import org.testng.annotations.*;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;
import resources.dataLibrary;


public class HomePage extends base{
	
	public LandingPage l;
	public LoginPage lp;
	

@BeforeMethod
public void basePageNavigation() throws IOException
{
	driver=initializeDriver();
	l= new LandingPage(driver);
	lp=new LoginPage(driver);
	
}
	

@Test(dataProvider="get" , dataProviderClass=dataLibrary.class)

public void Login(String username, String password, String text) throws IOException
{
	l.getNo_thanks().click();
	l.getLogin().click();
	lp.getEmail().sendKeys(username);
	lp.getPassword().sendKeys(password);
	System.out.println(text);
	lp.getSubmit().click();
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
