package filestest;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import json.ReadDataFromJson;
import models.UserCredentials;

public class ReadDataFromJsonFileTestCases {

	ReadDataFromJson jsonLogic = new ReadDataFromJson();

	@Test
	@Ignore
	public void verifyJsonDataUsingJsonParser() {

		String jsonFIlePath = System.getProperty("user.dir") + "//src//test//resources//Test.json";
		JSONObject jsonData = jsonLogic.getDataFromJson(jsonFIlePath);

		Assert.assertNotNull(jsonData.get("userName"));
		Assert.assertEquals("ABC123", jsonData.get("userName"));
		Assert.assertNotNull(jsonData.get("password"));
		Assert.assertEquals("123ABC", jsonData.get("password"));
	}

	@Test
	@Ignore
	public void verifyJsonDataUsingObjectMapper() {

		String jsonFIlePath = System.getProperty("user.dir") + "//src//test//resources//Test.json";
		JSONObject jsonData = jsonLogic.getDataFromJsonUsingObjetMapper(jsonFIlePath);

		Assert.assertNotNull(jsonData.get("userName"));
		Assert.assertEquals("ABC123", jsonData.get("userName"));
		Assert.assertNotNull(jsonData.get("password"));
		Assert.assertEquals("123ABC", jsonData.get("password"));
	}

	@Test
	public void verifyUserCredentialsData() {

		String jsonFIlePath = System.getProperty("user.dir") + "//src//test//resources//UserCredentials.json";
		UserCredentials userCredentials = jsonLogic.getUserCredentialsData(jsonFIlePath);

		Assert.assertNotNull(userCredentials.getUserName());
		Assert.assertEquals("User123", userCredentials.getUserName());
		Assert.assertNotNull(userCredentials.getPassword());
		Assert.assertEquals("Password123", userCredentials.getPassword());
	}

}
