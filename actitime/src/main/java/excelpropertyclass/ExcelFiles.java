package excelpropertyclass;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFiles {


	
	
	
	
	public static String Stringdata(int a, int b) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("src\\test\\resources\\excelsheet\\hello.xlsx");
		Workbook ref = WorkbookFactory.create(file);
		
		String data = ref.getSheet("Sheet3").getRow(a).getCell(b).getStringCellValue();
		return data;
		
		
	}
	
	
	
	
}
