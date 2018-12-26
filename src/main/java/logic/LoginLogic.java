package logic;

public class LoginLogic {
    private final static String ADMIN_LOGIN = "admin";
    public static final String ADMIN_PASSWORD = "Qwe123";
    public static boolean checkLogin(String enterLogin, String enterPass) {
        return ADMIN_LOGIN.equalsIgnoreCase(enterLogin) && ADMIN_PASSWORD.equals(enterPass);
    }
}
