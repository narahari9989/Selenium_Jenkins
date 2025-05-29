package Selenium_Project;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Data2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fso=new FileInputStream("C:\\\\Users\\\\user\\\\Desktop\\\\Data.xlsx");
		XSSFWorkbook wbo=new XSSFWorkbook(fso);
		
		XSSFSheet wso=wbo.getSheet("Sheet1");
		
		Row r;
		r=wso.createRow(9);
		r.createCell(0).setCellValue("Dharani");
		System.out.println("Success");
		
		FileOutputStream fo=new FileOutputStream("C:\\\\Users\\\\user\\\\Desktop\\\\Data.xlsx");
		wbo.write(fo);

	}

}
