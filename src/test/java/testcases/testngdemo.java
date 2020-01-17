package testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class testngdemo {
	
	@BeforeTest
	public void beforemethod()
	{
		System.out.println("before method");
	}
	
	@Test (priority =1)
	public void testcase_01()
	{
		System.out.println("Loginapplication_01");
		System. setProperty("webdriver.chrome.driver", "C:\\Users\\himanshuagrawal\\git\\IO_S08I_PayAsiaQA\\PayAsiaAutomation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/testng-execute-multiple-test-suites.html");
		System.out.println("TestCase01");
	}
	
	@Test (priority =2 , enabled = false)
	public void testcase_02()
	{
		System.out.println("TestCase02");
	}

	
	@Test (priority =2 , enabled = false)
	public void testcase_03()
	{
		System.out.println("TestCase03");
	}

	
	@Test (priority =2 , enabled = false)
	public void testcase_04()
	{
		System.out.println("TestCase04");
	}

	
	@Test (priority =2 , enabled = false)
	public void testcase_05()
	{
		System.out.println("TestCase05");
	}

	
	@AfterTest
	public void Aftermethod()
	{
		System.out.println("After method");
	}
	
	
	

}
