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

    //Registration
    public static final By REG_CREATE_ACC_LINK = By.id("pt-createaccount");
    public static final By REG_NAME = By.id("wpName2");
    public static final By REG_PW1 = By.id("wpPassword2");
    public static final By REG_PW2 = By.id("wpRetype");
    public static final By REG_EMAIL = By.id("wpEmail");
    public static final By REG_CREATE_ACC_BUTTON = By.xpath("//*[@id=\"wpCreateaccount\"]");
    public static final String REG_USERNAME_VALUE = "Nviki123";
    public static final String REG_PW_VALUE = "ILoveSelenium!";
    public static final String REG_EMAIL_VALUE = "naszviki.mt@gmail.com";
    public static final String REG_LANDING_URL = "https://en.wikipedia.org/w/index.php?title=Main_Page&gettingStartedReturn=true";

    //PrivacyPolicy
    public static final By PP_LINK = By.id("footer-places-privacy");
    public static final String PP_LANDING_LINK = "https://foundation.wikimedia.org/wiki/Privacy_policy";

    //MainPageHistory
    public static final By MPH_lINK = By.id("ca-history");

    //Language
    public static final By LANG_PREF_lINK = By.id("pt-preferences");
    public static final By LANG_DROPDOWN = By.xpath("//*[@id=\"ooui-php-29\"]");
    public static final By LANG_SUBMIT_BUTTON = By.xpath("//*[@id=\"prefcontrol\"]/button");
    public static final String LANG_VALUE = "hu";

}
