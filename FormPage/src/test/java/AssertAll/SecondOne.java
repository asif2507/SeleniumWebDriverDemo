package AssertAll;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondOne {
	public static WebDriver driver;

	@BeforeMethod
	public void setUp() {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void testCase1() {
		driver.get("https://en-gb.facebook.com/login/?next");
		System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getAttribute("placeholder"));
		System.out.println(driver.findElement(By.xpath("//input[@id='pass']")).getAttribute("placeholder"));
		driver.findElement(By.xpath("//button[@name='login']")).click();

	}

	@Test
	public void testCase2() {

		driver.get("https://en-gb.facebook.com/login/?next");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8090440601");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("##asif2507");
		driver.findElement(By.xpath("//button[@name='login']")).click();

	}
	
	@Test
	public void testCase3() {
		
		driver.get("https://en-gb.facebook.com/login/?next");
		WebElement verifyName = driver.findElement(By.xpath("//input[@id='email']"));
		SoftAssert sassr = new SoftAssert();
		sassr.assertEquals(true, verifyName.isDisplayed());
		WebElement verifyPass = driver.findElement(By.xpath("//input[@id='pass']"));
		sassr.assertEquals(false, verifyPass.isDisplayed());
		
		
	}
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
