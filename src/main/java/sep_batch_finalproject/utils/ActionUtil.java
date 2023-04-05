package sep_batch_finalproject.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sep_batch_finalproject.factory.DriverFactory;

public class ActionUtil {

	public static void enterText(By locator, String textToEnter) {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(),Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		DriverFactory.getDriver().findElement(locator).sendKeys(textToEnter);
		
	}
	
	public static void click(By locator) {
		DriverFactory.getDriver().findElement(locator).click();
				
	}
	
//	public static void takeScreenshot(By locator) {
//        ((ActionUtil) DriverFactory.getDriver()).takeScreenshot(locator).click();
//        
//    }
	
	public static void moveToElement(By element) {
		DriverFactory.getDriver().findElement(element).click();
		
	}
	
	//clearAndEnter
	//isVisible
	//isDisplay
	//selectAnyDropDown
	//DoubleClick
	//rightClick
//Scroll	
//	public static void isVisible(By locator) {
//		DriverFactory.getDriver().getTitle().
//	}

}