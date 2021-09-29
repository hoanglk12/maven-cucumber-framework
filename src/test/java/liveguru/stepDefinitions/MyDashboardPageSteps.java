package liveguru.stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumberOptions.Hooks;
import pageObjects.liveGuru.MyDashboardPageObject;
import pageObjects.liveGuru.PageGeneratorManager;

public class MyDashboardPageSteps {
	WebDriver driver;
	MyDashboardPageObject myDashBoardPage;
	public MyDashboardPageSteps() {
		this.driver = Hooks.openAndQuitBrowser();
		myDashBoardPage = PageGeneratorManager.getMyDashboardPage(driver);
	}
}
