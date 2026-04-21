package automationExercise;

import io.restassured.RestAssured;

public class DeleteVerifyLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.given()
		.when().delete("https://automationexercise.com/api/verifyLogin")
		.then().log().all();
	}

}
