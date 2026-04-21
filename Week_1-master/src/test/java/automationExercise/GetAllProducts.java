package automationExercise;

import io.restassured.RestAssured;

public class GetAllProducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RestAssured.given()
.when().get("https://automationexercise.com/api/productsList")
.then().log().all();
	}

}
