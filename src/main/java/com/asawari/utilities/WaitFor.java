package com.asawari.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.asawari.base.TestBase;

public class WaitFor {
	
	private static FluentWait<WebDriver>wait;
	
	static {
		wait = new FluentWait<WebDriver>(TestBase.driver);
		wait.withTimeout(Duration.ofSeconds(60));
	}
	public static void staleElement(WebElement element) {
		wait.until(ExpectedConditions.stalenessOf(element));

	}

}
