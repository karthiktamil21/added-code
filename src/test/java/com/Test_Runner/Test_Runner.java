package com.Test_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src\\test\\resources\\Features" ,
		glue = "com.Step_defination",
		dryRun= false
		)

public class Test_Runner {
	
	

}
