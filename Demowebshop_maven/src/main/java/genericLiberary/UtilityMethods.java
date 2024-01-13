package genericLiberary;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityMethods implements frameWorkConstants {
	
	public int getRandomNumber() {
		Random r = new Random();
		return r.nextInt(10000);
	}
	
	public void takeScreenShots(WebDriver driver, String name) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(screenshot_Path+name+".png");
		FileHandler.copy(src, trg);
		
	}
	
	public void acceptAlertPopUp(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public void dismissAlertPopUp(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	public void passValueToAlert(WebDriver driver, String value) {
		driver.switchTo().alert().sendKeys(value);
	}
	
	public String getAlertMessage(WebDriver driver) {
		return driver.switchTo().alert().getText();
	}

}
