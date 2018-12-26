package resource;

import java.util.ResourceBundle;

public class ConfigurationManager {
    public static final ResourceBundle resourceBundle = ResourceBundle.getBundle("config");
    //класс извлекает информацию из файла config.properties
    private ConfigurationManager() {
    }
    public static String getProperty(String key) {
        return resourceBundle.getString(key);
    }
}
