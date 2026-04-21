package activity;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PutActivity {
@Test
public void updateAnActivity()
{
	given().contentType(ContentType.JSON).body("{\r\n"
			+ "  \"id\": 25,\r\n"
			+ "  \"title\": \"SampleProject101\",\r\n"
			+ "  \"dueDate\": \"2026-03-12T02:46:47.637Z\",\r\n"
			+ "  \"completed\": true\r\n"
			+ "}")
	
	.when().put("https://fakerestapi.azurewebsites.net/api/v1/Activities/25")
	
	.then().log().all().assertThat().statusCode(200).statusLine(containsString("HTTP")).log().all();
}
}
