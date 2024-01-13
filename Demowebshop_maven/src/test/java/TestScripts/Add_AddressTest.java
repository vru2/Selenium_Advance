package TestScripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLiberary.BaseTest;

public class Add_AddressTest extends BaseTest {
	
	@Test
	public void addAddress() {
		
		//Step 1 Click on My Accounts
		driver.findElement(By.xpath("//a[contains(text(),'My account')]")).click();
		
		//Step 2 Click on addresses
		driver.findElement(By.xpath("(//a[contains(text(),'Addresses')])[1]")).click();
		
		//Step 3 Add new Address
		driver.findElement(By.xpath("//input[@value='Add new']")).click();
		
		//Steps 4 Add address details
		//First Name
		driver.findElement(By.xpath("//input[@name='Address.FirstName']")).sendKeys("Vru");
		//Last Name
		driver.findElement(By.xpath("//input[@name='Address.LastName']")).sendKeys("Gurjar");
		//Email
		driver.findElement(By.id("Address_Email")).sendKeys("qwerty@abc.com");
		//Country
		driver.findElement(By.xpath("//option[@value='41']")).click();
		//City
		driver.findElement(By.id("Address_City")).sendKeys("Bangalore");
		//Address1
		driver.findElement(By.id("Address_Address1")).sendKeys("omkara building Munekola");
		//Zip Code
		driver.findElement(By.id("Address_ZipPostalCode")).sendKeys("1234567");
		//Phonenumber
		driver.findElement(By.id("Address_PhoneNumber")).sendKeys("1234561234");
		
		//Step 5 Save the address
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		
		//Verify Address
		WebElement currentText = driver.findElement(By.xpath("(//div[@class='title'])[3]"));
		System.out.println(currentText.getText());
		
		String fixedText = "Vru Gurjar";
		
		AssertJUnit.assertEquals(currentText.getText(), fixedText);
		Reporter.log("Test is passed",true);
		
		/*if(currentText.getText().equals(fixedText)) {
			System.out.println("Passed, Address Saved");
		}
		else {
			System.out.println("Failed, Address not present");
		}*/
		
		//Step 6 Delete the address
		//driver.findElement(By.xpath("(//input[@class='button-2 delete-address-button'])[2]")).click();
		
	}

}
