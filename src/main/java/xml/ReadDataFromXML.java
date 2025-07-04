package xml;

import java.nio.file.Paths;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import models.LoginDetails;

public class ReadDataFromXML {

	public LoginDetails getLoginDetailsData(String jsonFilePath) {

		try {
			XmlMapper xmlMapper = new XmlMapper();
			LoginDetails loginDetails = xmlMapper.readValue(Paths.get(jsonFilePath).toFile(), LoginDetails.class);
			return loginDetails;
		} catch (Exception e) {
			System.out.println("Exception occured while reading the data from MXL: " + e.getMessage());
			return null;
		}

	}

}
