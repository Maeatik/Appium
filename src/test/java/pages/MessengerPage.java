package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MessengerPage
{

    AndroidDriver driver;
    WebDriverWait waiter;
    public MessengerPage(AndroidDriver driver,  WebDriverWait waiter)
    {
        this.driver = driver;
        this.waiter = waiter;
    }
    public void waitLowerField(){
        waiter.until( ExpectedConditions.visibilityOfElementLocated(By.id("com.vkontakte.android:id/counter")));
    }

    public void clickMessenger(){
        MobileElement el7 = (MobileElement) driver.findElementById("com.vkontakte.android:id/counter");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        el7.click();
    }

    public void waitMessage(){
        waiter.until( ExpectedConditions.visibilityOfElementLocated(By.id("com.vkontakte.android:id/dialogs_list")));
    }
    public void waitNews(){
        waiter.until( ExpectedConditions.visibilityOfElementLocated(By.id("com.vkontakte.android:id/list")));
    }

    public void clickNews(){
        MobileElement el8 = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Главная']");
        el8.click();
    }

    public void clickProfile(){
        MobileElement el9 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Профиль\"]/android.widget.ImageView");
        el9.click();
    }

}
