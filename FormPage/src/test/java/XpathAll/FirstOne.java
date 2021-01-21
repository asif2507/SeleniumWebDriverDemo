package XpathAll;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstOne {

 public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		String name = driver.findElement(By.xpath("//input[@id ='email']")).getAttribute("placeholder");
		
		/*
		 
		  
		 *    String   s=driver.findElement(By.xpath("//input[@placeholder='Gender']")).getAttribute
		 * ("placeholder"); System.out.println(s);
		 * 
		 */
		System.out.println(name);
		
		
		String password = driver.findElement(By.xpath("//input[@id='pass']")).getAttribute("placeholder");
		System.out.println(password);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
