package org.user;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement textEmail;

	@FindBy(id="pass")
	private WebElement textPass;

	@FindBy(name="login")
	private WebElement ptnClick;

	@FindBy(xpath = "//a[text()='Forgotten password?']")
	private WebElement forgetPass;

	@FindBy(xpath = "//input[@type='text']")
	private WebElement reTextEmail;

	@FindBy(xpath = "//button[@type = 'submit']")
	private WebElement reClick;

	public WebElement getTextEmail() {
		return textEmail;
	}

	public WebElement getTextPass() {
		return textPass;
	}

	public WebElement getPtnClick() {
		return ptnClick;
	}

	public WebElement getForgetPass() {
		return forgetPass;
	}

	public WebElement getReTextEmail() {
		return reTextEmail;
	}

	public WebElement getReClick() {
		return reClick;
	}

}
