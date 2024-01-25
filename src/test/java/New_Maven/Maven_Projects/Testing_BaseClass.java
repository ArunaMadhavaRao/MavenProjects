package New_Maven.Maven_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Testing_BaseClass extends BaseClass  {
	
	public static void main(String[] args) {
		
		browser_Launch("chrome");
		url("https://www.facebook.com/"); 
		
		WebElement name = driver.findElement(By.id("email"));
		send_keys(name,"ghvfgfjgy@gamil.com");
		
		WebElement pass = driver.findElement(By.id("pass"));
		send_keys(pass,"passgvg");
				
		
	}

}
