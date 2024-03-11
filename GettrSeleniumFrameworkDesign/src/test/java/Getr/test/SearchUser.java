package Getr.test;

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

import Getr.AbstractComponents.AbstractComponents;
import Getr.PageObjects.OnboardingPage;
import Getr.PageObjects.SearchResultsPage;
import Getr.PageObjects.TimelinePage;
import Getr.testcomponents.BaseTest;
import Getr.testcomponents.Retry;

public class SearchUser extends BaseTest{
	static String username = "App452";

	@Test (retryAnalyzer=Retry.class)
public void SearchUser() throws IOException, InterruptedException
{
		
		TimelinePage timeline =ob.Login(username, "Indium@123");
		String welcometext = timeline.loginsuccesstoast();
		SearchResultsPage sr =timeline.assertion(welcometext, username);
		Thread.sleep(5000);
		sr.clicksearchicon();
		sr.Searchresults();
		sr.searchuser("Gettr");
		sr.searchresults();
		
	}
}
