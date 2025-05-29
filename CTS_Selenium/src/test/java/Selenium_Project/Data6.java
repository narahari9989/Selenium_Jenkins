package Selenium_Project;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data6 {

	public static void main(String[] args) throws Exception {
		FileInputStream fio=new FileInputStream("C:\\\\Users\\\\user\\\\Desktop\\\\Data.xlsx");
		
		
		XSSFWorkbook wbo=new XSSFWorkbook(fio);
		XSSFSheet wso=wbo.getSheet("Sheet1");
		
		Row r = null;
		
		int rowc=wso.getLastRowNum();
		for(int i=0;i<=rowc;i++)
			r=wso.getRow(i);
		
		String data=r.getCell(0).getStringCellValue();
		
		System.out.println(data);
		
		FileOutputStream fo=new FileOutputStream("C:\\\\Users\\\\user\\\\Desktop\\\\Data.xlsx");
		
		//wbo.write(fo);
		
		
		

	}

}
