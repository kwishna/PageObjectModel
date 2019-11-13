package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Base;
import pages.SignUpPage;

public class TC002 extends Base{
	
	SignUpPage sign;
	
	@BeforeClass
	public void initPages() {
		
		sign = new SignUpPage(driver);
		logger.error("Setting Up In Page Factory Of TC001 Class");
	}
	
	@Test(priority=4)
	public void first() {
		
		driver.navigate().to("http://newtours.demoaut.com/mercuryregister.php");
		sign.countElementsInFindBys();
	}
}
