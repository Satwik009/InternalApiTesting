package API;

import Utils.GetPath;
import Utils.ReadPropertyFile;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

public class RestAssuredFunction extends Base {


    public Response getRequest(String endPoints,int status) throws Exception {

        Response response = RestAssured.get(RestAssured.baseURI + ReadPropertyFile.getValueForApiConfig(endPoints, GetPath.APIPropertyFilePath));
          int statusCode=  response.getStatusCode();
        Assert.assertEquals(statusCode, status);

        return response;
    }


    public Response postRequest(String endPoints, int statusCode, String body) throws Exception {


        Response response = RestAssured.given().body(body).post(ReadPropertyFile.getValueForApiConfig(endPoints, GetPath.APIPropertyFilePath));

        response.getBody().prettyPrint().toString();

        Assert.assertEquals(response.getStatusCode(), statusCode);
        return response;
    }

}
