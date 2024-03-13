package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {
	
	private WebDriver driver;
	public SignupPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//------------ Obj repo ----------------
	private By username_txtbox = By.xpath("//input[@id='sign-username']");
	private By password_txtbox = By.xpath("//input[@id='sign-password']");
	private By signup_btn = By.xpath("//button[contains(text(),'Sign up')]");
	
	
	//------------ Action methods ----------
	public void enterUsername(String username)
	{
		driver.findElement(username_txtbox).sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(password_txtbox).sendKeys(password);
	}
	
	public void clickOnSignupButton()
	{
		driver.findElement(signup_btn).click();
	}

}
