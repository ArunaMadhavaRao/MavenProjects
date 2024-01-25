package New_Maven.Maven_Projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Module3 {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@type='radio']")
	private WebElement sel;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement cli;
	
	public WebElement getsel() {
		return sel;
	}
	
	public WebElement clic() {
		
		return cli;
	}
	
	
 public Pom_Module3(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	

}
