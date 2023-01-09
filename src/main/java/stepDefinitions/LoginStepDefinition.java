/*package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	
	WebDriver driver;
	
	@Given("^user is already on login Page$")
	public void user_already_on_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\QA\\SeleniumJars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://freecrm.com/");
		
	}
	
	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_free_CRM() throws InterruptedException {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Free CRM with Free calling and auto dialing features");
		Thread.sleep(2000);
		
	}
	
	@Then("^user clicks on login link$")
	public void user_clicks_on_login_link() throws InterruptedException{
	    driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
	    Thread.sleep(2000);
	   
	}
		
	 @Then("^user enters \"(.*)\" and \"(.*)\"$")
	 public void user_enters_username_and_password(String username, String password){
		 driver.findElement(By.name("email")).sendKeys(username);
		 driver.findElement(By.name("password")).sendKeys(password);
 }
		
		
		@Then("^user clicks on login button$")
		public void user_clicks_on_login_button() throws InterruptedException{
		   driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		   Thread.sleep(3000);
		   
		}
		
		@Then("^user is on home page$")
		public void user_is_on_home_page() throws InterruptedException {
			
			String title = driver.getTitle();
			System.out.println("Home Page title ::"+title);
			Assert.assertEquals("Cogmento CRM", title);
			Thread.sleep(3000);
		}
		
		@Then("^user hits on contact page$")
		public void user_hits_on_contact_page () throws InterruptedException {
			driver.findElement(By.xpath( "//i[@class='users icon']")).click();
			Thread.sleep(2000);
			
		}
		
		@Then("^user clicks on create button$")
		public void user_clicks_on_create_button() throws Throwable {
		driver.findElement(By.xpath("//button[contains(text(), 'Create')]")).click();  
		Thread.sleep(2000);
		}

		
		
		@Then("^user enters contact details \"(.*)\" and \"(.*)\"$")
		public void user_enters_contact_details(String firstname, String lastname) {
			driver.findElement(By.name("first_name")).sendKeys(firstname);
			driver.findElement(By.name("last_name")).sendKeys(lastname);
		}
		
		
		@Then ("^Close the browser$")
		public void Close_the_browser() {
			driver.quit();
		}
		
		
		
}*/
