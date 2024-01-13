package TestScripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLiberary.BaseTest;

public class wishList_PageTest extends BaseTest {
	
@Test
	public void wishList() throws InterruptedException {
		
		//Step1 Clicking on Books link
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		Thread.sleep(2000);
		
		//Step2 Clicking on the Fiction EX book
		driver.findElement(By.xpath("//a[text()='Fiction EX']")).click();
		
		//Step3 Clicking on Add to book in wishlist
		driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-78']")).click();
		
		//Step4 Clicking on the the wishlist page
		driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
		
		//Step5 Verifing the Book added is present in wishlist 
		WebElement text = driver.findElement(By.xpath("//a[text()='Fiction EX']"));
		System.out.println(text.getText());
		
		String actualText = "Fiction EX";
		
		AssertJUnit.assertEquals(text.getText(), actualText);
		
		/*if(text.getText().equals(actualText)) {
			System.out.println("Product is present");
		}
		else {
			System.out.println("Product is not present");
		}*/
		
		//Step6 Selecting and then removing the book from the wishlist 
		driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
		driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		
		//Step7 Verifing the product is removed or not 
		WebElement currentText = driver.findElement(By.xpath("//div[@class='wishlist-content']"));
		System.out.println(currentText.getText());
		
		String fixedText = "The wishlist is empty!";
		
		AssertJUnit.assertEquals(currentText.getText(), fixedText);
		Reporter.log("Test is passed",true);
		
		/*if(currentText.getText().equals(fixedText)) {
			System.out.println("Passed, Wishlist empty");
		}
		else {
			System.out.println("Failed, wishlist is not empty");
		}*/
		
	}

}
