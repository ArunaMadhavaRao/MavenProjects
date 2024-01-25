package New_Maven.Maven_Projects;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	static WebDriver driver;

	public static void browser_Launch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("internetexplorer")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		} else if (browser.equalsIgnoreCase("safari")) {
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
	}

	public static void url(String url) {

		driver.get(url);

	}

	public static void send_keys(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static void quit() {

		driver.quit();

	}

	public static void close() {

		driver.close();

	}

	public static void navi_to(String url) {

		driver.navigate().to(url);

	}

	public static void navi_back() {

		driver.navigate().back();

	}

	public static void navi_for() {

		driver.navigate().forward();
	}

	public static void refresh() {

		driver.navigate().refresh();

	}

	public static void alert_Accept() {

		driver.switchTo().alert().accept();

	}

	public static void alert_decline() {

		driver.switchTo().alert().dismiss();
	}

	public static void alert_Delay(int sleep, String type) throws InterruptedException {

		if (type.equalsIgnoreCase("accept")) {
			Thread.sleep(sleep);
			driver.switchTo().alert().accept();
		} else if (type.equalsIgnoreCase("dismiss")) {
			Thread.sleep(sleep);
			driver.switchTo().alert().dismiss();
		}
	}

	public static void alert_text(String text, String type) {

		driver.switchTo().alert().sendKeys(text);
		if (type.equalsIgnoreCase("accept")) {

			driver.switchTo().alert().accept();
		} 
		else if (type.equalsIgnoreCase("decline"))
		{

			driver.switchTo().alert().dismiss();

		}
	}

	public static void actions(WebElement element, String type) {

		Actions aa = new Actions(driver);
		if (type.equalsIgnoreCase("click")) 
		{
			
			aa.click(element).build().perform();
		} 
		else if (type.equalsIgnoreCase("rightclick")) 
		{
			
			aa.contextClick(element).build().perform();
		}
		else if (type.equalsIgnoreCase("Doubleclick")) 
		{
			
			aa.doubleClick(element).build().perform();
		} 
		else if (type.equalsIgnoreCase("clickandhold"))
		{
			
			aa.clickAndHold(element).build().perform();
		}
	}

	public static void dragAndDrop(WebElement drag, WebElement drop) {

		Actions aa = new Actions(driver);
		aa.dragAndDrop(drag, drop).build().perform();

	}

	public static void sigle_Frame(WebElement element, String text, WebElement element1) {

		driver.switchTo().frame(element);
		element1.sendKeys(text);
		driver.switchTo().defaultContent();

	}

	public static void multi_Frames(WebElement element, WebElement element1, WebElement element2, String text) {

		driver.switchTo().frame(element);
		driver.switchTo().frame(element1);
		element2.sendKeys(text);
		driver.switchTo().defaultContent();
	}

	public static void robot(String type) throws AWTException {

		Robot rr = new Robot();
		if (type.equalsIgnoreCase("enter"))
		{
			rr.keyPress(KeyEvent.VK_ENTER);
			rr.keyRelease(KeyEvent.VK_ENTER);
		} 
		else if (type.equalsIgnoreCase("down"))
		{
			rr.keyPress(KeyEvent.VK_DOWN);
			rr.keyRelease(KeyEvent.VK_DOWN);
		}
		else if (type.equalsIgnoreCase("up")) 
		{
			rr.keyPress(KeyEvent.VK_UP);
			rr.keyRelease(KeyEvent.VK_UP);
		}
	}

	public static void windows() throws AWTException {

		String text = driver.getWindowHandle();
		String title = driver.switchTo().window(text).getTitle();
		System.out.println("Parent windows's ID:" + text);
		System.out.println("Parent window's Title:" + title);

		Set<String> child = driver.getWindowHandles();
		for (String aa1 : child) {
			System.out.println("Child Window Id's:" + aa1);
		}

		int size = child.size();
		System.out.println("Size of the Child Windows:" + size);

		for (String win : child) {

			String title2 = driver.switchTo().window(win).getTitle();
			System.out.println("Child Windows Title:" + title2);
		}

	}

	public static void select(WebElement element, String type, String value) {

		Select ss = new Select(element);
		if (type.equalsIgnoreCase("byvalue")) 
		{
			ss.selectByValue(value);

		} 
		else if (type.equalsIgnoreCase("text"))
		{
			ss.selectByVisibleText(value);
		} 
		else if (type.equalsIgnoreCase("index"))
		{
			int a = Integer.parseInt(value);
			ss.selectByIndex(a);
		}

	}

	public static void deselect(WebElement element, String type, String value) {

		Select ss = new Select(element);
		if (type.equalsIgnoreCase("byvalue"))
		{
			ss.deselectByValue(value);

		}
		else if (type.equalsIgnoreCase("text"))
		{
			ss.deselectByVisibleText(value);
		} 
		else if (type.equalsIgnoreCase("index")) 
		{
			int a = Integer.parseInt(value);
			ss.deselectByIndex(a);
		}

	}

	public static void click(WebElement element) {

		element.click();
	}

	public static void enabled(WebElement element) {

		boolean enabled = element.isEnabled();
		System.out.println("Is the Element Enabled:" + enabled);

	}

	public static void displayed(WebElement element) {

		boolean displayed = element.isDisplayed();
		System.out.println("Is the Element Displayed:" + displayed);
	}

	public static void selected(WebElement element) {

		boolean selected = element.isSelected();
		System.out.println("Is the Element Selected:" + selected);

	}

	public static void getopions(WebElement elements) {

		Select s = new Select(elements);
		List<WebElement> options = s.getOptions();

		for (WebElement mul : options) {
			String text = mul.getText();
			System.out.println("All the Options:" + text);
		}
	}

	public static void gettitle() {

		String title = driver.getTitle();
		System.out.println("Title of the Page is:" + title);

	}

	public static void geturl() {

		String currentUrl = driver.getCurrentUrl();
		System.out.println("The URL of the Current Page:" + currentUrl);

	}

	public static void gettext(WebElement element) {

		String text = element.getText();
		System.out.println("The text is:" + text);

	}

	public static void getattribute(WebElement element, String type) {

		if (type.equalsIgnoreCase("text")) {
			element.getAttribute("text");
		}
	}

	public static void waits(String type, int value) throws InterruptedException {

		if (type.equalsIgnoreCase("threadsleep"))
		{
			Thread.sleep(value);
		}
		else if (type.equalsIgnoreCase("implicitwait")) 
		{
			driver.manage().timeouts().implicitlyWait(value, TimeUnit.SECONDS);
		}
	}

	public static void explicit_wait(WebElement element, Duration value, String type) {

		WebDriverWait wb = new WebDriverWait(driver, value);
		if (type.equalsIgnoreCase("element")) 
		{

			wb.until(ExpectedConditions.visibilityOf(element));
		} 
		else if (type.equalsIgnoreCase("alert"))
		{
			wb.until(ExpectedConditions.alertIsPresent());

		}
		else if (type.equalsIgnoreCase("clickable"))
		{
			wb.until(ExpectedConditions.elementToBeClickable(element));
		}
	}

	public static void screenshot(WebElement element, String type) throws IOException {

		if (type.equalsIgnoreCase("whole")) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
			File ff = new File("C:\\Users\\DELL\\eclipse-workspace\\Maven_Projects\\ScreenShot.sample.png");
			FileUtils.copyFile(screenshotAs, ff);
		} else if (type.equalsIgnoreCase("partial")) {

			TakesScreenshot ts = (TakesScreenshot) driver;
			File screenshot = element.getScreenshotAs(OutputType.FILE);
			File tt = new File("C:\\Users\\DELL\\eclipse-workspace\\Maven_Projects\\ScreenShot.sample1.png");
			FileHandler.copy(screenshot, tt);

		}
	}

	public static void scroll(String type, int value) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,value)", "");

	}

	public static void scroll_down() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,document.body.scrollHeight)", "");
	}

	public static void scroll_element(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argumtne[0].scrollIntoView", element);
	}

	public static void first_selected(WebElement element) {

		Select ss = new Select(element);
		WebElement fs = ss.getFirstSelectedOption();
		System.out.println("First Selected Optio is:" + fs);
	}

	public static void allSelected(WebElement element) {

		Select ss = new Select(element);
		List<WebElement> all = ss.getAllSelectedOptions();
		for (WebElement a : all) {

			String text = a.getText();
			System.out.println("All Selected Options:" + text);
		}

	}

	public static void isMultiple(WebElement element) {

		Select ss = new Select(element);
		ss.isMultiple();
	}

}
