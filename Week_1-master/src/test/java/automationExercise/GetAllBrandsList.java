package automationExercise;

import io.restassured.RestAssured;

public class GetAllBrandsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RestAssured.given()
.when().get("https://automationexercise.com/api/brandsList")
.then().log().all();
	}

}
