package AssertAll;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SourceFuse {


	public static WebDriver driver;
	
	
	


	@BeforeMethod
	public void initilize() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void testCase1() {

		driver.get("http://sfwebhtml.sourcefuse.com/automation-form-demo-for-interview/");
		System.out.println(driver.findElement(By.xpath("//label[@for='fname']")).getText());
		System.out.println(driver.findElement(By.xpath("//label[@for='lname']")).getText());
		System.out.println(driver.findElement(By.xpath("//label[@for='email']")).getText());
		System.out.println(driver.findElement(By.xpath("//label[@for='curCompany']")).getText());
		System.out.println(driver.findElement(By.xpath("//label[@for='mob']")).getText());

		System.out.println(driver.findElement(By.xpath("//label[@for='DOB']")).getText());
		System.out.println(driver.findElement(By.xpath("//label[@for='position']")).getText());
		System.out.println(driver.findElement(By.xpath("//label[@for='portfolio']")).getText());
		System.out.println(driver.findElement(By.xpath("//label[@for='salary']")).getText());
		System.out.println(driver.findElement(By.xpath("//label[@for='whenStart']")).getText());
		System.out.println(driver.findElement(By.xpath("//label[@for='address']")).getText());
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

	}

	@Test
	public void TestCase2() {

		driver.get("http://sfwebhtml.sourcefuse.com/automation-form-demo-for-interview/");
		SoftAssert sassr = new SoftAssert();

		WebElement fname = driver.findElement(By.xpath("//div[@id='fnameInput']/input[@class='form-control']"));
		sassr.assertEquals(true, fname.isDisplayed());

		WebElement lname = driver.findElement(By.xpath("//div[@id='lnameInput']/input[@class='form-control']"));
		sassr.assertEquals(true, lname.isDisplayed());

		WebElement email = driver.findElement(By.xpath("//div[@id='email']/input[@class='form-control']"));
		sassr.assertEquals(true, email.isDisplayed());

		WebElement currentComp = driver
				.findElement(By.xpath("//div[@id='curCompanyInput']/input[@class='form-control']"));
		sassr.assertEquals(true, currentComp.isDisplayed());

		WebElement mobile = driver.findElement(By.xpath("//div[@id='mobInput']/input[@class='form-control']"));
		sassr.assertEquals(true, mobile.isDisplayed());

		WebElement DOB = driver.findElement(By.xpath("//div[@id ='DOBInput']/div[@class='input-group date']"));
		sassr.assertEquals(true, DOB.isDisplayed());

		WebElement PostionApp = driver.findElement(By.xpath("//div[@id='positionInput']/input[@class='form-control']"));
		sassr.assertEquals(true, PostionApp.isDisplayed());

		WebElement portfolioInput = driver
				.findElement(By.xpath("//div[@id='portfolioInput']/input[@class='form-control']"));
		sassr.assertEquals(true, portfolioInput.isDisplayed());

		WebElement salary = driver.findElement(By.xpath("//div[@id='salaryInput']/input[@class='form-control']"));
		sassr.assertEquals(true, salary.isDisplayed());

		WebElement WUCS = driver.findElement(By.xpath("//div[@id='whenStartInput']/input[@class='form-control']"));
		sassr.assertEquals(true, WUCS.isDisplayed());

		WebElement address = driver.findElement(By.xpath("//label[@for='address']"));
		sassr.assertEquals(true, address.isDisplayed());

		
		System.out.println("Verify all,Hard assert");

		sassr.assertAll();

	}

	@Test
	public void TestCase3() {

		driver.get("http://sfwebhtml.sourcefuse.com/automation-form-demo-for-interview/");

		WebElement fname = driver.findElement(By.xpath("//div[@id='fnameInput']/input[@class='form-control']"));
		Assert.assertEquals(true, fname.isDisplayed());

		WebElement lname = driver.findElement(By.xpath("//div[@id='lnameInput']/input[@class='form-control']"));
		Assert.assertEquals(true, lname.isDisplayed());

		WebElement email = driver.findElement(By.xpath("//div[@id='email']/input[@class='form-control']"));
		Assert.assertEquals(true, email.isDisplayed());

		WebElement currentComp = driver.findElement(By.xpath("//div[@id='curCompanyInput']/input[@class='form-control']"));
		Assert.assertEquals(true, currentComp.isDisplayed());

		WebElement mobile = driver.findElement(By.xpath("//div[@id='mobInput']/input[@class='form-control']"));
		Assert.assertEquals(true, mobile.isDisplayed());

		WebElement DOB = driver.findElement(By.xpath("//div[@id ='DOBInput']/div[@class='input-group date']"));
		Assert.assertEquals(true, DOB.isDisplayed());

		WebElement PostionApp = driver.findElement(By.xpath("//div[@id='positionInput']/input[@class='form-control']"));
		Assert.assertEquals(true, PostionApp.isDisplayed());

		WebElement portfolioInput = driver.findElement(By.xpath("//div[@id='portfolioInput']/input[@class='form-control']"));
		Assert.assertEquals(true, portfolioInput.isDisplayed());

		WebElement salary = driver.findElement(By.xpath("//div[@id='salaryInput']/input[@class='form-control']"));
		Assert.assertEquals(true, salary.isDisplayed());

		WebElement WUCS = driver.findElement(By.xpath("//div[@id='whenStartInput']/input[@class='form-control']"));
		Assert.assertEquals(true, WUCS.isDisplayed());

		WebElement address = driver.findElement(By.xpath("//div[@id='addressInput']/input[@class='form-control']"));
		Assert.assertEquals(true, address.isDisplayed());

		System.out.println("Verify all,Hard assert");

	}

	@Test
	public void TestCase4() {

		driver.get("http://sfwebhtml.sourcefuse.com/automation-form-demo-for-interview/");

		driver.findElement(By.xpath("//div[@id='fnameInput']/input[@class='form-control']")).sendKeys("Asif");
		driver.findElement(By.xpath("//div[@id='lnameInput']/input[@class='form-control']")).sendKeys("saleem");
		driver.findElement(By.xpath("//div[@id='email']/input[@class='form-control']")).sendKeys("asifsaleem2507@gmail.com");
		driver.findElement(By.xpath("//div[@id='curCompanyInput']/input[@class='form-control']")).sendKeys("Esika infotech");
		driver.findElement(By.xpath("//div[@id='mobInput']/input[@class='form-control']")).sendKeys("9125867790");
		driver.findElement(By.xpath("//div[@id ='DOBInput']/div[@class='input-group date']")).sendKeys("25-july-1993");
		driver.findElement(By.xpath("//div[@id='positionInput']/input[@class='form-control']")).sendKeys("QA Engineer");
		driver.findElement(By.xpath("//div[@id='portfolioInput']/input[@class='form-control']")).sendKeys("");
		driver.findElement(By.xpath("//div[@id='salaryInput']/input[@class='form-control']")).sendKeys("390000");
		driver.findElement(By.xpath("//div[@id='whenStartInput']/input[@class='form-control']")).sendKeys("within 15 days");
		 driver.findElement(By.xpath("//div[@id='addressInput']/input[@class='form-control']")).sendKeys("");
		 driver.findElement(By.xpath("//div[@id='resumeInput']/input[@class='form-control']")).sendKeys("/home/asif/Downloads/asifResume-converted(1).pdf");
			
		driver.findElement(By.xpath("//input[@id='yes'] ")).click();
		
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

	}
	
	
	
	
	
	
	
	
	
	
	
	

	@AfterMethod
	public void quit() {
		
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
