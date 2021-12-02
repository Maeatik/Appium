import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class FunctionalityTest {

    public static void main(String[] args) throws MalformedURLException {



        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S8");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");

        cap.setCapability("appPackage","com.vkontakte.android");
        cap.setCapability("appActivity","com.vkontakte.android.MainActivity");

        AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
        TouchAction touchAction = new TouchAction(driver);
        WebDriverWait waiter = new WebDriverWait(driver, 5000);


//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//
//
//        MobileElement el7 = (MobileElement) driver.findElementById("com.vkontakte.android:id/counter");
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        el7.click();
//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        touchAction.press(new PointOption().withCoordinates(503, 1790));
//        touchAction.waitAction(WaitOptions.waitOptions(Duration.ofMillis(200)));
//        touchAction.moveTo(new PointOption().withCoordinates (512, 344));
//        touchAction.release();
//        touchAction.perform();
//
//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        MobileElement el8 = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Главная']");
//        el8.click();
//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        touchAction.press(new PointOption().withCoordinates ( 422,  1500));
//        touchAction.waitAction(WaitOptions.waitOptions(Duration.ofMillis(200)));
//        touchAction.moveTo(new PointOption().withCoordinates ( 422, 509));
//        touchAction.release();
//        touchAction.perform();
//
//
//        touchAction.press(new PointOption().withCoordinates ( 457,  1745));
//        touchAction.waitAction(WaitOptions.waitOptions(Duration.ofMillis(200)));
//        touchAction.moveTo(new PointOption().withCoordinates (587, 464));
//        touchAction.release();
//        touchAction.perform();
//
//        MobileElement el9 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Профиль\"]/android.widget.ImageView");
//        el9.click();

        MobileElement el10 = (MobileElement) driver.findElementById("com.vkontakte.android:id/right_menu_main_action");
        el10.click();

        MobileElement el11 = (MobileElement) driver.findElementById("com.vkontakte.android:id/menu_settings");
        el11.click();


        MobileElement el12 = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Внешний вид']");
        el12.click();

        MobileElement el13 = (MobileElement) driver.findElementById("com.vkontakte.android:id/dark_theme_btn");
        el13.click();

        MobileElement el14 = (MobileElement) driver.findElementById("com.vkontakte.android:id/light_theme_btn");
        el14.click();

        MobileElement el15 = (MobileElement) driver.findElementByAccessibilityId("Закрыть экран");
        el15.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        touchAction.press(new PointOption().withCoordinates (500,1200));
        touchAction.waitAction(WaitOptions.waitOptions(Duration.ofMillis(200)));
        touchAction.moveTo(new PointOption().withCoordinates (500, 512));
        touchAction.release();
        touchAction.perform();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        MobileElement el18 = (MobileElement) driver.findElementById("com.vkontakte.android:id/logout");
        el18.click();

        MobileElement el19 = (MobileElement) driver.findElementById("android:id/button1");
        el19.click();


    }
}
