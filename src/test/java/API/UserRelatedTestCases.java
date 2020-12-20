package API;

import JsonUtils.JsonUtility;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class UserRelatedTestCases extends Base {

    Response response;

    @Test
    public void getListOfUser() throws Exception {
        response = rs.getRequest("listUsers", 200);
        response.getBody().prettyPrint();
    }

    @Test
    public void createUser() throws Exception {
        JsonUtility js = new JsonUtility();
        response = rs.postRequest("createUsers", 201, js.readJsonAndConvertIntoString("createUser.json"));
        response.getBody().prettyPrint();
    }
}
