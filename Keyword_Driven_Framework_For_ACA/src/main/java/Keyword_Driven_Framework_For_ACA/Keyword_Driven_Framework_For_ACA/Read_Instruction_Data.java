package Keyword_Driven_Framework_For_ACA.Keyword_Driven_Framework_For_ACA;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.text.html.HTMLDocument.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Instruction_Data {

	public ArrayList Read_Instruction_Data(int colNo) throws IOException {
		
		String filePath = FrameworkConstants.filepath;
		File file = new File(filePath);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		java.util.Iterator<Row> row = sheet.rowIterator();
		row.next();
		
		ArrayList <String> a = new ArrayList();
		while(row.hasNext())
		{
			Row r = (Row)row.next();
			Cell c = r.getCell(colNo);
			String data = c.getStringCellValue();
			a.add(data);
			a.add(((Row)row.next()).getCell(colNo).getStringCellValue());			
		}
		System.out.println("List: " + a);
		return a;
	}
	
	public void Demofile(int i) {
		
	}
}
