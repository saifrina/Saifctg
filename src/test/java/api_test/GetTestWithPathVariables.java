package api_test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetTestWithPathVariables extends BaseAPIClass{

    @Test
    public void getSingleUser() {
        LOGGER.info(testCaseName);

        // Specify the base URL or endpoint of the REST API
        RestAssured.baseURI = "https://reqres.in/api/users";


        //Get the RequestSpecification of the request that want to send to the server.
        //The server is specified in the BaseURI that we have specified in the step.
        RequestSpecification httpRequest = RestAssured.given();

        //Make a request to the server by specify the HTTP Method type and the method
        //This will return the Response from the server. Store the response in a variable.
        String id = "23";
        Response response = httpRequest.request(Method.GET, id);
        LOGGER.debug(response.getBody().asPrettyString());

        //Assert that the correct response status code is returned.
        Assert.assertEquals(response.getStatusCode(), 404);

        //Get the jsonPath object from the response
        JsonPath jsonPath = response.jsonPath();
        String actualResponse = jsonPath.get().toString();

        //Validate that response body is empty

        Assert.assertEquals(actualResponse, "{}");
        LOGGER.info("---------END Test: Attempt to retrieve user with invalid id--------");
    }
}
