package org.capgemini.plm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;

public class Assignment_1 
{
	private static int fv;
	private static int sv;
	private static int res;
	
	public static void main(String[] args)
	{	
		try 
		{
		String filePath = "D:\\Users\\ar24\\Desktop\\Assignment1.xlsx";
		FileInputStream inputStream = new FileInputStream(new File(filePath));
		Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet firstSheet = workbook.getSheetAt(0);
        
        Iterator<Row> riterator = firstSheet.iterator();
        while (riterator.hasNext())
        {
        	Row nRow = riterator.next();

            Iterator<Cell> cellIterator = nRow.cellIterator();          
            while(cellIterator.hasNext())
            {
            Cell cell = cellIterator.next();
            System.out.println(cell);
            
            }     
         }
        System.out.println("Exiting the while loop");
       
        
        for(int i = 1; i < 4; i++) 
        {
        	fv = (int)firstSheet.getRow(i).getCell(0).getNumericCellValue();
        	sv = (int)firstSheet.getRow(i).getCell(1).getNumericCellValue();
        	
        	String sign = firstSheet.getRow(i).getCell(2).getStringCellValue();
        	
        	Cell cell = null;
        	switch(sign)
        	{
        	case "+":
        	{
        		System.out.println("Add");
        		res = fv + sv;
        		System.out.println(res);
        		Row row = firstSheet.getRow(i);
    	        row.createCell(3).setCellValue(res);
    	        break;
        	}
        		
        	case "*":
        	{
        		System.out.println("Multiply");
        		res = fv * sv;
        		System.out.println(res);
        		Row row = firstSheet.getRow(i);
        	
    	        row.createCell(3).setCellValue(res);
    	        break;
        	}
        	
        	case "-":
        	{
        		System.out.println("Subtract");
        		res = fv - sv;
        		System.out.println(res);
        		Row row = firstSheet.getRow(i);
        		
    	        row.createCell(3).setCellValue(res);
    	        break;
        	}
        	}
        }
        
        inputStream.close();
        
        
        
        FileOutputStream fout = new FileOutputStream(new File(filePath));
        workbook.write(fout);
        fout.close();
        System.out.println("The Result has been successfully calculated!");
        
       
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
