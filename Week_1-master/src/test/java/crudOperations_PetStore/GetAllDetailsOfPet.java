package crudOperations_PetStore;

import io.restassured.RestAssured;

public class GetAllDetailsOfPet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		//Pre-Conditions
		RestAssured.given()
         
		
		
		//HTTP Method
		.when()
		.get("https://petstore.swagger.io/v2/pet/9223372036854775807")
		
		
		//Response
		.then()
		.statusCode(200)
		.log()
		.all();
         
	}

}
