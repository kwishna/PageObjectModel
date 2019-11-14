package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver wd;
	
	public HomePage(WebDriver driver){
		
		wd = driver;
		PageFactory.initElements(driver, this);

// Or, For ajax Loading Pages.
//		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(getDriver(), 100);
//		PageFactory.initElements(factory, this);
	}
	
	@FindBy(how = How.CSS, using = "td.mouseOut > [href='mercuryregister.php']")
	WebElement registerBtn;
	
	@FindBy(name="userName")
	WebElement userNameBox;
	
	@FindBy(name="password")
	WebElement passwordBox;
	
	@FindBy(name="login")
	WebElement loginBtn;
	
	@FindBy(how=How.TAG_NAME, using = "a")
	List<WebElement> links;
	
	@FindBys({
		
		@FindBy(how=How.TAG_NAME, using = "div"),
		@FindBy(how=How.TAG_NAME, using = "a")
	})
	List<WebElement> aTagsInsideAnyDiv;
	
	@FindAll({
		
		@FindBy(how=How.TAG_NAME, using = "div"),
		@FindBy(how=How.TAG_NAME, using = "input")
	})
	List<WebElement> allDivPlusInputTags;
	
	public void goToSignUpPage() {
		
		registerBtn.click();
		System.out.println("Links Size : "+links.size());
		System.out.println("aTagsInsideAnyDiv Size : "+aTagsInsideAnyDiv.size());
		System.out.println("allDivPlusInputTags Size : "+allDivPlusInputTags.size());
	}
	
	public void enterUsername(String username) {

		userNameBox.clear();
		userNameBox.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		
		passwordBox.clear();
		passwordBox.sendKeys(password);
	}
	
	public void clickLoginBtn() {
		
		loginBtn.click();
	}
}
