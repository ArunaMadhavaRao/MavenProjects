package New_Maven.Maven_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TstAnotation extends BaseClass {

	@Test(priority = -1)
	public static void browser() {

		browser_Launch("chrome");
		url("https://www.facebook.com/");

	}

	@Test(priority = 0)
	public static void name() {

		WebElement user = driver.findElement(By.xpath("//input[@name='email']"));
		send_keys(user, "aruna23@gmail.com");

	}

	@Test(priority = 1)
	public static void pass() {

		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		send_keys(pass, "internet");

	}

	@Test(priority = 2)
	public static void click() {

		WebElement clic = driver.findElement(By.xpath("//button[@type='submit']"));
		click(clic);

	}

}
