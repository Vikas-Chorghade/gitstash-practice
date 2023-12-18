package StripeAPI;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import java.util.Hashtable;

import setUp.BaseTest;

public class Customer extends BaseTest {

	public static Response sendPostReqToCreateCustomerAPIwithvalidAuth(Hashtable<String, String> data) {
		Response response=given().auth().basic(config.getProperty("validSecreatKey"), "").formParam("email", data.get("e"))
				.formParam("description", data.get("d")).post(config.getProperty("customerAPIEndPoint"));
		return response;

	}

}
