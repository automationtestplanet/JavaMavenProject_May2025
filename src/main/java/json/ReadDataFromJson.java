package json;

import java.io.File;
import java.io.FileReader;
import java.nio.file.Paths;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.fasterxml.jackson.databind.ObjectMapper;

import models.UserCredentials;

public class ReadDataFromJson {

	public JSONObject getDataFromJson(String jsonFilePath) {

		try {
			JSONParser jParser = new JSONParser();
			JSONObject jsonObj = (JSONObject) jParser.parse(new FileReader(new File(jsonFilePath)));
			return jsonObj;
		} catch (Exception e) {
			System.out.println("Exception occured while reading the data from JSON: " + e.getMessage());
			return null;
		}

	}

	public JSONObject getDataFromJsonUsingObjetMapper(String jsonFilePath) {

		try {
			ObjectMapper objMapper = new ObjectMapper();
			JSONObject jsonObj = objMapper.readValue(Paths.get(jsonFilePath).toFile(), JSONObject.class);
			return jsonObj;
		} catch (Exception e) {
			System.out.println("Exception occured while reading the data from JSON: " + e.getMessage());
			return null;
		}

	}
	
	
	public UserCredentials getUserCredentialsData(String jsonFilePath) {

		try {
			ObjectMapper objMapper = new ObjectMapper();
			UserCredentials userCredentials = objMapper.readValue(Paths.get(jsonFilePath).toFile(), UserCredentials.class);
			return userCredentials;
		} catch (Exception e) {
			System.out.println("Exception occured while reading the data from JSON: " + e.getMessage());
			return null;
		}

	}

}
