package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class class5 {
	
	
	@Test()
	public void testdepand1()
	{
		System.out.println("testdepand1");
		Assert.assertEquals("test", "test");
		
	}
	
	
	  @Test(dependsOnMethods = { "testdepand1" })
	public void testdepand2( )
	{
		System.out.println("testdepand2");
	}

	  
	  @Test
	  public void testdepand3( )
		{
			System.out.println("testdepand3");
			Assert.assertEquals("test123", "test123");
		}
}
