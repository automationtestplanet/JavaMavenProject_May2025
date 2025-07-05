package junittest;

import org.junit.Assert;
import org.junit.Test;

import models.LoginDetails;
import xml.ReadDataFromXML;

public class ReadDataFromXMLtestCases {

	ReadDataFromXML xmlLogic = new ReadDataFromXML();

	@Test
	public void verifyLoginDetailsFromXML() {
		String xmlFilePath = System.getProperty("user.dir") + "//src//test//resources//LoginDetails.xml";
		LoginDetails loginDetails = xmlLogic.getLoginDetailsData(xmlFilePath);

		Assert.assertNotNull(loginDetails.getLoginUserName());
		Assert.assertEquals("Username1234", loginDetails.getLoginUserName());
		Assert.assertNotNull(loginDetails.getLoginPassword());
		Assert.assertEquals("Password4321", loginDetails.getLoginPassword());
	}

}
