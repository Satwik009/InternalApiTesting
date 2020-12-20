package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertyFile {

    /**
     *
     * PS: filePath would be like String filePath= GetPath.APIPropertyFilePath;
     *
     * @param key
     * @param filePath
     * @return
     * @throws Exception
     */
    public static String getValueForApiConfig(String key , String filePath) throws Exception {

           File file = new File(filePath);

            FileInputStream fis = new FileInputStream(file);
            Properties prop = new Properties();
            prop.load(fis);
            System.out.println("returned value for "+key+" is "+prop.getProperty(key));
        return  prop.getProperty(key);
    }


}
