package New_Maven.Maven_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Search_Hotel {
	
	WebDriver driver;
	
	@FindBy(xpath="//select[@id='location']")
	private WebElement location;
	
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotel;
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement room;
	
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement roomnum;
	
	@FindBy(xpath="//input[@name='datepick_in']") 
	private WebElement sdate;
	
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement edate;
	
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adult;
	
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement kids;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement search;
	
	public WebElement getlocation() {
		return location;
	}
	
	public WebElement gethotel() {
		return hotel;
	}
	
	public WebElement getroom() {
		return room;
	}
	
	public WebElement getroomnum() {
		return roomnum;
	}	
	
	public WebElement getsdate() {
		return sdate;
	}
	
	public WebElement getedate() {
		return edate;
	}
	
	public WebElement getadult() {
		return adult;
	}
	
	public WebElement getkids() {
		return kids;
	}
	
	public WebElement search() {
		return search;
	}
	
	
	
	
	
	public Pom_Search_Hotel(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	


}



