package activity;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class PostAnActivity {
@Test
public void createAct()
{
	given().contentType(ContentType.JSON).body("{\r\n"
			+ "  \"id\": 0,\r\n"
			+ "  \"title\": \"SampleProject111\",\r\n"
			+ "  \"dueDate\": \"2026-03-12T02:46:47.637Z\",\r\n"
			+ "  \"completed\": true\r\n"
			+ "}")
	
	.when().post("https://fakerestapi.azurewebsites.net/api/v1/Activities")
	
	.then().log().all().assertThat().statusCode(200).statusLine(containsString("HTTP")).log().all();
}
}
