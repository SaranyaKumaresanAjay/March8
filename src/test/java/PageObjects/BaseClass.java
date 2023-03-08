package PageObjects;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public String baseUrl="https://demo.guru99.com/v3/index.php";
	public String username="mngr477973";
	public String password="bEzAhEb";
	public static WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	

}
