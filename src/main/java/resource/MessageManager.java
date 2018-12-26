package resource;

import java.util.ResourceBundle;

public class MessageManager {
    private static final ResourceBundle resourceBundle = ResourceBundle.getBundle("messages");
    //Класс извлекает информацию из messages.properties
    private MessageManager() {
    }
    public static String getProperty(String key) {
        return resourceBundle.getString(key);
    }
}
