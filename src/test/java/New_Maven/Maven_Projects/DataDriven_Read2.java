package New_Maven.Maven_Projects;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven_Read2 {

	public static void read() throws IOException {

		File ff = new File("C:\\Users\\DELL\\OneDrive\\Desktop\\DataDriven1.xlsx");
		FileInputStream fis = new FileInputStream(ff);
		Workbook book = new XSSFWorkbook(fis);

		Sheet sheet = book.getSheet("Students");

		for (int i = 0; i <= 4; i++) {

			Row row = sheet.getRow(i);

			for (int j = 0; j <= 3; j++) {

				Cell cell = row.getCell(j);
				String datas = cell.getStringCellValue();
				System.out.print(datas);
				System.out.print(" ");

			}
			System.out.println("");
			System.out.println("");

		}
}
	
	public static void main(String[] args) throws IOException {
		
		read();
	}

}
