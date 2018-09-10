package org.capgemini.plm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream(new File("Assignment1.xlsx"));
		
		//to create a workbook instance
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		
		//to create a sheet object to retrieve the sheet
		HSSFSheet sheet = wb.getSheetAt(0);
		
		
		
	}
}