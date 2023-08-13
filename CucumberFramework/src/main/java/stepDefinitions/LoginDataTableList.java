package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import io.cucumber.datatable.DataTable;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;


public class LoginDataTableList 
{
	WebDriver driver;
	@Given("^open browser$")
	public void open_browser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\003KT8744\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
		driver= new ChromeDriver();
		System.out.println("driver opened");
	}
	
	@When("^open url$")
	public void open_url() throws InterruptedException
	{
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
	}
	
	@Then("^user enters username and password$")
	public void enter_username_password(DataTable credentials) throws InterruptedException
	{
		 List<List<String>> list=credentials.cells();
		 driver.findElement(By.name("email")).sendKeys(list.get(0).get(0));
		 driver.findElement(By.name("password")).sendKeys(list.get(0).get(1));
	}
	@Then("^click$")
	public void click()
	{
		WebElement loginBtn =
				 driver.findElement(By.xpath("//div[text()='Login']"));
				 JavascriptExecutor js = (JavascriptExecutor)driver;
				 js.executeScript("arguments[0].click();", loginBtn);
	}


}
