package com.akshay.automation.config;

import java.io.FileReader;
import java.util.Properties;

public class ConfigProperties {

	private Properties properties;
	private String loginPropFilePath = "src/test/resources/Locators/login.properties";

	public Properties readFile() throws Exception {
		FileReader reader=new FileReader(loginPropFilePath);
		properties=new Properties();
		properties.load(reader);
		return properties;
	}
	
}
