package testlayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageLayer.HomePage;
import pageLayer.SignupPage;

public class SignupTestCase {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		HomePage homepage_obj = new HomePage(driver);
		SignupPage signuppage_obj = new SignupPage(driver);
		
		homepage_obj.clickOnSignupLink();
		signuppage_obj.enterUsername("testacc24");
		signuppage_obj.enterPassword("Test@1234");
		signuppage_obj.clickOnSignupButton();
		
	}
}
