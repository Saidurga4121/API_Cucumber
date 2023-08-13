Feature: Validating Place API'S

@AddPlace
Scenario Outline: Verify if place is being succesfully added to AddPlaceAPI
				  Given AddPlace payload with "<name>" "<address>" "<Language>"
				  When  User calls "AddPlaceAPI" Api with "POST" http request
				  Then the api call got success with status 200
				  And "status" in response body is "OK"
				  And "scope" in response body is "APP"
Examples:
| name| address| Language|
| sai durga| anaparthi| Telugu|
#| Kartheek| BBpuram| English|

@GETPlace
Scenario:  Verify if place is being succesfully fetched using GETPlaceAPI
					Given GETPlaceAPI payload 
				  When  User calls "GetPlaceAPI" Api with "GET" http request
				  Then the api call got success with status 200
				  
@DeletePlace
Scenario:  Verify if place is being succesfully deleted using DeletePlaceAPI
					Given DeletePlaceAPI payload 
				  When  User calls "DeletePlaceAPI" Api with "POST" http request
				  Then the api call got success with status 200
				  And "status" in response body is "OK"