package XpathAll;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FifthOne {
	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_forms.asp");
		String text = driver.findElement(By.xpath("//input[@id ='fname']")).getAttribute("value");

		System.out.println(text);

		String firstname = driver.findElement(By.xpath("//label[@for='fname']")).getText();

		System.out.println(firstname);
	}

}
