package activity;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
public class GetActivities {
@Test
public void fetchAnAct()
{
	given()
	
	.when().get("https://fakerestapi.azurewebsites.net/api/v1/Activities")
	
	.then().log().all();
}
}