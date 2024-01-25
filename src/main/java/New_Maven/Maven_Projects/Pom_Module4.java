package New_Maven.Maven_Projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.Return;

public class Pom_Module4 {

	WebDriver driver;

	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement fname;

	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lname;

	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement address;

	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement card;

	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement type;

	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement emonth;

	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement eyear;

	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement cvv;

	@FindBy(xpath = "//input[@type='button']")
	private WebElement cli1;

	public WebElement getfname() {

		return fname;
	}

	public WebElement getlname() {

		return lname;
	}

	public WebElement getaddress() {

		return address;
	}

	public WebElement getcard() {

		return card;
	}

	public WebElement gettype() {

		return type;
	}

	public WebElement getexpmon() {

		return emonth;
	}

	public WebElement getexpyear() {

		return eyear;
	}

	public WebElement getcvv() {

		return cvv;
	}

	public WebElement submit() {

		return cli1;
	}

	public Pom_Module4(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

}
