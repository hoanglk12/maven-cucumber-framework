package liveguru.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumberOptions.Hooks;
import pageObjects.liveGuru.HomePageObject;
import pageObjects.liveGuru.PageGeneratorManager;

public class HomePageSteps {
	WebDriver driver;
	HomePageObject homePage;
	public HomePageSteps(){
		this.driver = Hooks.openAndQuitBrowser();
		homePage = PageGeneratorManager.getHomePage(driver);
	}
	@Then("^Logo Page is displayed$")
	public void logoPageIsDisplayed()  {
		Assert.assertTrue(homePage.isLogoPageDisplayed());
	}
	

}
