package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStepDefinition {


	WebDriver driver;
	
	
	@Given("^User is already on landing Page$")
	public void user_already_login_page() {
		System.setProperty("webdriver.chrome.driver", "E:\\Webdrivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.demo.guru99.com/V4/");
	
	} 
	
	@When("^Title of the login page is Guru99 Bank Home Page$")
	public void title_login_page_Guru99_Bank_Home_Page() {
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		Assert.assertEquals("Guru99 Bank Home Page", pageTitle);
	}
	
	@Then("^User enters username and password$")
	public void user_enters_username_and_password() {
		driver.findElement(By.name("uid")).sendKeys("mngr284732");
		driver.findElement(By.name("password")).sendKeys("sYzydat");
	}

	@And ("^User clicks on Login button$")
	public void user_clicks_on_Login_button() {
		driver.findElement(By.name("btnLogin")).click();
	}
	
	@Then("^User lands on Home page$")
	public void user_lands_on_Home_page(){
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		Assert.assertEquals("Guru99 Bank Manager HomePage", pageTitle);
	}

	@Then ("^Close the browser$")
	public void close_the_browser() {
		driver.close();
	}
}
