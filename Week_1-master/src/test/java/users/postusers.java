package users;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.lessThan;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class postusers {

	 @Test
	    public void main() {

	        

	        given()
	        .contentType(ContentType.JSON)
			.body("{\r\n"
					+ "  \"id\": 0,\r\n"
					+ "  \"userName\": \"string\",\r\n"
					+ "  \"password\": \"string\"\r\n"
					+ "}")


	        .when()
	            .post("https://fakerestapi.azurewebsites.net/api/v1/Users")

	        .then()
	            .log().all()
	            .statusCode(200)
	            .assertThat()
	           
	            .time(lessThan(5000L))
	            .statusLine(containsString("HTTP"));
	    }
}
