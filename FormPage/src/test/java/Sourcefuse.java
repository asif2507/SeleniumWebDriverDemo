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

public class Sourcefuse {

	public static WebDriver driver;

	@BeforeMethod
	public void startUp() {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://sfwebhtml.sourcefuse.com/automation-form-demo-for-interview/");

	}

	@Test
	public void testcase1() {

		System.out.println(driver.findElement(By.xpath("/html/body/div/form/div[1]/div[1]/div/label")).getText());
		System.out.println(driver.findElement(By.xpath("/html/body/div/form/div[1]/div[2]/div/label")).getText());
		System.out.println(driver.findElement(By.xpath("/html/body/div/form/div[2]/div[1]/div/label")).getText());
		System.out.println(driver.findElement(By.xpath("/html/body/div/form/div[2]/div[2]/div/label")).getText());
		System.out.println(driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/div/label")).getText());
		System.out.println(driver.findElement(By.xpath("/html/body/div/form/div[3]/div[2]/div/label")).getText());
		System.out.println(driver.findElement(By.xpath("/html/body/div/form/div[4]/div[1]/div/label")).getText());
		System.out.println(driver.findElement(By.xpath("/html/body/div/form/div[4]/div[2]/div/label")).getText());
		System.out.println(driver.findElement(By.xpath("/html/body/div/form/div[5]/div[1]/div/label")).getText());
		System.out.println(driver.findElement(By.xpath("/html/body/div/form/div[5]/div[2]/div/label")).getText());
		System.out.println(driver.findElement(By.xpath("/html/body/div/form/div[6]/div/div/label")).getText());
		System.out.println(driver.findElement(By.xpath("/html/body/div/form/div[7]/div[1]/div/label")).getText());
		System.out.println(driver.findElement(By.xpath("/html/body/div/form/div[7]/div[2]/div/label")).getText());

		driver.findElement(By.xpath("/html/body/div/form/button[1]")).click();
	}

	@Test
	public void testcase2() {

		SoftAssert sasst = new SoftAssert();

		WebElement fname = driver.findElement(By.xpath("/html/body/div/form/div[1]/div[1]/div/div/input"));
		WebElement lname = driver.findElement(By.xpath("/html/body/div/form/div[1]/div[2]/div/div/input"));
		WebElement email = driver.findElement(By.xpath("/html/body/div/form/div[2]/div[1]/div/div/input"));
		WebElement ccompany = driver.findElement(By.xpath("/html/body/div/form/div[2]/div[2]/div/div/input"));
		WebElement Mobile = driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/div/div/input"));
		WebElement dob = driver.findElement(By.xpath("/html/body/div[1]/form/div[3]/div[2]/div/div/div/input"));
		WebElement Position = driver.findElement(By.xpath("/html/body/div/form/div[4]/div[1]/div/div/input"));
		WebElement Portfolio = driver.findElement(By.xpath("/html/body/div/form/div[4]/div[2]/div/div/input"));
		WebElement Salary = driver.findElement(By.xpath("/html/body/div/form/div[5]/div[1]/div/div/input"));
		WebElement WhenCanYouStart = driver.findElement(By.xpath("/html/body/div/form/div[5]/div[2]/div/div/input"));
		WebElement Address = driver.findElement(By.xpath("//*[@id=\"address\"]"));
		WebElement Resume = driver.findElement(By.xpath("//*[@id=\"resume\"]"));
		WebElement relocate = driver.findElement(By.xpath("//*[@id=\"yes\"]"));

		sasst.assertEquals(true,fname.isDisplayed());
		sasst.assertEquals(true,lname.isDisplayed());
		sasst.assertEquals(true,email.isDisplayed());
		sasst.assertEquals(true,ccompany.isDisplayed());
		sasst.assertEquals(true,Mobile.isDisplayed());
		sasst.assertEquals(true,dob.isDisplayed());
		sasst.assertEquals(true,Position.isDisplayed());
		sasst.assertEquals(true,Portfolio.isDisplayed());
		sasst.assertEquals(true,Salary.isDisplayed());
		sasst.assertEquals(true,WhenCanYouStart.isDisplayed());
		sasst.assertEquals(true,Address.isDisplayed());
		sasst.assertEquals(true,Resume.isDisplayed());
		sasst.assertEquals(true,relocate.isDisplayed());

	}

	@Test
	public void testcase3() {
	
		
		
		
		
	}

	
	public void testcase4() {

	}
	
	
	

	@AfterMethod
	public void tearDown() {

		if (driver != null) {

			driver.quit();

		}

	}
}

