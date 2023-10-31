package com.asawari.config;

import com.asawari.utilities.FileUtil;

public class Configuration {

	public String getAppUrl(String env) {

		FileUtil file = new FileUtil();
		return file.getProperty("/src/main/resources/config.properties", "app.dev.url");
	}

	public String getBrowserName() {

		FileUtil file = new FileUtil();
		return file.getConfiguration("browser_name");

	}

}
