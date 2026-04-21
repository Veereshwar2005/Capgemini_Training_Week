package users;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.lessThan;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class putuser {

	 @Test
	    public void main() {

	        

	        given()
	        .contentType(ContentType.JSON)
			.body("{\r\n"
					+ "  \"id\": 0,\r\n"
					+ "  \"userName\": \"string\",\r\n"
					+ "  \"password\": \"string\"\r\n"
					+ "}")
			.pathParam("id","1")

	        .when()
	            .put("https://fakerestapi.azurewebsites.net/api/v1/Users/{id}")

	        .then()
	            .log().all()
	            .statusCode(200)
	            .assertThat()
	           
	            .time(lessThan(5000L))
	            .statusLine(containsString("HTTP"));
	    }
}
