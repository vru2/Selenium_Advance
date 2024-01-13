package TestScripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLiberary.BaseTest;

public class Cart_ShoppingTest extends BaseTest {
	
	@Test
	public void addToCart() throws InterruptedException{
		
		
		// Clicking on Digital Download 
		driver.findElement(By.xpath("(//a[contains(text(),'Digital downloads')])[1]")).click();
		
		// Getting all products in Digital Download
		List<WebElement> allprod = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		
		int s= allprod.size();
		
		for(WebElement prod: allprod) {
			
			prod.click();
			Thread.sleep(1000);
			
		}
	
		// Clicking on Shopping Cart
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		
		// GEtting all Products in cart
		List<WebElement> allcart = driver.findElements(By.xpath("//tr[@class='cart-item-row']"));
	
		int c= allcart.size();
		
		// Verifing the products from the Digital Download and IN carts are matching in numbers
		AssertJUnit.assertEquals(allprod.size(), allcart.size());
		Reporter.log("Add to cart test passed",true);
		
		/*if(allprod.size()==allcart.size()) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}*/
		
		
		
	}

}
