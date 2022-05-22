package testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.AddEmployee;
import pageObjects.Loginpage;
import pageObjects.VerifyTitle;
import resources.Base;

public class TC_001Test extends Base {
	
	@Test(dataProvider = "getData")
	public void BaseNavigation(String us_name , String ps_name) throws IOException {
		driver=initializeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Loginpage obj = new Loginpage(driver);
		obj.set_username(us_name);
		obj.set_password(ps_name);
		obj.click_login();
		VerifyTitle obj2 = new VerifyTitle(driver);
		obj2.Title();
		AddEmployee obj3 = new AddEmployee(driver);
		obj3.setpim();
		
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][2];
		data[0][0]="Adminnn";
		data[0][1]= "admint225";
		data[1][0]="Admin";
		data[1][1]="admin123";
		
		return data;
	}

}
