package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Base;
import pages.HomePage;

public class TC001 extends Base {
	
	HomePage home;
	
	@BeforeClass
	public void initPages() {
		
		home = new HomePage(driver);
		logger.error("Setting Up In Page Factory Of TC001 Class");
	}
	
	@Test(priority=0)
	public void openUrl() {
		
		driver.get("http://newtours.demoaut.com/");
	}
	
	@Test(priority=1)
	public void enterUsername() {
		
		home.enterUsername("Krishna");
	}
	
	@Test(priority=2)
	public void enterPassword() {
		
		home.enterPassword("hello");
	}
	
	@Test(priority=3)
	public void clickLoginBtn() {
		
		home.clickLoginBtn();
		home.goToSignUpPage();
	}
}
