package authors;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
public class GetAuthors {
@Test
public void fetchAnAct()
{
	given()
	
	.when().get("https://fakerestapi.azurewebsites.net/api/v1/Authors")
	
	.then().log().all();
}
}