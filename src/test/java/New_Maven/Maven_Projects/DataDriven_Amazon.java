package New_Maven.Maven_Projects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DataDriven_Amazon extends BaseClass {

	public static void mobiles() throws InterruptedException, IOException {

		browser_Launch("chrome");
		url("https://www.amazon.in/");

		driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_mobiles']")).click();

		waits("threadsleep", 3000);

		WebElement element = driver.findElement(By.xpath("(//span[@dir='auto'])[8]"));
		click(element);

		WebElement a = driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[1]"));
		waits("threadsleep", 3000);
		String A = a.getText();

		WebElement b = driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[2]"));
		String B = b.getText();

		WebElement c = driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[3]"));
		String C = c.getText();
		

		WebElement d = driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[4]"));
		String D = d.getText();

		WebElement e = driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[5]"));
		String E = e.getText();
		
		waits("threadsleep", 3000);

		WebElement f = driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[6]"));
		String F = f.getText();

		WebElement g = driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[7]"));
		String G = g.getText();

		WebElement h = driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[8]"));
		String H = h.getText();

		WebElement i = driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[9]"));
		String I = i.getText();

		WebElement j = driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[10]"));
		String J = j.getText();

		WebElement k = driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[11]"));
		String K = k.getText();

		WebElement l = driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[12]"));
		String L = l.getText();

		WebElement m = driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[13]"));
		String M = m.getText();

		WebElement n = driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[14]"));
		String N = n.getText();

		WebElement o = driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[15]"));
		String O = o.getText();

		WebElement p = driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[16]"));
		String P = p.getText();

		WebElement q = driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[17]"));
		String Q = q.getText();

		WebElement r = driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[18]"));
		String R = r.getText();

		WebElement s = driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[19]"));
		String S = s.getText();

		WebElement t = driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[20]"));
		String T = t.getText();

		WebElement u = driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[21]"));
		String U = u.getText();

		WebElement v = driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[22]"));
		String V = v.getText();

		WebElement w = driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[23]"));
		String W = w.getText();

		WebElement x = driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[24]"));
		String X = x.getText();

		WebElement y = driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[25]"));
		String Y = y.getText();

		waits("threadsleep", 3000);

				
		File ff = new File("C:\\Users\\DELL\\OneDrive\\Desktop\\Amazon2.xlsx");
		FileInputStream fis = new FileInputStream(ff);
		Workbook book = new XSSFWorkbook(fis);

		Sheet sheet = book.createSheet("amazon");
		sheet.createRow(0).createCell(0).setCellValue(A);
		sheet.createRow(1).createCell(0).setCellValue(B);
		sheet.createRow(2).createCell(0).setCellValue(C);
		sheet.createRow(3).createCell(0).setCellValue(D);
		sheet.createRow(4).createCell(0).setCellValue(E);
		sheet.createRow(5).createCell(0).setCellValue(F);
		sheet.createRow(6).createCell(0).setCellValue(G);
		sheet.createRow(7).createCell(0).setCellValue(H);
		sheet.createRow(8).createCell(0).setCellValue(I);
		sheet.createRow(9).createCell(0).setCellValue(J);
		sheet.createRow(10).createCell(0).setCellValue(K);
		sheet.createRow(11).createCell(0).setCellValue(L);
		sheet.createRow(12).createCell(0).setCellValue(M);
		sheet.createRow(13).createCell(0).setCellValue(N);
		sheet.createRow(14).createCell(0).setCellValue(O);
		sheet.createRow(15).createCell(0).setCellValue(P);
		sheet.createRow(16).createCell(0).setCellValue(Q);
		sheet.createRow(17).createCell(0).setCellValue(R);
		sheet.createRow(18).createCell(0).setCellValue(S);
		sheet.createRow(19).createCell(0).setCellValue(T);
		sheet.createRow(20).createCell(0).setCellValue(U);
		sheet.createRow(21).createCell(0).setCellValue(V);
		sheet.createRow(22).createCell(0).setCellValue(W);
		sheet.createRow(23).createCell(0).setCellValue(X);
		sheet.createRow(24).createCell(0).setCellValue(Y);

		FileOutputStream fos = new FileOutputStream(ff);
		book.write(fos);

		System.out.println("Done");

	}

	public static void main(String[] args) throws InterruptedException, IOException {

		mobiles();
	}

}
