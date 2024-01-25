package New_Maven.Maven_Projects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven_Read4 {

	public static void read() throws IOException {

		File ff = new File("C:\\Users\\DELL\\OneDrive\\Desktop\\DataDriven1.xlsx");
		FileInputStream fis = new FileInputStream(ff);
		Workbook book = new XSSFWorkbook(fis);

		Sheet sheet = book.getSheet("Students");
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(3);
		String data = cell.getStringCellValue();

		if (data.equalsIgnoreCase("outstanding")) {

			Row row2 = sheet.getRow(2);
			for (int i = 0; i <= 3; i++) {

				Cell cell2 = row2.getCell(i);
				String a = cell2.getStringCellValue();
				System.out.print(a);
				System.out.print(" ");
			}
		} else {

			System.out.println("The Student Behaviour is not Outstanding");

		}
	}

	public static void main(String[] args) throws IOException {

		read();
	}

}
