package org.definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.user.BaseClass;
import org.user.LoginPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition1 extends BaseClass {

	WebDriver driver;
	LoginPojo la;

	@Given("User have to enter facebook login through grome browser")
	public void user_have_to_enter_facebook_login_through_grome_browser() {

		browser("chrome");
		geteUrl("https://www.facebook.com/");
		maxWindows();

	}

	@When("User have to enter invalid email and valid password")
	public void user_have_to_enter_invalid_email_and_valid_password() {
		la = new LoginPojo();
		WebElement textEmail = la.getTextEmail();
		sendValu(textEmail, "saravanan@gmail.com");

		WebElement textPass = la.getTextPass();
		sendValu(textPass, "234567987");

	}

	@When("User have to click login button")
	public void user_have_to_click_login_button() {
		WebElement ptnClick = la.getPtnClick();
		btnClick(ptnClick);

	}

	@When("User have to enter valid and valid values")
	public void user_have_to_enter_valid_and_valid_values() {
		la=new LoginPojo();
		WebElement textEmail = la.getTextEmail();
		
		sendValu(textEmail, "sdfggfghjkjhgf@gmail.com");

		WebElement textPass = la.getTextPass();
		sendValu(textPass, "2345678765");

	}

	@Then("User have to show credentials page")
	public void user_have_to_show_credentials_page() {
		WebElement ptnClick = la.getPtnClick();
		btnClick(ptnClick);

	}

}
