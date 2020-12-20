package Utils;

public class GetPath {

    public static String APIPropertyFilePath = GetPath.getProjectPath()+"/src/main/resources/propertiesFiles/apiConfig.properties";
    public static String UIPropertyFilePath = GetPath.getProjectPath()+"/src/main/resources/propertiesFiles/uiConfig.properties";

    public static String BeanFile = GetPath.getProjectPath()+"/src/main/resources/spring.xml";
    public static String BASE_URI="https://reqres.in";
    public static String JsonFilePath = GetPath.getProjectPath()+"/src/main/resources/jsonFiles/";

    public static String getProjectPath()
    {
        return  System.getProperty("user.dir");
    }


}
