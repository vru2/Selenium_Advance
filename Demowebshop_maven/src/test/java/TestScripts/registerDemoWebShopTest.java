package TestScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POMREPO.Register_Page;
import genericLiberary.BaseTest;

public class registerDemoWebShopTest extends BaseTest {
	
	@Test
	public void register() throws InterruptedException {
		
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		//driver.get("https://demowebshop.tricentis.com/");
		
		Register_Page register_page = new Register_Page(driver);
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		
		driver.findElement(By.linkText("Register")).click();
//		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
//		driver.findElement(By.xpath("(//input[@class='text-box single-line'])[1]")).sendKeys("Vru");
//		driver.findElement(By.xpath("(//input[@class='text-box single-line'])[2]")).sendKeys("G");
//		driver.findElement(By.id("Email")).sendKeys("qwerty"+utility_methods.getRandomNumber()+"@abc.com");
//		driver.findElement(By.id("Password")).sendKeys("qwerty");
//		driver.findElement(By.id("ConfirmPassword")).sendKeys("qwerty");
//		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		//Thread.sleep(5000);
		register_page.getMaleRadioButton().click();
		register_page.getFirstNameTextField().sendKeys("Vru");
		register_page.getLastNameTextField().sendKeys("G");
		register_page.getEmailTextField().sendKeys("qwerty"+utility_methods.getRandomNumber()+"@abc.com");
		register_page.getPasswordTextField().sendKeys("qwerty");
		register_page.getConfirmPasswordTextField().sendKeys("qwerty");
		register_page.getRegisterRadioButton().click();
		
		
		String register = "Your registration completed";
		String actualRegister = driver.findElement(By.xpath("//div[@class='result']")).getText();
		
		Assert.assertEquals(actualRegister,register);
		Reporter.log("RegesterTest Case Pass",true);
		
//		if(actualRegister.equals(register)) {
//			System.out.println("Account is created");
//		}
//		else {
//			System.out.println("Account already existed");
//		}
	}

}
