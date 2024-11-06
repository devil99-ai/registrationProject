package project.registration;

import org.openqa.selenium.By;

public class PageObject {
	public By create_Account = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a");
	public By first_name = By.xpath("//*[@id=\"firstname\"]");
	public By last_name = By.xpath("//*[@id=\"lastname\"]");
	public By email = By.xpath("//*[@id=\"email_address\"]");
	public By password = By.xpath("//*[@id=\"password\"]");
	public By confirm_passowrd = By.xpath("//*[@id=\"password-confirmation\"]");
	public By confirm_btn = By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button");
	public By confirmation_text = By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div");
	public By login_btn = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a");
	public By username = By.xpath("//*[@id=\"email\"]");
	public By Password = By.xpath("//*[@id=\"pass\"]");
	public By sign_in = By.xpath("//*[@id=\"send2\"]");
	public By welcome_text = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[1]/span");
}
