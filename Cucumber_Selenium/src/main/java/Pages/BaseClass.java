package Pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.UserDataHandler;

public class BaseClass {
	public static WebDriver driver;
	static Properties prop;
	public static void readPropertiesFile() {
		prop = new Properties();
		try {
			InputStream ip= new FileInputStream(System.getProperty("user.dir")+ "/src/main/resource/config.properties");
			prop.load(ip);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void initialization() {
		readPropertiesFile();
		String browser = prop.getProperty("browser");
		System.setProperty("webdriver.chrome.driver", prop.getProperty("driverpath"));
		if(browser.equals("chrome")) {
		driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")){
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}

	public static void closeApplication() {
		driver.quit();
	}
	
	
}