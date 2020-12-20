package API;

import Utils.GetPath;
import Utils.ReadPropertyFile;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RestAssuredFunction extends Base {


    public Response getRequest(String endPoints) throws Exception {

        Response response = RestAssured.get(RestAssured.baseURI + ReadPropertyFile.getValueForApiConfig(endPoints, GetPath.APIPropertyFilePath));

        return response;
    }


    @Test
    public Response postRequest(String endPoints, String statusCode, String body) throws Exception {


        Response response = RestAssured.given().body(body).post(ReadPropertyFile.getValueForApiConfig(endPoints, GetPath.APIPropertyFilePath));

        response.getBody().prettyPrint().toString();

        Assert.assertEquals(response.getStatusCode(), statusCode);
        return response;
    }

}
