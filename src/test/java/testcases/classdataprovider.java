package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class classdataprovider {
	
	
	@DataProvider(name = "values")
	 
	  public static Object[][] credentials() {
	 
	        // The number of times data is repeated, test will be executed the same no. of times
	 
	        // Here it will execute two times
	 
	        return new Object[][] { { "testuser_1", "Test@123" }, { "testuser_12", "Test@1234" }, { "abcd", "password1" }};
	 
	  }
	 
	  // Here we are calling the Data Provider object with its Name
	 
	  @Test(dataProvider = "values")
	 
	  public void test(String sUsername, String sPassword) {
	  System.out.println(sUsername + sPassword );
	     
	 
	  }
	 
	}


