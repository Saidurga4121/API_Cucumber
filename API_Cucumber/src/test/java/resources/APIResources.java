package resources;

public enum APIResources 
{
	
//	public String addPlaceAPI="/maps/api/place/add/json";
//	public String getAddPlaceAPI()
//	{
//		return addPlaceAPI;
//	}
	AddPlaceAPI("/maps/api/place/add/json"),
	GetPlaceAPI("/maps/api/place/get/json"),
	DeletePlaceAPI("/maps/api/place/delete/json");
	
	private String type;
	APIResources(String type1)
	{
		this.type=type1;
	}
	
	public String getType()
	{
		return type;
	}
	
	

}
