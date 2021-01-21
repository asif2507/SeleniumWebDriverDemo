package AssertAll;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class SoftAssertTest {

	public static WebDriver driver;

	/*
	 * @BeforeClass public void setUp() {
	 * 
	 * WebDriverManager.firefoxdriver().setup(); driver = new FirefoxDriver();
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 * 
	 * }
	 */
	@Test(priority =2)
	public void testcase1() {

		System.out.println("Beginning");
		String expected_title = "Yahoo.com"; // excel
		String actual_title = "Gmail.com"; // selenium
		
		SoftAssert softAssert = new SoftAssert();

		System.out.println("Validating title");

		softAssert.assertEquals(actual_title, expected_title);
		
		
		System.out.println("Validating image");
		softAssert.assertEquals(true, false,"image not present");
		

		System.out.println("validate text box presence");
		softAssert.assertEquals(true, false,"text box not present");
		//Assert.fail("Failing the test as the condition is not met");
		System.out.println("Ending");
	
		
		//softAssert.assertAll();
		
	}
	
	
	@Test(priority =1)
	public void testCase2() {
		
		String expected_title = "Yahoo.com"; // excel
		String actual_title = "Gmail.com"; // selenium
	
		Assert.assertEquals(expected_title, actual_title);

	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
