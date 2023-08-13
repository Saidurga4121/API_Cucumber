package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import io.cucumber.datatable.DataTable;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;


public class LoginDataTableMap 
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
		for(Map<String,String> map : credentials.asMaps(String.class,String.class)) 
		{
		 driver.findElement(By.name("email")).sendKeys(map.get("username"));
		 driver.findElement(By.name("password")).sendKeys(map.get("password"));
		 System.out.println("entered first time");
		 WebElement loginBtn =
				 driver.findElement(By.xpath("//div[text()='Login']"));
				 JavascriptExecutor js = (JavascriptExecutor)driver;
				 js.executeScript("arguments[0].click();", loginBtn);
		}
	}
	@Then("^click$")
	public void click()
	{
		
	}


}
