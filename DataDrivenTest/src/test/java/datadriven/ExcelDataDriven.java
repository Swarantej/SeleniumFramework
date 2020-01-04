package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataDriven {
	
	
	
public ArrayList<String> getData(String testCaseName) throws IOException {
	
	ArrayList<String> al = new ArrayList<String>();
	FileInputStream file = new FileInputStream("C:\\Users\\Swaran\\Selenium\\TestData\\testdata.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	int numOfWorksheets = workbook.getNumberOfSheets();
	for(int i=0; i<numOfWorksheets;i++) {
		if(workbook.getSheetName(i).equals("Data")){
			XSSFSheet sheet = workbook.getSheetAt(i);
			//Identify the testcase Name column by scanning entire1st row/header
			Iterator<Row> rows =sheet.iterator(); //Sheet is collection of rows 
			Row firstRow = rows.next();
			Iterator<Cell> cell = firstRow.cellIterator();
			int j= 0;
			int column = 0;
			while(cell.hasNext()) {
				Cell cellValue = cell.next();
				if(cellValue.getStringCellValue().equalsIgnoreCase("TestCaseName")) {
					column = j;
				}
				j++;
			}
			System.out.println(column);
			
			//Once the TestCaseName column is identified , now scan the column for the testcase we want to execute
			while(rows.hasNext()) {
				Row rw  =rows.next();
				if(rw.getCell(column).getStringCellValue().equalsIgnoreCase(testCaseName)) {
					//After you identify the testcase row in TestCaseName column, now scan the entire row for testdata 
					Iterator<Cell> testCaseCellValues = rw.cellIterator();
					while(testCaseCellValues.hasNext()) {
						Cell cellData = testCaseCellValues.next();
						
						//Including this code since we have declared ArrayList as String type, below code will conver Int to String
						if(cellData.getCellType()==CellType.STRING) {
							String dataValues = cellData.getStringCellValue();
							al.add(dataValues);
						}else {
							double intData = cellData.getNumericCellValue();
							al.add(NumberToTextConverter.toText(intData));
						}
						
						//Beelow code can be used if there are no integer Values in Data sheet
						//String dataValues = cellData.getStringCellValue();
						//al.add(dataValues);
						
					}
				}
				
			}
			
		}
	}
	return al;

}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelDataDriven data = new ExcelDataDriven();
		ArrayList<String> d1=data.getData("SignIn");
		ArrayList<String> d2 =data.getData("Validate");
		ArrayList<String> d3 =data.getData("SignOut");
		System.out.println("@@@@@@#######@@@@@@");
		System.out.println(d1.get(0));
	
		System.out.println(d1.get(1));
		
		System.out.println(d1.get(2));
		System.out.println(d1.get(3));
		
		// 2nd row data
		System.out.println("@@@@@@#######@@@@@@");
		System.out.println(d2.get(0));
	
		System.out.println(d2.get(1));
		
		System.out.println(d2.get(2));
		System.out.println(d2.get(3));
		
		// 3rd row data
		System.out.println("@@@@@@#######@@@@@@");
		System.out.println(d3.get(0));
			
		System.out.println(d3.get(1));
				
		System.out.println(d3.get(2));
		System.out.println(d3.get(3));
		
}

	}