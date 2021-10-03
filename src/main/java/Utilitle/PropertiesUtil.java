package Utilitle;

import enums.filePath;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class PropertiesUtil {
    public Properties deviceDetails = null;
    {
    if(deviceDetails==null){
        deviceDetails = loadFile(filePath.DEVICE_File.getData());
    }
    }

    public String getDeviceDetail(String key){
         return deviceDetails.getProperty(key);
    }


    public Properties loadFile(String filepath){
        Properties properties=null;
        try{
            properties=new Properties();
            properties.load(new FileReader(new File(filepath)));
        }catch (Exception e){
            properties.clear();
            e.getStackTrace();
        }
        return properties;
    }
}
