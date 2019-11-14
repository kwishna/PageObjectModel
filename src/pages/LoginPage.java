package webPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/**
 * @author AB D
 *
 *This Is Login Page Class. It Has Element Locators & Actions That Can Be Performed On This Web Page.
 */
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	/**
	 * Starts*
	 * Below Are Methods For Different Actions That Can Be Performed On This Page.
	 * We Can Use PageFactory Class To Use Is More Efficiently. Which Is Also Written In This class Separately. 
	 * 
	 
	private WebDriver driver;
	
	public LoginPage(driver){
		this.driver = driver;

// If Using @FindBy, Then Use PageFactory.
//  PageFactory.initElements(driver, this);

// Or, For ajax Loading Pages.
//		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(getDriver(), 100);
//		PageFactory.initElements(factory, this);
	}
	
	By userName = By.id("uname");
	By password = By.className(".password");
	By email = By.id("email"); //This Is Also A Good Approach.
	
	public void enterUsername(String user){
		driver.findElement(userName).sendKeys(user);
	}
	
	public void enterPassword(String pass){
		driver.findElement(password).sendKeys(pass);
	}
	
	public void enterEmail(){
		driver.findElement(email).sendKeys("ABD@Test");
	}

	public void clickSubmit(){
		driver.findElement(By.id("submit")).click();
	}
	
	*
	* This Code Is Just For Understanding Purpose. Below Is Implementation Of POM Using PageFactory Class.
	* *Ends*
	*/
	
	/*
	 * PageFactory Starts
	 * Inside FindBy SearchContext Is Written And The Name By Which Element Box Can Be Recognized.
	 * 
	 * During The PageFactory.initElement() All Elements Are Initialized.
	 * Again, When Action On The Element Is Performed, It Will Be Again Initialized.
	 * Hence, There Is Double Work. So, @CacheLookup Is Used To Initialize Is Only One Time(First Time Only).
	 * If You Are Sure That The Element Will Be Present Later Also. 
	 */
	
	WebDriver driver;
	
	@FindBy(id="uname")	public WebElement userNameBox;
	@FindBy(id="pword")	public WebElement passwordBox;
	@FindBy(xpath="//input[@id='email']")	public WebElement mailIdBox;
	@FindBy(css=".submit-btn") public WebElement submitButton;
	@FindBy(how=How.CSS, using=".reset-btn") public WebElement resetButton;
	@FindBy(how=How.TAG_NAME, using="select") public List<WebElement> dropDownList;
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/**
	 *	In Lazy Loading Concept, AJAX :-
	 	public WebPage(Webdriver driver){
	 	PageFactory.initElements(new AjaxElementLocatorFactory(driver, TimeoutValue), this);
	 	}
	 */

	public void enterUsername(String user){
		userNameBox.clear();
		userNameBox.sendKeys("UserName");
	}
	
	public void enterPassword(String password){
		passwordBox.clear();
		passwordBox.sendKeys("password");
	}
	
	public void enterMailId(String mail){
		mailIdBox.clear();
		mailIdBox.sendKeys("email@send");
	}
	
	public void clickSubmit(){
		submitButton.click();
	}
	
	public void clickReset(){
		resetButton.click();
	}
	
	public void getTitle(){
		driver.getTitle();
	}
	
	public void gotoHomePage(){
		driver.get("https://www.bholebaba.com");
	}
}
