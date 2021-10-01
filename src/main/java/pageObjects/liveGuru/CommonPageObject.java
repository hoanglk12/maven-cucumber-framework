package pageObjects.liveGuru;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.liveGuru.CommonPageUI;

public class CommonPageObject extends BasePage {
	WebDriver driver;

	public CommonPageObject(WebDriver driver) {
		this.driver = driver;
	}

	// LiveGuru
	public String getErrorMessageByAttributeId(WebDriver driver, String idInputTag, String idMsgType) {
		waitForElementVisible(driver, CommonPageUI.DYNAMIC_ERROR_MSG_BY_ID, idInputTag, idMsgType);
		return getTextElement(driver, CommonPageUI.DYNAMIC_ERROR_MSG_BY_ID, idInputTag, idMsgType);
	}

	public void enterToTextboxByAttributeId(WebDriver driver, String id, String value) {
		waitForElementVisible(driver, CommonPageUI.DYNAMIC_TEXTBOX, id);
		sendkeyToElement(driver, CommonPageUI.DYNAMIC_TEXTBOX, value, id);
	}
	
	public void clickToButtonByTagAndText(WebDriver driver, String tagName, String textName) {
		waitForElementVisible(driver, CommonPageUI.DYNAMIC_BUTTON_BY_TAG_AND_TEXT, tagName, textName);
		clickToElement(driver, CommonPageUI.DYNAMIC_BUTTON_BY_TAG_AND_TEXT, tagName, textName);
	}
	public void clickToFooterLinkByText(WebDriver driver, String footerLinkName) {
		waitForElementVisible(driver, CommonPageUI.DYNAMIC_FOOTER_LINK, footerLinkName);
		clickToElement(driver, CommonPageUI.DYNAMIC_FOOTER_LINK, footerLinkName);
	}

}
