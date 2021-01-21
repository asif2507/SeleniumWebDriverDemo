package JavascriptExecuter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstOne {

	//https://stackoverflow.com/questions/52689880/what-is-javascriptexecutor-in-selenium
	
	
	
	public static WebDriver driver;

	@BeforeMethod
	public void startUp() {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}
	
	@Test
	public void testCase1() {
		
		driver.get("http://demo.guru99.com/V4/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 long start_time = System.currentTimeMillis();			
			js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
		
		 System.out.println("Passed time: " + (System.currentTimeMillis() - start_time));					
	       
	}
	
	
	@Test
	public void testCase2() {
		
		
        JavascriptExecutor js = (JavascriptExecutor)driver;		
        		
        //Launching the Site.		
        driver.get("http://demo.guru99.com/V4/");			
        		
        WebElement button =driver.findElement(By.name("btnLogin"));			
        		
        //Login to Guru99 		
        driver.findElement(By.name("uid")).sendKeys("mngr34926");					
        driver.findElement(By.name("password")).sendKeys("amUpenu");					
        		
        //Perform Click on LOGIN button using JavascriptExecutor		
        js.executeScript("arguments[0].click();", button);
                                
        //To generate Alert window using JavascriptExecutor. Display the alert message 			
        js.executeScript("alert('Welcome to Guru99');");   
		
        
		
		
		
	}
	
	
	
	@Test
	public void testCase3() {
		
		  JavascriptExecutor js = (JavascriptExecutor)driver;		
		  String myValue = "80120804076"; 
		driver.get("https://www.google.com/");
		  
		WebElement s =  driver.findElement(By.xpath("//input[@name='q']"));
		  js.executeScript("arguments[0].value='" + myValue + "';", s);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

