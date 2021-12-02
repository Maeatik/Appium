import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class StartTest {


    public static AndroidDriver driver = null;
    public static TouchAction touchAction = null;
    public static WebDriverWait waiter = null;
    public static LoginPage loginPage;
    public static MessengerPage messengerPage;
    public static SettingsPage settingsPage;
    public static LogoutPage logoutPage;
    public static Swiper swiper;
    @BeforeClass
    public static void setUp()
    {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S8");

        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");

        cap.setCapability("appPackage","com.vkontakte.android");
        cap.setCapability("appActivity","com.vkontakte.android.MainActivity");


        try {
            driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (MalformedURLException e){
            e.printStackTrace();
        }
         touchAction = new TouchAction(driver);
         waiter = new WebDriverWait(driver, 5000);

        loginPage = new LoginPage(driver, waiter);
        messengerPage = new MessengerPage(driver, waiter);
        settingsPage = new SettingsPage(driver, waiter);
        logoutPage = new LogoutPage(driver, waiter);
        swiper = new Swiper(touchAction);
    }

    @Test
    public void messageTest(){
        loginPage.pressLoginButton();
        loginPage.waitInsertsFields();
        loginPage.insertUserName();
        loginPage.insertPassword();
        loginPage.pressOk();
        messengerPage.waitLowerField();
        messengerPage.clickMessenger();
        messengerPage.waitMessage();
        swiper.swipe();
        messengerPage.clickNews();
        messengerPage.waitNews();
        swiper.swipe();
        swiper.swipe();
        messengerPage.clickProfile();
    }

    @Test
    public void settingTest(){
        loginPage.pressLoginButton();
        loginPage.waitInsertsFields();
        loginPage.insertUserName();
        loginPage.insertPassword();
        loginPage.pressOk();
        messengerPage.waitLowerField();
        messengerPage.clickProfile();
        settingsPage.waitRightField();
        settingsPage.clickRightField();
        settingsPage.waitSettings();
        settingsPage.clickSettings();
        settingsPage.waitLook();
        settingsPage.clickLook();
        settingsPage.waitDarkTheme();
        settingsPage.clickDarkTheme();
        settingsPage.waitLightTheme();
        settingsPage.clickLightTheme();
    }

    @Test
    public void logoutTest(){
        loginPage.pressLoginButton();
        loginPage.waitInsertsFields();
        loginPage.insertUserName();
        loginPage.insertPassword();
        loginPage.pressOk();
        messengerPage.waitLowerField();
        messengerPage.clickProfile();
        settingsPage.waitRightField();
        settingsPage.clickRightField();
        settingsPage.waitSettings();
        settingsPage.clickSettings();
        swiper.swipe();
        logoutPage.waitLogout();
        logoutPage.clickLogout();
        logoutPage.waitAccept();
        logoutPage.clickAccept();
    }




}
