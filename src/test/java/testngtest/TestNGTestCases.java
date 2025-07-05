package testngtest;

import java.util.Map;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGTestCases extends TestNGClass {

	@Test(priority = 0, groups = { "SmokeTest", "SanityTest",
			"RegressionTest" }, dependsOnMethods = "testLoginApplication")
	public synchronized void test3() {
		System.out.println("				This is TestNG Test Method3");
	}

	@Test(priority = 1, groups = { "SanityTest", "RegressionTest" }, invocationCount = 5, enabled = false)
	public synchronized void test1() {
		System.out.println("				This is TestNG Test Method1");
	}

	@Test(priority = 2, groups = { "RegressionTest" })
	public synchronized void test2() {
		System.out.println("				This is TestNG Test Method2");
	}

	@Test(priority = 0, groups = { "SmokeTest", "SanityTest", "RegressionTest" })
	@Parameters({ "BrowserName", "UserName", "Passowrd" })
	public synchronized void testLoginApplication(String browserName, String userName, String password) {
		System.out.println("				This is TestNG Test loginApplication method");
		System.out.println(" 				" + browserName);
		System.out.println(" 				" + userName);
		System.out.println(" 				" + password);
	}

	@Test(priority = 0, groups = { "SmokeTest", "SanityTest", "RegressionTest" }, dataProvider = "TestData1")
	public synchronized void dataDrivenTest1(String eachData) {
		System.out.println("				This is TestNG DataDrivenTest1 method: " + eachData);

	}

	@Test(priority = 0, groups = { "SmokeTest", "SanityTest", "RegressionTest" }, dataProvider = "TestData2")
	public synchronized void dataDrivenTest2(Object[] objArr) {
		System.out.println("				This is TestNG DataDrivenTest2 method: " + objArr[0]);
		System.out.println("				This is TestNG DataDrivenTest2 method: " + objArr[1]);
		System.out.println("				This is TestNG DataDrivenTest2 method: " + objArr[2]);

	}

	@Test(priority = 0, groups = { "SmokeTest", "SanityTest", "RegressionTest" }, dataProvider = "TestData3")
	public synchronized void dataDrivenTest3(String str) {
		System.out.println("				This is TestNG DataDrivenTest3 method: " + str);

	}

	@Test(priority = 0, groups = { "SmokeTest", "SanityTest", "RegressionTest" }, dataProvider = "TestData4")
	public synchronized void loginTestWithDifferentUsers(Map<String, String> userCredentialsData) {
		System.out.println("				UserName: " + userCredentialsData.get("UserName"));
		System.out.println("				Password: " + userCredentialsData.get("Password"));

	}

}
