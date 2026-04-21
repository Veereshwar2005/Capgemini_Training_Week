package crudOperations_PetStore;

import io.restassured.RestAssured;

public class DeletePetById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Pre-Conditions
		RestAssured.given()
		
		//HTTP Method
		.when()
		.delete("https://petstore.swagger.io/v2/pet/9223372036854775807")
		
		//Response
		.then()
		.log().all();
	}

}
