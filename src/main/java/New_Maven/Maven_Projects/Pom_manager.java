package New_Maven.Maven_Projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Pom_manager {

	WebDriver driver;

	private Pom_username p1;
	private Pom_Search_Hotel p2;
	private Pom_Module3 p3;
	private Pom_Module4 p4;

	public Pom_username getuser() {

		p1 = new Pom_username(driver);
		return p1;

	}

	public Pom_Search_Hotel getSearch() {

		p2 = new Pom_Search_Hotel(driver);

		return p2;

	}

	public Pom_Module3 getModule3() {

		p3 = new Pom_Module3(driver);
		return p3;
	}

	public Pom_Module4 getModule4() {

		p4 = new Pom_Module4(driver);
		return p4;

	}

	public Pom_manager(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
