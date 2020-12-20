package API;

import Utils.GetPath;
import Utils.ReadPropertyFile;
import com.relevantcodes.extentreports.LogStatus;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

public class RestAssuredFunction extends Base {
    int statusCode;
    public Response getRequest(String endPoints, int status) throws Exception {

        Response response = RestAssured.get(ReadPropertyFile.getValueForApiConfig(endPoints, GetPath.APIPropertyFilePath));
         statusCode = response.getStatusCode();
        if (status != statusCode) {
            test.log(LogStatus.FAIL, "test case failed status code mismatch, recieved status is " + statusCode + "expected status was" + status);
        }
        Assert.assertEquals(statusCode, status);
        return response;
    }


    public Response postRequest(String endPoints, int status, String body) throws Exception {

        Response response = RestAssured.given().body(body).post(ReadPropertyFile.getValueForApiConfig(endPoints, GetPath.APIPropertyFilePath));
        response.getBody().prettyPrint().toString();
         statusCode = response.getStatusCode();

        if (status != statusCode) {
            test.log(LogStatus.FAIL, "test case failed status code mismatch, recieved status is " + statusCode + "expected status was" + status);
        }
        Assert.assertEquals(response.getStatusCode(), statusCode);
        return response;
    }

}
