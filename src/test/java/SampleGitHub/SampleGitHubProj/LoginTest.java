package SampleGitHub.SampleGitHubProj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	@BeforeTest
	public void setUp()
	{
        System.setProperty("webdriver.chrome.driver", "F:\\selenium web drivers\\chromedriver_win32\\chromedriver.exe");
		
	    driver=new ChromeDriver();
	}
	@Test
	public void doLogin()
	{
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("9405212533");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("bhavesh@2206");
		
	}
	
	@Test
	public void tearDown()
	{
		driver.quit();
	}
}
