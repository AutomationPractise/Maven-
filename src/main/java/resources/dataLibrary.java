package resources;

import org.testng.annotations.DataProvider;

public class dataLibrary {

	@DataProvider(name = "get")
	public static Object[][] getData()
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
	}
	/*@DataProvider(name="title")
	
	public static  Object[] getTitle()
	{
		Object[] str= new Object[1];
		str[0]="FEATURED COURSES";
		return str;
	}
	*/
	
	
}
