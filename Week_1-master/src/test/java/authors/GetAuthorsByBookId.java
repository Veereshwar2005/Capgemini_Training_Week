package authors;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetAuthorsByBookId {
	@Test
	public void fetchAnSingleActivity()
	{
		given()
		
		.when().get("https://fakerestapi.azurewebsites.net​/api​/v1​/Authors​/authors​/books​/10")
		
		.then().log().all().assertThat().statusCode(200).statusLine(containsString("HTTP")).time(lessThan(5000L));
	}

}
