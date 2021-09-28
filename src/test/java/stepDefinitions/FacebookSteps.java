package stepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSteps {
	WebDriver driver;

	@Before
	public void iOpenFacebookWebApp() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
	}

	@When("^Input to Username textbox$")
	public void inputToUsernameTextbox() {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("hoanghp95@gmail.com");
	}

	@And("^Input to Password textbox$")
	public void inputToPasswordTextbox() {
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("123456");
	}

	@When("^Input to Username textbox with data \"([^\"]*)\"$")
	public void inputToUsernameTextboxWithDataSomething(String email) {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(email);
	}

	@And("^Input to Password textbox with data \"([^\"]*)\"$")
	public void inputToPasswordTextboxWithDataSomething(String password) {
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(password);
	}

	@When("^Input to Username textbox with data \"([^\"]*)\" and Password textbox with data \"([^\"]*)\"$")
	public void inputToUsernameTextboxWithDataSomethingAndPasswordTextboxWithDataSomething(String email, String password){
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(password);
	}
	
	@When("^Input to Username textbox and Password textbox with data$")
	public void inputToUsernameTextboxAndPasswordTextboxWithData(DataTable customerTable) {
		List<Map<String, String>> customer = customerTable.asMaps(String.class, String.class);
//	   driver.findElement(By.id("email")).clear();
//	   driver.findElement(By.id("email")).sendKeys(customer.get(0).get("Username"));
//	   driver.findElement(By.id("pass")).clear();
//	   driver.findElement(By.id("pass")).sendKeys(customer.get(0).get("Password"));
//	   driver.findElement(By.id("email")).clear();
//	   driver.findElement(By.id("email")).sendKeys(customer.get(1).get("Username"));
//	   driver.findElement(By.id("pass")).clear();
//	   driver.findElement(By.id("pass")).sendKeys(customer.get(1).get("Password"));

		for (Map<String, String> cus : customer) {
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(cus.get("Username"));
			driver.findElement(By.id("pass")).clear();
			driver.findElement(By.id("pass")).sendKeys(cus.get("Password"));
		}
	}
	
	@And("^Click to Login button$")
	public void clickToLoginButton() {
		driver.findElement(By.name("login")).click();
	}

	@After
	public void closeApplication() {
		driver.quit();
	}
}
