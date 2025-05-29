package Selenium_Project;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data3 {

	public static void main(String[] args) throws IOException {
		FileInputStream fio=new FileInputStream("C:\\\\Users\\\\user\\\\Desktop\\\\Data.xlsx");
		
		XSSFWorkbook wbo=new XSSFWorkbook(fio);
		
		XSSFSheet wso=wbo.getSheet("Sheet1");
		
		Row r;
		r=wso.getRow(1);
		r.createCell(1).setCellValue("Java");
		
		System.out.println("Pass");
		
		FileOutputStream fo=new FileOutputStream("C:\\\\Users\\\\user\\\\Desktop\\\\Data.xlsx");
		
		wbo.write(fo);
		

	}

}
