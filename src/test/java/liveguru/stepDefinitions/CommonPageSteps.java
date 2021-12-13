package liveguru.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.liveGuru.CommonPageObject;
import pageObjects.liveGuru.PageGeneratorManager;

public class CommonPageSteps {
	WebDriver driver;
	CommonPageObject commonPage;
	String emailDataInput, passwordDataInput;

	public CommonPageSteps() {
		this.driver = Hooks.openAndQuitBrowser();
		commonPage = PageGeneratorManager.getCommonPage(driver);
	}

	@Given("^Open \"([^\"]*)\" at footer link$")
	public void openAtFooterLink(String footerLinkText) {
		commonPage.clickToFooterLinkByText(driver, footerLinkText);
	}

	@When("^Input to \"([^\"]*)\" Textbox with data \"([^\"]*)\"$")
	public void inputToTextboxWithData(String id, String valueEmailInput) {
		commonPage.enterToTextboxByAttributeId(driver, id, valueEmailInput);
	}

	@And("^Input to \"([^\"]*)\" Texbox with data \"([^\"]*)\"$")
	public void inputToTexboxWithData(String id, String valuePasswodInput) {

		commonPage.enterToTextboxByAttributeId(driver, id, valuePasswodInput);
	}

	@And("^Click to \"([^\"]*)\" with text \"([^\"]*)\"$")
	public void clickToWithText(String tagType, String textValue) {
		commonPage.clickToButtonByTagAndText(driver, tagType, textValue);
	}

	@Then("^Error message at \"([^\"]*)\" and \"([^\"]*)\" is displayed with content \"([^\"]*)\"$")
	public void errorMessageAtAndIsDisplayedWithContent(String idTagInput, String idErrorMsg, String expectedMessage) {
		Assert.assertEquals(commonPage.getErrorMessageByAttributeId(driver, idTagInput, idErrorMsg), expectedMessage);
	}

	@Then("^Error message is displayed with content \"([^\"]*)\"$")
	public void errorMessageAtIsDisplayedWithContent(String expectedMessage) {
		Assert.assertEquals(commonPage.getErrorMessageByAttributeId(driver, "email", "required-entry-email"), expectedMessage);
		Assert.assertEquals(commonPage.getErrorMessageByAttributeId(driver, "pass", "required-entry-pass"), expectedMessage);
	}

}
