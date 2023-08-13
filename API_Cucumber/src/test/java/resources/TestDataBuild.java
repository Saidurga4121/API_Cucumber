package resources;

import java.util.ArrayList;
import java.util.List;

import POJO.DeletePlaceAPI;
import POJO.GoggleMapsSerialize;
import POJO.Location;

public class TestDataBuild 
{
	GoggleMapsSerialize obj= new GoggleMapsSerialize();
	DeletePlaceAPI deleteAPI= new DeletePlaceAPI();
	
	public GoggleMapsSerialize addPlacePayload(String name, String address, String language)
	{
		
		Location loc= new Location();
		//
		obj.setAccuracy(50);
		obj.setAddress(address);
		obj.setLanguage(language);
		//
		loc.setLat(-38.383494);
		loc.setLng(33.427362);
		obj.setLocation(loc);
		obj.setName(name);
		obj.setPhone_number("(+91) 983 893 3937");
		//
		List<String> myList= new ArrayList<String>();
		myList.add("shoe park");
		myList.add("shop");
		obj.setTypes(myList);
		obj.setWebsite("http://google.com");
		return obj;
	}
	
	public DeletePlaceAPI deletePlacePayLoad(String placeId)
	{
		deleteAPI.setPlaceId(placeId);
		return deleteAPI;
	}

}
