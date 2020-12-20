package JsonUtils;

import Utils.GetPath;

import java.nio.file.Files;
import java.nio.file.Paths;


public class JsonUtility {

    public  String readJsonAndConvertIntoString(String fileName) throws Exception {
        String file =  GetPath.JsonFilePath + fileName;
        return   new String(Files.readAllBytes(Paths.get(file)));

    }
}
