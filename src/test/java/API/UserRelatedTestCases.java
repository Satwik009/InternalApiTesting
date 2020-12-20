package API;

import com.relevantcodes.extentreports.LogStatus;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class UserRelatedTestCases extends Base {

    Response response;

    @Test
    public void getListOfUser() throws Exception {
        test.log(LogStatus.INFO, "test case started");
        response = rs.getRequest("listUsers", 200);
        test.log(LogStatus.INFO, "response is :"+response.getBody().prettyPrint().toString());
        test.log(LogStatus.INFO, "test case finished");
        test.log(LogStatus.PASS, "test case passed");


    }

    @Test
    public void createUser() throws Exception {
        test.log(LogStatus.INFO, "test case started");
        response = rs.postRequest("createUsers", 201, js.readJsonAndConvertIntoString("createUser.json"));
        response.getBody().prettyPrint();
        test.log(LogStatus.INFO, "test case finished");
        test.log(LogStatus.PASS, "test case passed");
    }
}
