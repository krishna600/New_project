package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import resources.Base;

public class Loginpage {
	
	public WebDriver driver;
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="txtUsername") WebElement username;
	@FindBy(id="txtPassword")WebElement password;
	@FindBy(name="Submit") WebElement click_button;
	
	public void set_username(String un) {
		username.sendKeys(un);
	}
	public void set_password(String pw) {
		password.sendKeys(pw);
	}
	public void click_login() {
		click_button.click();
	}
	
	
}
