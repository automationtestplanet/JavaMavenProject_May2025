package excel;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public List<Map<String, String>> getDataFromExcel(String excelFilePath, String sheetName) {
		try {

			List<Map<String, String>> dataFromExcel = new LinkedList<Map<String, String>>();
			
			File excelFile = new File(excelFilePath);

			FileInputStream fis = new FileInputStream(excelFile);

			XSSFWorkbook xlsxWorkBook = new XSSFWorkbook(fis);
			XSSFSheet languagesSheet = xlsxWorkBook.getSheet(sheetName);

			List<String> allHeaders = getHeaderNames(languagesSheet);

			for (int i = 1; i < languagesSheet.getLastRowNum(); i++) {
				Row eachRow = languagesSheet.getRow(i);

				Map<String, String> eachMap = new LinkedHashMap<String, String>();

				eachMap.put(allHeaders.get(0), eachRow.getCell(0).getStringCellValue());

				eachMap.put(allHeaders.get(1), eachRow.getCell(1).getStringCellValue());
				dataFromExcel.add(eachMap);
			}

			fis.close();
			return dataFromExcel;
		} catch (Exception e) {
			System.out.println("Exception occured while reading the data from excel: " + e.getMessage());
			return null;
		}
	}

	public List<String> getHeaderNames(XSSFSheet sheetName) {

		List<String> headersList = new ArrayList<>();

		Row firstRow = sheetName.getRow(0);

		Iterator<Cell> allCells = firstRow.cellIterator();

		while (allCells.hasNext()) {
			Cell eachChell = allCells.next();

			headersList.add(eachChell.getStringCellValue());
		}

		return headersList;
	}

}
