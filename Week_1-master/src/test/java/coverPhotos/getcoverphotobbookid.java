package coverPhotos;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.lessThan;

import org.testng.annotations.Test;

public class getcoverphotobbookid {

	 @Test
	    public void main() {

	        

	        given()
	        	.pathParam("idBook", "1")


	        .when()
	            .get("https://fakerestapi.azurewebsites.net/api/v1/CoverPhotos/books/covers/{idBook}")

	        .then()
	            .log().all()
	            .statusCode(200)
	            .assertThat()
	           
	            .time(lessThan(5000L))
	            .statusLine(containsString("HTTP"));
	    }

}
