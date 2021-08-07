package General;

import org.openqa.selenium.By;

public class Constant {

    //HomePage
    public static final String MAIN_URL = "https://en.wikipedia.org/";
    public static final By HOME_LOGIN_LINK = By.id("pt-login");
    public static final String HOME_LOGIN_URL = "https://en.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=Main+Page";

    //Login
    public static final By LOGIN_USERNAME = By.id("wpName1");
    public static final By LOGIN_PASSWORD = By.id("wpPassword1");
    public static final By LOGIN_BUTTON= By.id("wpLoginAttempt");
    public static final String LOGIN_USERNAME_VALUE = "Nviki1";
    public static final String LOGIN_PASSWORD_VALUE = "Viki1234";
    public static final By LOGIN_USERNAME_COMPARE = By.xpath("//*[@id=\"pt-userpage\"]/a");

}
