package authors;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PutAuthor {
@Test
public void updateAnActivity()
{
	given().contentType(ContentType.JSON).body("{\r\n"
			+ "  \"id\": 605,\r\n"
			+ "  \"idBook\": 1124,\r\n"
			+ "  \"firstName\": \"The first\",\r\n"
			+ "  \"lastName\": \"and the Last\"\r\n"
			+ "}")
	
	.when().put("https://fakerestapi.azurewebsites.net/api/v1/Authors/605")
	
	.then().log().all().assertThat().statusCode(200).statusLine(containsString("HTTP")).log().all();
}
}
