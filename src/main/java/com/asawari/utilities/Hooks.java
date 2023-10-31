package com.asawari.utilities;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.asawari.base.Keyword;

import com.asawari.base.TestBase;
import com.asawari.config.Configuration;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	RemoteWebDriver driver;
	@Before
	public void setUp() {
		Configuration config = new Configuration();
		
		Keyword keyword = new Keyword();
		keyword.openBowser(config.getBrowserName());
		

	}
	
	@After
	public void tearDown() {
		
		driver= TestBase.getDriver();
	     driver.quit();

	}

}
