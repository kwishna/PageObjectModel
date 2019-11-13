package base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Base {
	
	public static WebDriver driver;
	public static final Logger logger = LogManager.getLogger("Testing");
	
	@BeforeSuite
	public void setUp() {
		
		logger.info("Setting Up In BeforeSuite Of Base Class");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--start-maximized");
		co.addArguments("--disable-infobars");
		co.setAcceptInsecureCerts(true);
		co.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
		
		driver = new ChromeDriver();
	}
	
	@AfterSuite
	public void tearDown() {
		//driver.close();
	}
}
