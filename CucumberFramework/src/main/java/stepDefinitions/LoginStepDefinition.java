//package stepDefinitions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//
//
//public class LoginStepDefinition 
//{
//	WebDriver driver;
//	@Given("^open browser$")
//	public void open_browser()
//	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\003KT8744\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
//		driver= new ChromeDriver();
//		System.out.println("driver opened");
//	}
//	
//	@When("^open url$")
//	public void open_url() throws InterruptedException
//	{
//		driver.get("https://www.freecrm.com/index.html");
//		driver.findElement(By.xpath("//a[text()='Login']")).click();
//	}
//	
//	@Then("^enter username and password$")
//	public void enter_username_password(String uname, String pwd) throws InterruptedException
//	{
//		 driver.findElement(By.name("email")).sendKeys(uname);
//		 driver.findElement(By.name("password")).sendKeys(pwd);
//	}
//	
//	@Then("^click login$")
//	public void click()
//	{
//		WebElement loginBtn =
//				 driver.findElement(By.xpath("//div[text()='Login']"));
//				 JavascriptExecutor js = (JavascriptExecutor)driver;
//				 js.executeScript("arguments[0].click();", loginBtn);
//	}
//	@Then("^click contact icon$")
//	public void clickcontacticon() throws InterruptedException
//	{
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//a[text()='helo world']")).click();
//	}
//	@Then("^user creates \"(.*)\" and \"(.*)\"$")
//	public void entername(String first_name, String last_name)
//	{
////		driver.findElement(By.name("first_name")).sendKeys(first_name);
////		driver.findElement(By.name("last_name")).sendKeys(last_name);
//	}
//	
//	
//
//}
