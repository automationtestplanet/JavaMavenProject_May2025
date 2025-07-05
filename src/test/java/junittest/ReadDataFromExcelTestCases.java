package junittest;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import excel.ReadDataFromExcel;

public class ReadDataFromExcelTestCases {
	
	ReadDataFromExcel excelLogic = new ReadDataFromExcel();
	
	@Test @Ignore
	public void getDataFromExcelWithValidFile() {		
		String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\Test.xlsx";
		List<Map<String, String>> excelData = excelLogic.getDataFromExcel(filePath, "Languages");
		Assert.assertEquals(true, !(excelData == null));
		Assert.assertTrue(!(excelData == null));
		Assert.assertNotNull(excelData);
	}
	
	@Test @Ignore
	public void getDatFromExcelWithInvalidFile() {
		String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\Test1.xlsx";
		List<Map<String, String>> excelData = excelLogic.getDataFromExcel(filePath, "Languages");
		Assert.assertEquals(false, !(excelData == null));
		Assert.assertTrue(excelData == null);
		Assert.assertNull(excelData);
	}
	
	@Test
	public void verifyTypeOfLanguage() {		
		String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\Test.xlsx";
		List<Map<String, String>> excelData = excelLogic.getDataFromExcel(filePath, "Languages");
		Assert.assertNotNull(excelData);
		
		String actualValue = excelData.stream()
		.filter(eachMapObj -> eachMapObj.get("Language").equals("Java"))
		.collect(Collectors.toList())
		.get(0)
		.get("TypeOfLanguage");
		
//		Assert.assertTrue(actualValue.equals("Object Based Language"));
		Assert.assertEquals("Object Based Language", actualValue);
		
	}

}
