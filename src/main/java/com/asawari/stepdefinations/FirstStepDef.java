package com.asawari.stepdefinations;

import com.asawari.base.Keyword;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class FirstStepDef {
	
	Keyword keyword = new Keyword();
	
	@Given("Say hello to everyone")
	public void m1() {
		
		
		keyword.openBowser("Chrome");
		System.out.println("Hello Cucumber");
		System.out.println("How are you");
	}
	
	@When("Open browser")
	public void launchAppUrl() {
		keyword.launchUrl("https://www.myntra.com");

	}
		

	}


