package Selenium_Project;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RowsColums {

	public static void main(String[] args) throws IOException {
		FileInputStream fso=new FileInputStream("C:\\Users\\user\\Desktop\\Data.xlsx");
		
		XSSFWorkbook wbo=new XSSFWorkbook(fso);
		
		XSSFSheet wso=wbo.getSheet("Sheet1");
		
		Row r;
		
		r=wso.createRow(1);
		r.createCell(1).setCellValue("Selenium");
		
		System.out.println("data is inserted succ");
		
		FileOutputStream fso1=new FileOutputStream("C:\\\\Users\\\\user\\\\Desktop\\\\Data.xlsx");
		wbo.write(fso1);
		
		
		

	}

}
