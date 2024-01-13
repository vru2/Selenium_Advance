package genericLiberary;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectClassUtility {
	
	Select s;
	
	public void selectOptionByIndex(WebElement dropDown, int indexNum) {
		
		s = new Select(dropDown);
		s.selectByIndex(indexNum);
	}
	
	public void selectOptionByValue(WebElement dropDown, String value) {
		
		s = new Select(dropDown);
		s.selectByValue(value);
	}

	public void selectOptionByVisibleText(WebElement dropDown, String visibleText) {
	
	s = new Select(dropDown);
	s.selectByVisibleText(visibleText);
}
	
	
	public void deselectOptionByAll(WebElement dropDown) {
		s = new Select(dropDown);
		s.deselectAll();
	}
	
	public void deselectOptionByIndex(WebElement dropDown, int indexnum) {
		s= new Select(dropDown);
		s.deselectByIndex(indexnum);
	}
	
	public void deselectOptionByValue(WebElement dropDown, String value) {
		
		s= new Select(dropDown);
		s.deselectByValue(value);
	}
	
	public void deselectOptionByvisibleText(WebElement dropDown, String visibleText) {
		s= new Select(dropDown);
		s.deselectByVisibleText(visibleText);
	}
	
	public  List<WebElement> fetchAllOption(WebElement dropDown ) {
		s= new Select(dropDown);
		return s.getOptions();
	}
	
	public boolean verifyMultiselectDropDown(WebElement dropDown) {
		s= new Select(dropDown);
		return s.isMultiple();
				
	}
}














