package qaautomation.january2022;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseAPITest {
	RequestSpecification commonJsonSpec = new RequestSpecBuilder().setBaseUri("https://api-staging-builder.engineer.ai")
			.setContentType(ContentType.JSON).build().log().all();
	RequestSpecification loginJsonSpec;
	String token;

	@BeforeMethod
	public void login() {
		String loginPayload = "{\"email\": \"jogidemo321@gmail.com\", \"password\": \"builder123\"}";
		Response response = given().spec(commonJsonSpec).body(loginPayload).when().post("/users/sign_in");
		assertEquals(response.getStatusCode(), 200);
		token = response.jsonPath().get("user.authtoken");
		loginJsonSpec = new RequestSpecBuilder().setBaseUri("https://api-staging-builder.engineer.ai")
				.setContentType(ContentType.JSON).addHeader("authtoken", token).build().log().all();
	}
}
