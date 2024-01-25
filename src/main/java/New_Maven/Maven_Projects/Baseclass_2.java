package New_Maven.Maven_Projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass_2 {

	static WebDriver driver;

	public void Broswer() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public void url(String a) {

		driver.get(a);

	}

	public void sendkeys(WebElement element, String value) {

		element.sendKeys(value);

	}

	public void click(WebElement element) {

		element.click();

	}

	public void quit() {

		driver.quit();

	}

	public void close() {

		driver.close();
	}

	
	public void navigate_to() {
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
