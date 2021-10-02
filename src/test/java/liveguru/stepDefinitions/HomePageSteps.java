package liveguru.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.liveGuru.HomePageObject;
import pageObjects.liveGuru.PageGeneratorManager;

public class HomePageSteps {
	WebDriver driver;
	HomePageObject homePage;
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
		//String newHomePageUrl = homePage.getHomePageUrl();
		String newHomePageUrl = "http://live.techpanda.org/";
		testContext.dataContext.setContext(Context.LOGIN_URL, newHomePageUrl);
	
	}

}
