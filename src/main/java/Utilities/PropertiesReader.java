package Utilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {
    Properties properties;

    public PropertiesReader() {
        properties = new Properties();
        InputStream stream = getClass().getClassLoader().getResourceAsStream("config.properties");
        try {
            properties.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Boolean runHeadless(){return Boolean.parseBoolean(properties.getProperty("runHeadless"));}

    public String getUserName(){return properties.getProperty("userName");}

    public String getPassword(){return properties.getProperty("password");}

    public String getURL(){return properties.getProperty("url");}

    public String getCheckOutFirstName(){return properties.getProperty("checkOutFirstName");};

    public String getCheckOutLastName(){return properties.getProperty("checkOutLastName");};

    public String getCheckOutPostalCode(){return properties.getProperty("checkOutPostalCode");};


}

