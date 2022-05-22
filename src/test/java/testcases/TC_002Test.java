package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.AddEmployee;
import pageObjects.Loginpage;
import pageObjects.VerifyTitle;
import resources.Base;

public class TC_002Test extends Base {
	
	
	@Test
	public void BaseNavigation() throws IOException {
		driver=initializeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Loginpage obj = new Loginpage(driver);
		obj.set_username("Admin");
		obj.set_password("admin123");
		obj.click_login();
		VerifyTitle obj2 = new VerifyTitle(driver);
		obj2.Title();
		AddEmployee obj3 = new AddEmployee(driver);
		obj3.setpim();
		
	}

}
