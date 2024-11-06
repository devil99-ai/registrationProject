package project.registration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class registrationStepDefinations {
	WebDriver driver;
	PageObject pom;
	@Given("the user is on the registration page")
	public void the_user_is_on_the_registration_page() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    pom = new PageObject();
	    driver.manage().window().maximize();
	    driver.get("https://magento.softwaretestingboard.com/");
	    driver.findElement(pom.create_Account).click();
	    
	}

	@When("the user fills in valid registration details and submits")
	public void the_user_fills_in_valid_registration_details_and_submits() {
	    driver.findElement(pom.first_name).sendKeys("Souvik");
	    driver.findElement(pom.last_name).sendKeys("Sharma");
	    driver.findElement(pom.email).sendKeys("svkshrm@email.co");
	    driver.findElement(pom.password).sendKeys("Souvik99@");
	    driver.findElement(pom.confirm_passowrd).sendKeys("Souvik99@");
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(302,756)", "");
	    driver.findElement(pom.confirm_btn).click();
	}

	@Then("a confirmation message {string} is displayed")
	public void a_confirmation_message_is_displayed(String string) {
	    String actualConfirmation = driver.findElement(pom.confirmation_text).getText();
	    String expectedText = "Thank you for registering with Main Website Store.";
	    if(driver.findElement(pom.confirmation_text).isDisplayed()) {
	    	System.out.printf("registration successfull",actualConfirmation);
	    }else {
	    	System.out.println("failed to register");
	    }
	}
	@Then("the user is redirected to their account dashboard")
	public void the_user_is_redirected_to_their_account_dashboard() {
	   driver.navigate().to("https://magento.softwaretestingboard.com/");
	}
}
