package books;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.lessThan;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class putbook {

	 @Test
	    public void main() {

	        

	        given()
	        .contentType(ContentType.JSON)
			.body("{\r\n"
					+ "  \"id\": 0,\r\n"
					+ "  \"title\": \"string\",\r\n"
					+ "  \"description\": \"string\",\r\n"
					+ "  \"pageCount\": 0,\r\n"
					+ "  \"excerpt\": \"string\",\r\n"
					+ "  \"publishDate\": \"2026-03-12T03:12:42.990Z\"\r\n"
					+ "}")
			.pathParam("id","1")

	        .when()
	            .put("https://fakerestapi.azurewebsites.net/api/v1/Books/{id}")

	        .then()
	            .log().all()
	            .statusCode(200)
	            .assertThat()
	           
	            .time(lessThan(5000L))
	            .statusLine(containsString("HTTP"));
	    }
}
