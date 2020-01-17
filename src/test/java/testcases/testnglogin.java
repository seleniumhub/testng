package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class testnglogin {
	 @Test(priority =1 ,groups = { "regression" })
	public void testcase_01()
	{
		 
		 System.out.println("Loginapplication_01");
		 System.out.println("Loginapplication_01");
			System. setProperty("webdriver.chrome.driver", "C:\\Users\\himanshuagrawal\\git\\IO_S08I_PayAsiaQA\\PayAsiaAutomation\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://minddemo.hronline-payasia.asia/portal/minddemo/employeeHome.html");
			System.out.println("TestCase01");
			driver.findElement(By.id("true"));
	}
	
	 @Test(priority =1 ,groups = { "regression" }, enabled = false)
	public void testcase_02()
	{
		System.out.println("LoginTestCase02");
	}

	
	@Test (priority =3, enabled = false)
	public void testcase_03()
	{
		System.out.println("LoginTestCase03");
	}

	
	@Test (priority =4, enabled = false)
	public void testcase_04()
	{
		System.out.println("LoginTestCase04");
	}

	
	@Test (priority =-5, enabled = false)
	public void testcase_05()
	{
		System.out.println("LoginTestCase05");
	}
	
	@Test( enabled = false)
	public void testcase()
	{
		System.out.println("no priority testcase");
	}
}
