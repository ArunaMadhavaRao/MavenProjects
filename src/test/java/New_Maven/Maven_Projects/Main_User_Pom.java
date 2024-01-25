package New_Maven.Maven_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Main_User_Pom extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		browser_Launch("chrome");
		url("https://adactinhotelapp.com/");

		Pom_username pom = new Pom_username(driver);

		send_keys(pom.getusername(), "ArunaRamesh");
		send_keys(pom.getpassword(), "K7ZSRN");
		click(pom.login());

		waits("threadsleeep", 2000);

		Pom_Search_Hotel pom1 = new Pom_Search_Hotel(driver);
		select(pom1.getlocation(), "byvalue", "Melbourne");
		select(pom1.gethotel(), "text", "Hotel Creek");
		select(pom1.getroom(), "text", "Deluxe");
		select(pom1.getroomnum(), "byvalue", "1");
		send_keys(pom1.getsdate(), "02/11/2023");
		send_keys(pom1.getedate(), "03/11/2023");
		select(pom1.getadult(), "byvalue", "2");
		select(pom1.getkids(), "byvalue", "3");

		waits("threadsleep", 3000);
		click(pom1.search());

		Pom_Module3 pom2 = new Pom_Module3(driver);
		click(pom2.getsel());
		click(pom2.clic());

		Pom_Module4 pom3 = new Pom_Module4(driver);
		send_keys(pom3.getfname(), "Aruna");
		send_keys(pom3.getlname(), "Ramesh");
		send_keys(pom3.getaddress(), "Korattur,Chennai");
		send_keys(pom3.getcard(), "3156462345654561");
		select(pom3.gettype(), "byvalue", "VISA");
		select(pom3.getexpmon(), "byvalue", "4");
		select(pom3.getexpyear(), "byvalue", "2026");
		send_keys(pom3.getcvv(), "844");
		click(pom3.submit());
		
		waits("threadsleep",8000);
		quit();

	}

}
