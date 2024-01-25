package New_Maven.Maven_Projects;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdactinTestingBase extends BaseClass {
	
	public static void login() throws InterruptedException {
		
		browser_Launch("chrome");
		url("https://adactinhotelapp.com/");
		
		WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
		send_keys(user,"ArunaRamesh");
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='password'] "));
		send_keys(pass,"K7ZSRN");
		
		WebElement click = driver.findElement(By.xpath("//input[@name='login'] "));
		click(click);
		
		waits("threadsleep",2000);
		
		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		select(location,"byvalue","Melbourne");
		
		WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
		select(hotel,"text","Hotel Creek");
		
		WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
		select(room,"text","Deluxe"); 
		
		WebElement roomnum = driver.findElement(By.xpath("//select[@name='room_nos']"));
		select(roomnum,"byvalue","1");
		
		WebElement sdate = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		send_keys(sdate,"02/11/2023"); 
		
		WebElement edate = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		send_keys(edate,"03/11/2023");
		
		WebElement adult = driver.findElement(By.xpath("//select[@name='adult_room']"));
		select(adult,"byvalue","2");
		
		WebElement kids = driver.findElement(By.xpath("//select[@name='child_room']"));
		select(kids,"byvalue","3");
		
		waits("threadsleep",3000);
		
		WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
		click(search);
		
		WebElement sel = driver.findElement(By.xpath("//input[@type='radio']"));
		click(sel);
		
		WebElement cli = driver.findElement(By.xpath("//input[@type='submit']"));
		click(cli);
		
		WebElement fname = driver.findElement(By.xpath("//input[@name='first_name']"));
		send_keys(fname,"Aruna");
		
		WebElement lname = driver.findElement(By.xpath("//input[@name='last_name']"));
		send_keys(lname,"Ramesh");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
		send_keys(address,"Korattur,Chennai");
		
		WebElement card = driver.findElement(By.xpath("//input[@name='cc_num']"));
		send_keys(card,"3156462345654561");
		
		WebElement type = driver.findElement(By.xpath("//select[@name='cc_type']"));
		select(type,"byvalue","VISA");
		
		WebElement emonth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		select(emonth,"byvalue","4");
		
		WebElement eyear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		select(eyear,"byvalue","2026");
		
		WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		send_keys(cvv,"844");
		
		WebElement cli1 = driver.findElement(By.xpath("//input[@type='button']"));
		click(cli1);
	}
	
public static void main(String[] args) throws InterruptedException {
	
	login();
}	

}
