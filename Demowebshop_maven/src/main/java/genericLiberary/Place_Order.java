package genericLiberary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLiberary.BaseTest;

public class Place_Order extends BaseTest {
	
	@Test
	public void placeOrder() throws InterruptedException {
		
		//Step 1 click on Computers
		driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]")).click();
		Thread.sleep(2000);
		
		//Step 2 click on Desktop
		driver.findElement(By.xpath("(//a[@title='Show products in category Desktops'])[1]")).click();
		Thread.sleep(2000);
		
		// Step 3 click on simple compute
		driver.findElement(By.xpath("//a[contains(text(),'Simple Computer')]")).click();
		
		//Step 4 click on processor
		driver.findElement(By.id("product_attribute_75_5_31_96")).click();
		
		// Step 5 Add to cart
		driver.findElement(By.id("add-to-cart-button-75")).click();
		Thread.sleep(2000);
		
		// Step 6 Click on shopping cart
		driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]")).click();
		
		//Step 7 Select terms and service
		driver.findElement(By.id("termsofservice")).click();
		
		//Step 8 Click on Checkout
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);
		
		//Step 9 Click on all continue buttons for address and payment
		driver.findElement(By.xpath("(//input[@value='Continue'])[1]")).click();
		driver.findElement(By.xpath("(//input[@value='Continue'])[2]")).click();
		driver.findElement(By.xpath("(//input[@value='Continue'])[3]")).click();
		driver.findElement(By.xpath("(//input[@value='Continue'])[4]")).click();
		driver.findElement(By.xpath("(//input[@value='Continue'])[5]")).click();
		
		//Step 9 Click on confirm Order
		driver.findElement(By.xpath("(//input[@value='Confirm'])")).click();
		Thread.sleep(2000);
		
		//Step 10 Verifying the order is placed or Not 
		WebElement currentText = driver.findElement(By.xpath("//div[@class='title']"));
		System.out.println(currentText.getText());
		
		String fixedText = "Your order has been successfully processed!";
		
		Assert.assertEquals(currentText.getText(), fixedText);
		Reporter.log("Test is passed",true);
		
		if(currentText.getText().equals(fixedText)) {
			System.out.println("Passed, Order Placed");
		}
		else {
			System.out.println("Failed, Order Not placed");
		}		
		
	}	
	
}
