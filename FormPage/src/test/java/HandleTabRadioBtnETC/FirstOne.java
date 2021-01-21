package HandleTabRadioBtnETC;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstOne {

	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.wikipedia.org/");
		WebElement Dropdown = driver.findElement(By.xpath("//select[@id='searchLanguage']"));

		Select select = new Select(Dropdown);
		// select.selectByVisibleText("English");

		List<WebElement> values = Dropdown.findElements(By.tagName("option"));

		// 0 - size-1(61-1=60)
		System.out.println("Total values are : " + values.size());

		// System.out.println(values.get(7).getText());

		for (int i = 0; i < values.size(); i++) {

			System.out.println(values.get(i).getAttribute("lang"));

		}

	}

}
