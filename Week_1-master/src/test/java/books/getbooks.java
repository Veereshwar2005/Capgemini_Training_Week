package books;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.lessThan;

import org.testng.annotations.Test;

public class getbooks {
	
	 @Test
	    public void main() {

	        given()
	       
	        .when()
	            .get("https://fakerestapi.azurewebsites.net/api/v1/Books")

	        .then()
	            .log().all()
	            .statusCode(200)
	            .assertThat()
	           
	            .time(lessThan(5000L))
	            .statusLine(containsString("HTTP"));
	    }


}
