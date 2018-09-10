package org.capgemini.plm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class Assignment_1 {
	public static void main(String[] args) throws IOException, FileNotFoundException{
		String excelFilePath = "C:\\Users\\ABHISHEK R\\Desktop\\Assignment1.xlsx";
		FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		Sheet firstSheet = workbook.getSheetAt(0);
		
		Iterator<Row> rowIterator = firstSheet.iterator();
		while(rowIterator.hasNext()){
			Row nRow = rowIterator.next();
			Iterator<Cell> cellIterator = nRow.cellIterator();
			
			while(cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				System.out.println(cell);
				
			}
		}
	}
}