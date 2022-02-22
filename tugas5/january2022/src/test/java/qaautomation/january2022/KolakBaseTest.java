package qaautomation.january2022;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import com.github.javafaker.Faker;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class KolakBaseTest {
	RequestSpecification commonJsonSpec = new RequestSpecBuilder()
			.setBaseUri("https://kolakproject.herokuapp.com").setContentType(ContentType.JSON).build().log()
			.all();
	
	public void registerUser() {
		Faker faker = new Faker();

		String registerPayload = "{\"username\": \"" + faker.name().username() + "\", \"password\": \""
				+ faker.internet().password() + "\", \"email\": \"" + faker.internet().safeEmailAddress()
				+ "\", \"phone number\": \"" + faker.phoneNumber().cellPhone() + "\"}";
		Response response = given().spec(commonJsonSpec).body(registerPayload).when().post("/register");
		assertEquals(response.getStatusCode(), 201);
	}
}
