package crudOperations_PetStore;

import io.restassured.RestAssured;

public class GetPetsByStatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//Available
	/*	RestAssured.given()
		.when()
		.get("https://petstore.swagger.io/v2/pet/findByStatus?status=available")
		.then()
		.statusCode(200)
		.log()
		.all(); */
		
		//Pending
		RestAssured.given()
		.when()
		.get("https://petstore.swagger.io/v2/pet/findByStatus?status=pending")
		.then()
		.statusCode(200)
		.log()
		.all();
		
		//Sold
	/*	RestAssured.given()
		.when()
		.get("https://petstore.swagger.io/v2/pet/findByStatus?status=sold")
		.then()
		.statusCode(200)
		.log()
		.all();  */
		
	}

}
