package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployee {
	
	public WebDriver driver;
	
	public AddEmployee(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="PIM")WebElement pom;
	
	@FindBy(id="menu_pim_viewEmployeeList")WebElement empllist;
	
	@FindBy (id="menu_pim_addEmployee")WebElement Add_emp;
	
	public void setpim() {
		Actions act = new Actions(driver);
		act.moveToElement(pom).moveToElement(empllist).moveToElement(Add_emp).click().build().perform();
	    System.out.println("Navigated to Add Employee page");
	}

}
