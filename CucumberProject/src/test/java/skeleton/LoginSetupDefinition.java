package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.driver.DriverUtility;
import com.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginSetupDefinition {
	WebDriver driver;
	
	@Given("the URL of demo web shop application")
	public void the_URL_of_demo_web_shop_application() {
	    // Write code here that turns the phrase above into concrete actions
	    driver=DriverUtility.supplyDriver("chrome");
	    PageFactory.initElements(driver, LoginPage.class);//page obj creation
	    driver.manage().window().maximize();
	    driver.get("http://demowebshop.tricentis.com/login");
	}

	@When("user enters {word} as {word} username")
	public void user_enters_kannan_gmail_com_as_username(String email,String usertype) {
	    //driver.findElement(By.id("Email")).sendKeys(email);
	LoginPage.email.sendKeys(email);
	}

	@When("user enters {word} as password")
	public void user_enters_test_as_password(String password) {
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.id("Password")).sendKeys(password);
		LoginPage.password.sendKeys(password);
	}

	@Then("user is in valid page")
	public void user_is_in_valid_page() {
		//driver.findElement(By.cssSelector("input[value='Log in']")).click();
		LoginPage.Login.click();
		boolean flag=driver.findElement(By.linkText("Log out")).isDisplayed();
		Assert.assertTrue(flag);
		
	
	    // Write code here that turns the phrase above into concrete actions
	    
	}



}
