package API;

import Utils.ExtentReportListner;
import Utils.GetPath;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

@Listeners(ExtentReportListner.class)
public class Base extends ExtentReportListner{


    @BeforeClass
    public void setURI()
    {
        RestAssured.baseURI = GetPath.BASE_URI;

    }
}
