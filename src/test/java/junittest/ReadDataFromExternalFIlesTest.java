package junittest;

import java.util.List;
import java.util.Map;

import excel.ReadDataFromExcel;

public class ReadDataFromExternalFIlesTest {

	public static void main(String[] args) throws Exception {
//		String filePath = "E:\\TESTING\\SELENIUM\\SeleniumJavaRestAssuredMay2025\\Eclipse\\CoreJavaMavenProject\\src\\main\\resources\\Test.xlsx";

		String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\Test.xlsx";

		ReadDataFromExcel readExcel = new ReadDataFromExcel();
		List<Map<String, String>> excelData = readExcel.getDataFromExcel(filePath, "Languages");
		if (!(excelData == null)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

	}

}
