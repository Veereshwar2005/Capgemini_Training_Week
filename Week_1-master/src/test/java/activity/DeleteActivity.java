package activity;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;



import static io.restassured.RestAssured.*;

public class DeleteActivity {
@Test
public void deleteAnActivity()
{
given()
	
	.when().delete("https://fakerestapi.azurewebsites.net/api/v1/Activities/25")
	
	.then().log().all().assertThat().statusCode(204).statusLine(containsString("HTTP")).time(lessThan(5000L));
}
}
