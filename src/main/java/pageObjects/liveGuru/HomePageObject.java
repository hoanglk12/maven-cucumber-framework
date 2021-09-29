package pageObjects.liveGuru;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.liveGuru.HomePageUI;

public class HomePageObject extends BasePage {
	private WebDriver driver;
	   
   
	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}
	public boolean isLogoPageDisplayed() {
		waitForElementVisible(driver, HomePageUI.HOMEPAGE_LOGO);
		return isElementDisplayed(driver, HomePageUI.HOMEPAGE_LOGO);
	}
	public void clickToMyAccountLinkAtFooter() {
		waitForElementClickable(driver, HomePageUI.MYACCOUNT_LINK_FOOTER);
		clickToElement(driver, HomePageUI.MYACCOUNT_LINK_FOOTER);
	}

}
