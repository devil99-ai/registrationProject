package project.registration;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginStepDefinations {
	WebDriver driver;
	PageObject pom;
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    pom = new PageObject();
	    driver.manage().window().maximize();
	    driver.get("https://magento.softwaretestingboard.com/");
	    driver.findElement(pom.login_btn).click();
	}

	@When("the user enters valid credentials and submits")
	public void the_user_enters_valid_credentials_and_submits() {
	    driver.findElement(pom.username).sendKeys("svkshrm@gmail.com");
	    driver.findElement(pom.Password).sendKeys("Souvik99@");
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(263,865)", "");
	    driver.findElement(pom.sign_in).click(); 
	}

	@Then("the user is redirected to the account dashboard")
	public void the_user_is_redirected_to_the_account_dashboard() {
	   if(driver.findElement(pom.welcome_text).isDisplayed()) {
		   System.out.println("User navigated to dashboard after login");
	   }else {
		   System.out.println("login error");
	   }
	}

	@Then("a welcome message with their name is displayed")
	public void a_welcome_message_with_their_name_is_displayed() {
	    System.out.println(driver.findElement(pom.welcome_text).getText());
	}


}
