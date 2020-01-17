package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test {

	
	
	@DataProvider(name = "dt")
	
	public Object[][] credenatils()
	{
		
		return new Object[][] {{"test","test2"},{"test","test2"},{"test","test2"}};
		
	}
	
	
	@Test(dataProvider ="dt")
	public void login (String USername, String Password)
	{
		
		System.out.println(USername + Password);
	}
}
