package org.capgemini.plm;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class CloneExcel {

	public static void main(String[] args) {
		
		
//		List<String> l1 = new ArrayList<String>();
//		l1.add("R1000");
//		l1.add("1290KTM");
//		l1.add("BMW1000RR");
//		l1.add("Panigale998");
//		l1.add("ApriliaRSV4-RF");
//		l1.add("Multistrada");
//		
//		for(int i=0; i<l1.size(); i++) {
//			
//		}
//		
//		if(f1.renameTo(f2)) {
//			System.out.println("File renamed successfully!");
//		}
//		else {
//			System.out.println("Rename failed!");
//		}
		
		File f1 = new File("C:\\Users\\ABHISHEK R\\Desktop\\New\\Clone\\AgustaMVF3.txt");
		File f2 = new File("C:\\Users\\ABHISHEK R\\Desktop\\New\\Clone\\BMW1000R.txt");
		
		File fOrig = new File("C:\\Users\\ABHISHEK R\\Desktop\\New\\Clone\\BMW1000R");
		
		File folder = new File("C:\\Users\\ABHISHEK R\\Desktop\\New\\Clone\\");
		File[] listOfFiles = folder.listFiles();

		for (File file : listOfFiles) {
		    if (file.isFile()) {
		        System.out.println(file.getName());
		        
		        if(file.getName().contains("1000")) {
//		        	System.out.println("BMW??");
		        	f1.renameTo(f2);
		        }
		    }
		}
		
		File fNew = new File("C:\\Users\\ABHISHEK R\\Desktop\\New\\Clone\\BMW1000R.txt");
		
		try {
			Files.copy(fOrig.toPath(), fNew.toPath());
		}
		catch(IOException ie) {
			ie.printStackTrace();
		}
		
	}
}
