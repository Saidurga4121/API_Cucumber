package resources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Utils 
{
	public static RequestSpecification requestBase;
	ResponseSpecification responseBase;
	
	
	public RequestSpecification requestSpecification() throws IOException
	{
		if(requestBase== null)
		{
			PrintStream log= new PrintStream(new FileOutputStream("logging.txt"));
			requestBase =new RequestSpecBuilder()
						.setBaseUri(getGlobalValue("baseUrl"))
						.addQueryParam("key", "qaclick123")
						.addFilter(RequestLoggingFilter.logRequestTo(log))
						.addFilter(ResponseLoggingFilter.logResponseTo(log))
						.setContentType(ContentType.JSON)
					    .build();
			return requestBase;
		}
		return requestBase;
	}
	public ResponseSpecification responseSpecification()
	{
		responseBase= new ResponseSpecBuilder()
					  .expectStatusCode(200)
					  .expectContentType(ContentType.JSON)
					  .build();
		return responseBase;
	}
	
	public String getGlobalValue(String key) throws IOException
	{
		Properties prop= new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\003KT8744\\eclipse-cucumber\\API_Cucumber\\src\\test\\java\\resources\\global.properties");
		prop.load(fis);
		//
		return prop.getProperty(key);	
	}

	public static String getJsonValue(Response response,String value)
	{
		System.out.println("iam started");
		String repose=response.asString();
		System.out.println(repose+" iam converted");
		JsonPath js= new JsonPath(repose);
		String text=js.get(value);
		System.out.println(text+" iam the text");
		return text;
	}

}
