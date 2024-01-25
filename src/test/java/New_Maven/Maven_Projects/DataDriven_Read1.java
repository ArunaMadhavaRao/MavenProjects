package New_Maven.Maven_Projects;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven_Read1 {
	
	public static void Read() throws IOException {
		
		File ff = new File("C:\\Users\\DELL\\OneDrive\\Desktop\\DataDriven1.xlsx");
		FileInputStream fis = new FileInputStream(ff);
		Workbook book  = new XSSFWorkbook(fis);
		
		Sheet sheet = book.getSheet("Students");
		Row row = sheet.getRow(3);
		Cell cell = row.getCell(2);
		String data = cell.getStringCellValue();
		System.out.println("The Data in the Particular column is: " +data);
		
	}
	
	public static void main(String[] args) throws IOException {
		
		Read();
	}

}
