package testlayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageLayer.HomePage;
import pageLayer.LoginPage;

public class LoginTestCase {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		HomePage homepage_obj = new HomePage(driver);
		LoginPage loginpage_obj = new LoginPage(driver);
		
		homepage_obj.clickOnLoginLink();
		loginpage_obj.enterUserName("testacc3");
		loginpage_obj.enterPassword("Test");
		loginpage_obj.clickOnLoginButton();

	}

}
