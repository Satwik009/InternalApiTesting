package API;

import Utils.GetPath;
import Utils.ReadPropertyFile;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAssuredFunction {


    public Response getRequest(String endPoints) throws Exception
    {
        RestAssured.baseURI=GetPath.BASE_URI;
        Response response=RestAssured.get( RestAssured.baseURI+ReadPropertyFile.getValueForApiConfig(endPoints, GetPath.APIPropertyFilePath));

        return  response;
    }



    public void postRequest() throws Exception{

        RestAssured.baseURI=GetPath.BASE_URI;

        RestAssured.given().p

                //post(RestAssured.baseURI+ReadPropertyFile.getValueForApiConfig("createUsers", GetPath.APIPropertyFilePath))

        Response response=RestAssured.get( RestAssured.baseURI+ReadPropertyFile.getValueForApiConfig("createUsers", GetPath.APIPropertyFilePath));

    }

}
