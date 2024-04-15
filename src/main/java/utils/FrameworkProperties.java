package utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FrameworkProperties {
    public String getProperty(String key) throws IOException {
        String prop;
        try {
            Properties properties = new Properties();
            String propertyFileName = Constants.PROPS_FILE_NAME;
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propertyFileName);

            if (inputStream != null)
                properties.load(inputStream);
            else
                throw new FileNotFoundException("Properties file not found");
            prop = properties.getProperty(key);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return prop;
    }

}
