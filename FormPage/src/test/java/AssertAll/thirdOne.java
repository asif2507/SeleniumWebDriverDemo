package AssertAll;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class thirdOne {
	
	public static WebDriver driver;

	@BeforeMethod
	public void setUp() {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	
	
	
	
	
	
	
	
	@Test
	public void testCase3() {
		
		driver.get("https://en-gb.facebook.com/login/?next");
		WebElement verifyName = driver.findElement(By.xpath("//input[@id='email']"));
		SoftAssert sassr = new SoftAssert();
		sassr.assertEquals(true, verifyName.isDisplayed());
		WebElement verifyPass = driver.findElement(By.xpath("//input[@id='pass']"));
		//sassr.assertEquals(false, verifyPass.isDisplayed());
		//sassr.assertTrue(verifyPass.isDisplayed(),"condition is true");
		sassr.assertFalse(verifyPass.isDisplayed(),"condition is false");
		System.out.println("its works sortAssert");
		
		sassr.assertAll();
	}
	
	@Test
	public void testCase() {
		driver.get("https://en-gb.facebook.com/login/?next");
		WebElement verifyName = driver.findElement(By.xpath("//input[@id='email']"));
		Assert.assertEquals(false, verifyName.isDisplayed());
		System.out.println("its works hardassert");
		
	}
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	
	
	
	
	

}
