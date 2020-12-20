package API;

import JsonUtils.JsonUtility;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class UserRelatedTestCases extends RestAssuredFunction {


    @Test
    public  void getListOfUser() throws Exception
    {
        RestAssuredFunction rs = new RestAssuredFunction();
        Response response =rs.getRequest("listUsers", 200);
        response.getBody().prettyPrint();
    }

    @Test
    public  void createUser() throws Exception
    {
        JsonUtility js = new JsonUtility();
        RestAssuredFunction rs = new RestAssuredFunction();
        Response response =rs.postRequest("createUsers", 201, js.readJsonAndConvertIntoString("createUser.json"));
        response.getBody().prettyPrint();
    }
}
