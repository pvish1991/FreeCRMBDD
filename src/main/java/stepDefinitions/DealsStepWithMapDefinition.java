package stepDefinitions;

	//import java.util.List;
import java.util.Map;

import org.junit.Assert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
   import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;

	import cucumber.api.DataTable;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;

	public class DealsStepWithMapDefinition {
		
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
			Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small");
			Thread.sleep(2000);
			
		}
		
		@Then("^user clicks on login link$")
		public void user_clicks_on_login_link() throws InterruptedException{
		    driver.findElement(By.xpath("//*[contains(text(), 'Log In')]")).click();
		    Thread.sleep(2000);
		   
		}
		
		@Then("^user enters username and password$")
		public void user_enters_username_and_password(DataTable Credentials ){
			for(Map<String, String> data : Credentials.asMaps(String.class, String.class)){
		    driver.findElement(By.name("email")).sendKeys(data.get("username"));
		    driver.findElement(By.name("password")).sendKeys(data.get("password"));
		}
			
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
		
		@Then("^user moves to new deal page$")
		public void user_hits_on_contact_page () throws InterruptedException {
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath( "//i[@class='money icon']"))).build().perform();
			driver.findElement(By.xpath( "//i[@class='money icon']")).click();
			//Thread.sleep(2000);
			
		}
		
		@Then("^user clicks on create button$")
		public void user_clicks_on_create_button() throws Throwable {
		driver.findElement(By.xpath("//button[contains(text(), 'Create')]")).click();  
		Thread.sleep(2000);
		}
		
		 @Then("^user enters deal details$")
		 public void user_enters_contacts_details(DataTable dealData) throws InterruptedException{
			 for(Map<String, String> data : dealData.asMaps(String.class, String.class)) {
			 driver.findElement(By.name("title")).sendKeys(data.get("title"));
			 driver.findElement(By.name("probability")).sendKeys(data.get("probability"));
			 driver.findElement(By.name("amount")).sendKeys(data.get("amount"));
			 driver.findElement(By.name("commission")).sendKeys(data.get("commission"));
			 
			 
			 driver.findElement(By.xpath("//i[@class='save icon']")).click(); //save button
			 Thread.sleep(2000);
			 
			 Actions action = new Actions(driver);
				action.moveToElement(driver.findElement(By.xpath( "//span[contains(text(),'Deals')]"))).build().perform();
				driver.findElement(By.xpath( "//span[contains(text(),'Deals')]")).click();
				driver.findElement(By.xpath("//button[contains(text(), 'Create')]")).click();  
			 
		 }
		 
		 }
		@Then ("^Close the browser$")
			public void Close_the_browser() {
				driver.quit();
			}
	}


