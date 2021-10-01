package pageUIs.liveGuru;

public class CommonPageUI {
	public static final String DYNAMIC_TEXTBOX = "//input[@id='%s']";
	public static final String DYNAMIC_ERROR_MSG_BY_ID = "//input[@id='%s']/following-sibling::div[@id='advice-%s']";
	public static final String DYNAMIC_BUTTON_BY_TAG_AND_TEXT = "//%s[contains(.,'%s')]";
	public static final String DYNAMIC_FOOTER_LINK = "//div[@class='footer']//a[text()='%s']";
}
