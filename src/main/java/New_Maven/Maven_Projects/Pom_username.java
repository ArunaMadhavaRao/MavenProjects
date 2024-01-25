package New_Maven.Maven_Projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_username {
	
		WebDriver driver;
		
		@FindBy(xpath = "//input[@name='username']")
		private WebElement user;
		
		@FindBy(xpath="//input[@name='password']")
		private WebElement pass;
		
		@FindBy(xpath="//input[@name='login']")
		private WebElement login;
		
		public WebElement getusername() {
			
			return user;
		}
		
		public WebElement getpassword() {
			
			return pass;
		}
		
		public WebElement login() {
			
			return login;
		}
		
		public Pom_username(WebDriver driver) {
			
			this.driver = driver;
			PageFactory.initElements(driver,this);
		}
		
	

}
