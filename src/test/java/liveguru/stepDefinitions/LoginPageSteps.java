package liveguru.stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.liveGuru.HomePageObject;
import pageObjects.liveGuru.LoginPageObject;
import pageObjects.liveGuru.PageGeneratorManager;

public class LoginPageSteps {
	WebDriver driver;
	LoginPageObject loginPage;
	HomePageObject homePage;
	TestContext testContext;
	String newPageUrl;
	public LoginPageSteps(TestContext testContext) {
		this.driver = Hooks.openAndQuitBrowser();
		this.testContext = testContext;
		loginPage = PageGeneratorManager.getLoginPage(driver);
		newPageUrl =  (String) testContext.getDataContext().getContext(Context.LOGIN_URL);
	}
				
	@Then("^New Home Page Url is \"([^\"]*)\"$")
	public void newHomePageUrlIs(String homePageUrl, DataTable homePageTable) {
		String newHomePageUrl = loginPage.getCurrentPageUrl(driver);
		List<Map<String, String>> homePage = homePageTable.asMaps(String.class, String.class);
		Assert.assertEquals(newHomePageUrl, homePage.get(0).get("homePageUrl"));
	}
	@When("^Input \"([^\"]*)\" at Email Address textbox$")
	public void inputAtEmailAddressTextbox(String emailAddress){
	  loginPage.enterToEmailAddressTextbox(emailAddress);
	}

	@And("^Input \"([^\"]*)\" at Password textbox$")
	public void inputAtPasswordTextbox(String password){
	  loginPage.enterToPasswordTextbox(password);
	}

	@And("^Click to Login$")
	public void clickToLogin(){
		loginPage.clickToLoginButton();
	}

	@Then("^Error message are displayed with content \"([^\"]*)\"$")
	public void errorMessageAreDisplayedWithContent(String errorMessage){
		Assert.assertEquals(loginPage.getEmptyEmailErrorMessage(), errorMessage);
		Assert.assertEquals(loginPage.getEmptyPasswordErrorMessage(), errorMessage);
	}
	@Then("^Error message below header page is displayed with content \"([^\"]*)\"$")
	public void errorMessageBelowHeaderPageIsDisplayedWithContent(String expectedMessage){
		Assert.assertEquals(loginPage.getIncorrectEmailPasswordErrorMessage(), expectedMessage);
	}
	@And("^Open Home Page at My Account$")
    public void openHomePageAtMyAccount(){
		
		//String newHomPageUrl = (String) homePage;
		System.out.println("newPageUrl : " + newPageUrl);
		//loginPage.openPageUrl(driver, );
    }
	
}
