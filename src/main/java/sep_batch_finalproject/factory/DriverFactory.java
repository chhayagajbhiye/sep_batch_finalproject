package sep_batch_finalproject.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	static WebDriver driver =null;
	public static WebDriver initiateDriver() {
		try {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
			driver = new ChromeDriver(options);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return driver;	
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
//	public static void closeDriver() {
//		try {
//			driver.close();
//			driver.quit();
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		
	}
//}
