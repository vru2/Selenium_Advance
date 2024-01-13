package genericLiberary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {


		
		public WebDriver driver;
		public DataUtility du = new DataUtility();
		
		public UtilityMethods utility_methods = new UtilityMethods();
		
		@BeforeClass
		public void launchBrowser() throws IOException {
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(du.getDataFromProperties("url"));
		}
		
		@BeforeMethod
		public void login() throws IOException {
			driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.xpath("//input[@class='email']")).sendKeys(du.getDataFromProperties("UN"));
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(du.getDataFromProperties("Pwd"));
			driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		}
		
		@AfterMethod
		public void logout() {
			driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		}
		
		@AfterClass
		public void closeBrowser(){
			driver.quit();
		}


}
