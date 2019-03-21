package TestPage;
import pageobjects.HomePageObjects;


import org.junit.Test;
import org.openqa.selenium.WebElement;

import Function.BasePage;
public class SelectionPage extends BasePage {
	BasePage bp = new BasePage();
	
	
	@Test
	public void launch() throws InterruptedException  {

		HomePageObjects po=new HomePageObjects();
	
		launchbrowser();
	
		quit();
		
	}

	
}
