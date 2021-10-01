package liveguru.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.liveGuru.LoginPageObject;
import pageObjects.liveGuru.PageGeneratorManager;

public class LoginPageSteps {
	WebDriver driver;
	LoginPageObject loginPage;
	String emailAddressData, passwordData;
	
	public LoginPageSteps() {
		this.driver = Hooks.openAndQuitBrowser();
		loginPage = PageGeneratorManager.getLoginPage(driver);
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
	
}
