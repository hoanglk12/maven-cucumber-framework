package liveguru.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.liveGuru.HomePageObject;
import pageObjects.liveGuru.LoginPageObject;
import pageObjects.liveGuru.PageGeneratorManager;

public class HomePageSteps {
	WebDriver driver;
	HomePageObject homePage;
	LoginPageObject loginPage;
	TestContext testContext;

	public HomePageSteps(TestContext testContext) {
		this.driver = Hooks.openAndQuitBrowser();
		this.testContext = testContext;
		homePage = PageGeneratorManager.getHomePage(driver);
	}

	@Then("^Logo Page is displayed$")
	public void logoPageIsDisplayed() {
		Assert.assertTrue(homePage.isLogoPageDisplayed());
	}

	@When("^I get new login Url$")
	public void iGetNewLoginUrl() {
		testContext.getDataContext().setContext(Context.LOGIN_URL, homePage.getHomePageUrl());
		//String newHomePageUrl = (String) testContext.getDataContext().getContext(Context.LOGIN_URL);
	}

}
