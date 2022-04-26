package com.Step_defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Step_Defination {
	public static WebDriver driver;

	@Given("user launch the Facebook Application")
	public void user_launch_the_facebook_application() {

		WebDriverManager.chromedriver().setup();

		 driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

	}

	@When("user enters valid userName and Valid Password")
	public void user_enters_valid_user_name_and_valid_password() {

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("karthik");

		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Moon@123.");

	}

	@When("User clicks Login Button")
	public void user_clicks_login_button() {
		
		driver.findElement(By.name("login")).click();
	}

	@Then("User verify HomePage is Displayed")
	public void user_verify_home_page_is_displayed() {
		
		System.out.println(driver.getTitle());
	}

}
