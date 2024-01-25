package New_Maven.Maven_Projects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_Write {

	public static void write() throws IOException {

		File f = new File("C:\\Users\\DELL\\OneDrive\\Desktop\\DataDriven1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fis);

		book.createSheet("Students").createRow(0).createCell(0).setCellValue("Student Name");
		book.getSheet("Students").getRow(0).createCell(1).setCellValue("Department");
		book.getSheet("Students").getRow(0).createCell(2).setCellValue("Address");
		book.getSheet("Students").getRow(0).createCell(3).setCellValue("Behaviour");
		book.getSheet("Students").createRow(1).createCell(0).setCellValue("Ramesh");
		book.getSheet("Students").getRow(1).createCell(1).setCellValue("Commerce");
		book.getSheet("Students").getRow(1).createCell(2).setCellValue("Valasaravakkam");
		book.getSheet("Students").getRow(1).createCell(3).setCellValue("Excellent");
		book.getSheet("Students").createRow(2).createCell(0).setCellValue("Madhav");
		book.getSheet("Students").getRow(2).createCell(1).setCellValue("Biology");
		book.getSheet("Students").getRow(2).createCell(2).setCellValue("Perambur");
		book.getSheet("Students").getRow(2).createCell(3).setCellValue("Outstanding");
		book.getSheet("Students").createRow(3).createCell(0).setCellValue("Natalie");
		book.getSheet("Students").getRow(3).createCell(1).setCellValue("Physics");
		book.getSheet("Students").getRow(3).createCell(2).setCellValue("Koyambedu");
		book.getSheet("Students").getRow(3).createCell(3).setCellValue("Need Improvement");
		book.getSheet("Students").createRow(4).createCell(0).setCellValue("Brandon");
		book.getSheet("Students").getRow(4).createCell(1).setCellValue("Physcology");
		book.getSheet("Students").getRow(4).createCell(2).setCellValue("Sholinganallur");
		book.getSheet("Students").getRow(4).createCell(3).setCellValue("Poor");

		FileOutputStream fos = new FileOutputStream(f);
		book.write(fos);
		System.out.println("File Has Been Created");

	}

	public static void main(String[] args) throws IOException {

		write();
	}

}
