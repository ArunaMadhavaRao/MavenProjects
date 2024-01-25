package New_Maven.Maven_Projects;

public class Main_PomManager extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		browser_Launch("Chrome");
		url("https://adactinhotelapp.com/");

		Pom_manager mn = new Pom_manager(driver);
		send_keys(mn.getuser().getusername(), "ArunaRamesh");
		send_keys(mn.getuser().getpassword(), "K7ZSRN");
		waits("threadsleep", 2000);

		click(mn.getuser().login());

		waits("threadsleep", 2000);
		select(mn.getSearch().getlocation(), "byvalue", "Melbourne");
		select(mn.getSearch().gethotel(), "text", "Hotel Creek");
		select(mn.getSearch().getroom(), "text", "Deluxe");
		select(mn.getSearch().getroomnum(), "byvalue", "1");
		send_keys(mn.getSearch().getsdate(), "06/11/2023");
		send_keys(mn.getSearch().getedate(), "07/11/2023");
		select(mn.getSearch().getadult(), "byvalue", "2");
		select(mn.getSearch().getkids(), "byvalue", "3");

		waits("threadsleep", 2000);
		click(mn.getSearch().search());

		click(mn.getModule3().getsel());
		waits("threadsleep", 2000);
		click(mn.getModule3().clic());

		send_keys(mn.getModule4().getfname(), "Aruna");
		send_keys(mn.getModule4().getlname(), "Ramesh");
		send_keys(mn.getModule4().getaddress(), "Korattur,Chennai");
		send_keys(mn.getModule4().getcard(), "3156462345654561");
		select(mn.getModule4().gettype(), "byvalue", "VISA");
		select(mn.getModule4().getexpmon(), "byvalue", "4");
		select(mn.getModule4().getexpyear(), "byvalue", "2026");
		send_keys(mn.getModule4().getcvv(), "865");
		waits("threadsleep", 2000);
		click(mn.getModule4().submit());

		waits("threadsleep", 8000);
		quit();

	}

}
