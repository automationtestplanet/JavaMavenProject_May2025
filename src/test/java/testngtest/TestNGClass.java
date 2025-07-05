package testngtest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGClass {

	@BeforeSuite(alwaysRun = true)
	public void beforeSuite() {
		System.out.println("This is TestNG Before Suit");
	}

	@BeforeTest(alwaysRun = true)
	public void beforeTest() {
		System.out.println("	This is TestNG Before Test");
	}

	@BeforeClass(alwaysRun = true)
	public void beforeClass() {
		System.out.println("		This is TestNG Before Class");
	}

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() {
		System.out.println("			This is TestNG Before Method");
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod() {
		System.out.println("			This is TestNG After Method");
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		System.out.println("		This is TestNG After Class");
	}

	@AfterTest(alwaysRun = true)
	public void afterTest() {
		System.out.println("	This is TestNG AFter Test");
	}

	@AfterSuite(alwaysRun = true)
	public void afterSuite() {
		System.out.println("This is TestNG After Suit");
	}

	@DataProvider(name = "TestData1")
	public Object[] dataDrivenTestData1() {
		Object[] objArr = { "Column1Data", "Column2Data", "Column3Data" };
		return objArr;
	}

	@DataProvider(name = "TestData2")
	public Object[][] dataDrivenTestData2() {
		Object[][] objArr = { { "Column11Data", "Column12Data", "Column13Data" },
				{ "Column14Data", "Column15Data", "Column16Data" },
				{ "Column17Data", "Column18Data", "Column19Data" } };

		return objArr;
	}

	@DataProvider(name = "TestData3")
	public Iterator<String> dataDrivenTestData3() {
		List<String> list1 = new ArrayList<>();
		list1.add("Column101Data");
		list1.add("Column102Data");
		list1.add("Column102Data");

		return list1.iterator();
	}

	@DataProvider(name = "TestData4")
	public Iterator<Map<String, String>> dataDrivenTestData4() {
		List<Map<String, String>> list1 = new ArrayList<>();

		Map<String, String> map1 = new HashMap<>();
		map1.put("UserName", "Abc123");
		map1.put("Password", "Abc321");

		Map<String, String> map2 = new HashMap<>();
		map2.put("UserName", "Def123");
		map2.put("Password", "Def321");

		Map<String, String> map3 = new HashMap<>();
		map3.put("UserName", "Ghi123");
		map3.put("Password", "Ghi321");

		list1.add(map1);
		list1.add(map2);
		list1.add(map3);

		return list1.iterator();
	}

}
