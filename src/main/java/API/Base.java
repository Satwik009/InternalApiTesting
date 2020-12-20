package API;

import Utils.ExtentReportListner;
import Utils.GetPath;
import io.restassured.RestAssured;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

@Listeners(ExtentReportListner.class)
public class Base extends ExtentReportListner{



    RestAssuredFunction rs;

    @BeforeClass
    public void setURI()
    {
        RestAssured.baseURI = GetPath.BASE_URI;
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
         this.rs = context.getBean("restAssured" ,RestAssuredFunction.class);

    }

}
