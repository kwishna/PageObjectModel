package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	
	WebDriver wd;
	
	public SignUpPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBys({
		
		@FindBy(how=How.TAG_NAME, using = "div"),
		@FindBy(how=How.CSS, using = "a")
	})
	List<WebElement> input;
	
	public void countElementsInFindBys() {
		
		System.out.println(input.size());
	}
}
