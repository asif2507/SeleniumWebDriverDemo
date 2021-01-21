package XpathAll;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondOne {
	public static WebDriver driver;

	public static void main(String[] args) {
		
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("how to handle dropdown");
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']/Center/input[@name='btnK']")).click();
	}

}
