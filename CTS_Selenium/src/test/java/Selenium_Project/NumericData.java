package Selenium_Project;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NumericData {

	public static void main(String[] args) throws IOException {
		FileInputStream fio=new FileInputStream("C:\\\\Users\\\\user\\\\Desktop\\\\Data.xlsx");
		
		XSSFWorkbook wbo=new XSSFWorkbook(fio);
		
		
		XSSFSheet wso=wbo.getSheet("Sheet1");
		
		
		Row r;
		
		r=wso.getRow(9);
		
		int data=(int) r.getCell(0).getNumericCellValue();
		
		System.out.println(data);
		
		

	}

}
