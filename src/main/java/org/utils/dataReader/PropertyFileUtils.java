package org.utils.dataReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtils {
    public String propertyFile(String filePath, String Key) throws IOException {
        FileInputStream fis=new FileInputStream(filePath);
        Properties prop=new Properties();
        prop.load(fis);
        String link= prop.getProperty(Key);
        return link;
    }
}
