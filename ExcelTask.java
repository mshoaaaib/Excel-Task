package excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTask {

	public static void main(String[] args) throws Exception {
		
		XSSFWorkbook workbook1=new XSSFWorkbook();
		XSSFSheet sheet1=workbook1.createSheet("Computer Details");
		
		sheet1.createRow(0).createCell(1).setCellValue("Name");
		sheet1.getRow(0).createCell(2).setCellValue("University");
		sheet1.createRow(1).createCell(1).setCellValue("Shoaib");
		sheet1.getRow(1).createCell(2).setCellValue("NUST");
		sheet1.createRow(2).createCell(1).setCellValue("Amir");
		sheet1.getRow(2).createCell(2).setCellValue("UET");
//		sheet1.getRow(0).getCell(1).setCellValue("Shoaib");
//		sheet1.getRow(0).getCell(2).setCellValue("NUST");
//		sheet1.getRow(Row).createCell(Col+1).setCellValue(price);
//		sheet1.getRow(Row).createCell(Col+2).setCellValue(description);
		File fil=new File("C:\\Users\\muham\\eclipse-workspace\\Exceltask\\Excel Task.xlsx");
		FileOutputStream fos=new FileOutputStream(fil);
		workbook1.write(fos);
		
		

	}

}
