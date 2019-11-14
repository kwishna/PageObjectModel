package testCases;

import basic.Instantiate;
import webPage.LoginPage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

public class TC_001 extends Instantiate{
  
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }
  
  
  @DataProvider(name="dp")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  
  @Test
  public void get_logged_in(){
	  /**
	   * 
	   * We Need Object Of Login Page To Use The Object Repository. In PageFactory, We Also Need To Initialize The WebElements.
	   * For That We Use PageFactory.initElement() Method.
	   * We Have A Number Of Approach To Initialize Elements.
	   * 
	   * Approach No. 1 :-
	  	LoginPage login = new LoginPage();
	  	PageFactory.initElements(driver, login);
	  	
	   *Approach No. 2 :-
	  	LoginPage login1 = PageFactory.initElements(driver, LoginPage.class);
	  
	   *Approach No 3 :-
	   *It Is Preferable. There Must Be Constructor Inside The WebPage Class Which Takes A Driver Object And
	   *The Constructor Should Contain The PageFactory InitElements() Method To Initialize Elements.
	  	
	  	LoginPage login2 = new LoginPage(driver);
	  	
	   *
	   */
	  
	  LoginPage login = new LoginPage(driver); //We Can Put This In BeforeSuite Or BeforeMethod Or BeforeClass. As Per Requirement. So That
	  											//We Don't Need To Initialize It In Every Test Case
	  login.gotoHomePage();
	  login.enterUsername("bholenath");
	  login.enterPassword("password");
	  login.enterMailId("baba@login");
	  login.clickSubmit();
			  
	  
  }
  
}
