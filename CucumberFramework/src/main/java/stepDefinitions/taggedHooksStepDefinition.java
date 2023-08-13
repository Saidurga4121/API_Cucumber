package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class taggedHooksStepDefinition 
{
	// global hook
	@Before(order=-1)
	public void firstStep()
	{
		System.out.println("launch browser");
		System.out.println("open url");
		System.out.println("enter login details and login");
	}
	@After(order=0)
	public void quit()
	{
		System.out.println("close browser");
	}
	@Before(order=1)
	public void firstStep1()
	{
		System.out.println("launch browser");
		System.out.println("open url");
		System.out.println("enter login details and login");
	}
	@After(order=1)
	public void quit1()
	{
		System.out.println("close browser");
	}
	@Before("@First")
	public void onlyForFirst()
	{
		System.out.println("before clicking on contact.......1");
		
	}
	@After("@First")
	public void onlyForFirstAfter()
	{
		System.out.println("contact got saved......1");
	}
	@Before("@Second")
	public void onlyForSecond()
	{
		System.out.println("before clicking on contact.......2");
		
	}
	@After("@Second")
	public void onlyForSecondAfter()
	{
		System.out.println("contact got saved......2");
	}
	@Given("^click contact icon$")
	public void click_contact_icon()
	{
		System.out.println("click on contact icon............1");
	}
	@Then("^user creates contact$")
	public void  user_creates_contact()
	{
		System.out.println("click on contact icon..........1");
	}
	@Given("^click contact icon1$")
	public void click_contact_icon1()
	{
		System.out.println("click on contact icon.....2");
	}
	@Then("^user creates contact1$")
	public void  user_creates_contact1()
	{
		System.out.println("click on contact icon.....2");
	}
	
	


}
