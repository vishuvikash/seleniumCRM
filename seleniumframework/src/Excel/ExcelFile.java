package Excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFile {
	@SuppressWarnings({ "deprecation", "rawtypes", "resource", "unchecked" })
	public static void main(String[] args) throws IOException {
		  ArrayList a = new ArrayList();
		FileInputStream f = new FileInputStream("D:\\LeadSuit1.xlsx");
		XSSFWorkbook wbook = new XSSFWorkbook(f);
		Sheet s = wbook.getSheet("Sheet1");
		
		Iterator<Row> itr = s.iterator();
			
			while(itr.hasNext()){
				Row rowitr = (Row)itr.next();
				Iterator cellitr = rowitr.cellIterator();
					while(cellitr.hasNext()){
						Cell cell =(Cell)cellitr.next();
						
						switch (cell.getCellType()){
						case Cell.CELL_TYPE_STRING:
							a.add(cell.getStringCellValue());
							break;
						case Cell.CELL_TYPE_NUMERIC:
							a.add(cell.getNumericCellValue());
							break;
						case Cell.CELL_TYPE_BOOLEAN:
							a.add(cell.getBooleanCellValue());
							break;
									                }
											}
								}
			for(int i = 0; i<a.size(); i++){
				if(a.get(i).equals("openbrowser")){
					System.out.println(a.get(i));
					System.out.println(a.get(i+1));
					System.out.println(a.get(i+2));
					System.out.println(a.get(i+3));
												 }
										  }

	}

}
