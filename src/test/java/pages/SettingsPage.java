package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SettingsPage
{
    AndroidDriver driver;
    WebDriverWait waiter;

    public SettingsPage(AndroidDriver driver, WebDriverWait waiter){
        this.driver = driver;
        this.waiter = waiter;
    }

    public void waitRightField(){
        waiter.until( ExpectedConditions.visibilityOfElementLocated(By.id("com.vkontakte.android:id/right_menu_main_action")));
    }

    public void clickRightField(){
        MobileElement el7 = (MobileElement) driver.findElementById("com.vkontakte.android:id/right_menu_main_action");
        el7.click();
    }

    public void waitSettings(){
        waiter.until( ExpectedConditions.visibilityOfElementLocated(By.id("com.vkontakte.android:id/menu_settings")));
    }

    public void clickSettings(){
        MobileElement el11 = (MobileElement) driver.findElementById("com.vkontakte.android:id/menu_settings");
        el11.click();
    }

    public void waitLook(){
        waiter.until( ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Внешний вид']")));
    }

    public void clickLook(){
       MobileElement el12 = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Внешний вид']");
       // MobileElement el12 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[7]");
        el12.click();
    }

    public void waitDarkTheme(){
        waiter.until( ExpectedConditions.visibilityOfElementLocated(By.id("com.vkontakte.android:id/dark_theme_btn")));
    }

    public void clickDarkTheme(){
        MobileElement el13 = (MobileElement) driver.findElementById("com.vkontakte.android:id/dark_theme_btn");
        el13.click();
    }
    public void waitLightTheme(){
        waiter.until( ExpectedConditions.visibilityOfElementLocated(By.id("com.vkontakte.android:id/light_theme_btn")));
    }

    public void clickLightTheme(){
        MobileElement el14 = (MobileElement) driver.findElementById("com.vkontakte.android:id/light_theme_btn");
        el14.click();
    }

}
