package crudOperations_PetStore;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PostPet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Pre-Condition
		RestAssured.given().contentType(ContentType.JSON).body("{\"id\":0,"
						+ "\"category\":{\"id\":0,\"name\":\"string\"},"
						+ "\"name\":\"Jimmy\","
						+ "\"photoUrls\":[\"string\"],"
						+ "\"tags\":[{\"id\":0,\"name\":\"string\"}],"
						+ "\"status\":\"available\"}")

		//HTTP Method
		.when().post("https://petstore.swagger.io/v2/pet")
		
		
		//Response
		.then().log().all();
	}

}
