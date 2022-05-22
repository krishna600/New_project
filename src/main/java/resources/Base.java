package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("E:\\Projects\\Tutoroot_Project\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String Browser_Name =prop.getProperty("browser");
		if(Browser_Name.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","E:\\Projects\\Tutoroot_Project\\src\\main\\java\\browsers\\chromedriver.exe" );
			driver = new ChromeDriver();
		} else if (Browser_Name.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","E:\\Projects\\Tutoroot_Project\\src\\main\\java\\browsers\\chromedriver.exe" );
			driver = new ChromeDriver();
		}

         driver.manage().window().maximize();
         
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
         
         return driver;




   }

}
