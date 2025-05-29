package Selenium_Project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data4 {

	public static void main(String[] args) throws Exception {
		FileInputStream fio=new FileInputStream("C:\\\\Users\\\\user\\\\Desktop\\\\Data.xlsx");
		
		XSSFWorkbook wbo=new XSSFWorkbook(fio);
		
		XSSFSheet wso=wbo.getSheet("Sheet1");
		
		Row r = null;
		
		for(int i=0;i<10;i++)
		
		r=wso.getRow(i);
		
		r.createCell(0).setCellValue("Manual Testing");
		
		System.out.println("Success");
		
		FileOutputStream fo=new FileOutputStream("C:\\\\Users\\\\user\\\\Desktop\\\\Data.xlsx");
		
		wbo.write(fo);
		

	}

}
