package authors;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class PostAnAuthor {
@Test
public void createAct()
{
	given().contentType(ContentType.JSON).body("{\r\n"
			+ "  \"id\": 12345,\r\n"
			+ "  \"idBook\": 1234567,\r\n"
			+ "  \"firstName\": \"The\",\r\n"
			+ "  \"lastName\": \"Book\"\r\n"
			+ "}")
	
	.when().post("https://fakerestapi.azurewebsites.net/api/v1/Authors")
	
	.then().log().all().assertThat().statusCode(200).statusLine(containsString("HTTP")).log().all();
}
}
