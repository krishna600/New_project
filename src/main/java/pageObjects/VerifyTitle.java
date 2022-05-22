package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class VerifyTitle {
	public WebDriver driver;
	
	public VerifyTitle(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Title() {
		String Title = driver.getTitle();
		if(Title.contains(Title)) {
			System.out.println("Original Title is :" + Title);
			System.out.println("Title Matched");
			
		}
	}

}
