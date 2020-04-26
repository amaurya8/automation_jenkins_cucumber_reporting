package stepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;

public class Hooks {

	public static WebDriver driver;
	@After("@NegativeTest")
	public void afterScenario(Scenario scenario) {
//		System.out.println("In hooks");
//		System.out.println(scenario.getName());
//		System.out.println(scenario.getStatus());
	}

	@Before
	public void beforeScenario(){
		System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://wordpress.com/");
		System.out.println("executing before scenario hooks");
	}
}
