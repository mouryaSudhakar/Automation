import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Sudha {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InvalidFormatException {
		
FileInputStream file=new FileInputStream("C:\\Users\\Sudhakar.Mourya\\eclipse-workspace\\Mumbai\\src\\Excel_Data\\sm.xlsx\\");
		
String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		
System.out.println(value);
	
	 }
}
