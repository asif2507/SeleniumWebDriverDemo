package LoginPage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLoginTest {
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("a._42ft._4jy0._6lti._4jy6._4jy2.selected._51sy")).click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> iterate = window.iterator();
		
		String first_window = iterate.next();
		System.out.println(first_window);

		driver.findElement(By.xpath("//div[@class='_8ien']"));
		//System.out.println(driver.findElement(By.xpath("//div[@class='_52lr fsm fwn fcg']")).getText());
	
		
		
		
		//second winodow xpath //div[@class='_8ien']
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
