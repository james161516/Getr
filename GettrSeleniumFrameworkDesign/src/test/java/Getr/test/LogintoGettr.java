package Getr.test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Getr.PageObjects.OnboardingPage;
import Getr.PageObjects.TimelinePage;
import Getr.testcomponents.BaseTest;
import Getr.testcomponents.Retry;

public class LogintoGettr extends BaseTest {
	static String username = "App452";
	
	WebDriver driver;

	@Test (retryAnalyzer=Retry.class)
	public void LoginToApplication() throws InterruptedException, IOException
	{
		TimelinePage timeline = ob.Login(username, "Indium@123");
		String welcometext = timeline.loginsuccesstoast();
		timeline.assertion(welcometext, username);

	}

}
