package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel 
{
static FileInputStream f;
static XSSFWorkbook w;
static XSSFSheet sh;


public static String readstringmethod(int i, int j) throws IOException
{
	f = new FileInputStream("C:\\Users\\SREELAKSHMI\\Desktop\\maven.xlsx");
	w = new XSSFWorkbook(f);
	sh= w.getSheet("Sheet1");
	Row r = sh.getRow(i);
	Cell c = r.getCell(j);
	return c.getStringCellValue();
}
public static String readintegermethod(int i,int j) throws IOException
{
	f = new FileInputStream("C:\\Users\\SREELAKSHMI\\Desktop\\maven.xlsx");
	w = new XSSFWorkbook(f);
	sh= w.getSheet("Sheet1");
	Row r = sh.getRow(i);
	Cell c = r.getCell(j);
	int a = (int) c.getNumericCellValue();
	return String.valueOf(a);
	
}
}



