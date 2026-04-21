package authors;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;



import static io.restassured.RestAssured.*;

public class DeleteAuthor {
@Test
public void deleteAnActivity()
{
given()
	
	.when().delete("https://fakerestapi.azurewebsites.net/api/v1/Authors/605")
	
	.then().log().all().assertThat().statusCode(200).statusLine(containsString("HTTP")).time(lessThan(5000L));
}
}
