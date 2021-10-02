package liveguru.stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumberOptions.Hooks;
import pageObjects.liveGuru.MyDashboardPageObject;
import pageObjects.liveGuru.PageGeneratorManager;

public class MyDashboardPageSteps {
	WebDriver driver;
	MyDashboardPageObject myDashBoardPage;
	TestContext testContext;
	public MyDashboardPageSteps(TestContext testContext) {
		this.driver = Hooks.openAndQuitBrowser();
		this.testContext = testContext;
		myDashBoardPage = PageGeneratorManager.getMyDashboardPage(driver);
	}
	
}
