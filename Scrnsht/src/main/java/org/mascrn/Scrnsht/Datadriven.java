package org.mascrn.Scrnsht;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Datadriven {
	public static String cellValue;
	public static void main(String[] args) throws Exception {
		
			File f=new File("C:\\Users\\User\\eclipse-workspace\\Scrnsht\\Excelworkbook\\Book2.xlsx");
			FileInputStream fis=new FileInputStream(f);
			Workbook wb=new XSSFWorkbook(fis);
			Sheet sheetAt = wb.getSheetAt(0);
			System.out.println("Last row number:"+sheetAt.getLastRowNum());
			System.out.println("physical num of rows"+sheetAt.getPhysicalNumberOfRows());
			for(int i=0;i<sheetAt.getPhysicalNumberOfRows();i++) {
				Row r = sheetAt.getRow(i);
				for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
					Cell cell = r.getCell(j);
					CellType cellType = cell.getCellType();
					if(cellType.equals(CellType.STRING)) {
						 cellValue = cell.getStringCellValue();
						
					}
					else if(cellType.equals(CellType.NUMERIC)) {
						double numericCellValue = cell.getNumericCellValue();
						long value=(long) numericCellValue;
						 cellValue = String.valueOf(value);
					}
					
					System.out.println(cellValue);
					
				}
			}
		


	    //Sheet createSheet = wb.createSheet("data");
		Row createRow = sheetAt.createRow(20);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("aaab");
		
		Cell createCell1 = createRow.createCell(1);
		createCell1.setCellValue("1111");
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		System.out.println("wrote successfully");
		
		
	}

}
