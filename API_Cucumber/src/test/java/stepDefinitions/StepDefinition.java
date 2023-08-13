package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.APIResources;
import resources.TestDataBuild;
import resources.Utils;
import POJO.DeletePlaceAPI;
import POJO.GoggleMapsSerialize;
import POJO.Location;
public class StepDefinition extends Utils
{
	RequestSpecification res;
	static Response response;
	TestDataBuild obj= new TestDataBuild();
	static String placeId=null;
	//
	@Given("AddPlace payload with {string} {string} {string}")
	public void add_place_payload(String name, String address, String language) throws IOException 
	{
		res=given().log().all().spec(requestSpecification())	           
				           .body(obj.addPlacePayload(name,address,language));
	}
	@When("User calls {string} Api with {string} http request")
	public void user_calls_api_with_http_request(String type,String method)
	{
		APIResources resource=APIResources.valueOf(type);
		String typeName=resource.getType();
		if(method.equalsIgnoreCase("POST"))
		{
			response=res.when().log().all().post(typeName);
			if(placeId== null)
			{
				placeId=getJsonValue(response,"place_id");
			}
		}
		else if(method.equalsIgnoreCase("GET"))
		{
			response=res.when().log().all().get(typeName);
		}	
//		else if(method.equalsIgnoreCase("DELETE"))
//		{
//			response=res.when().log().all().delete(typeName);
//		}
	}
	@Then("the api call got success with status {int}")
	public void the_api_call_got_success_with_status(Integer int1) 
	{
		response.getStatusCode();
		assertEquals(response.getStatusCode(),200);
		// placeId=getJsonValue(response,"place_id");
	}
	@Then("{string} in response body is {string}")
	public void in_response_body_is(String key, String value)
	{
		assertEquals(getJsonValue(response,key),value);
	}
	///////////////////////////////////////////////////////////////////////////////
	@Given("GETPlaceAPI payload")
	public void get_place_api_payload() throws IOException 
	{
		res=given().log().all().spec(requestSpecification()).queryParam("place_id", placeId);
	}
	@Given("DeletePlaceAPI payload")
	public void delete_place_api_payload() 
	{
		res= given().log().all().spec(requestBase).body(obj.deletePlacePayLoad(placeId));
	}
	
	


}
