package automationExercise;

import io.restassured.RestAssured;

public class DeleteUserAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.given()
		.when().delete(" https://automationexercise.com/api/deleteAccount")
		.then().log().all();
	}

}
