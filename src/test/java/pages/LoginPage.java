package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginPage
{
    AndroidDriver driver;
    WebDriverWait waiter;
    public LoginPage(AndroidDriver driver,  WebDriverWait waiter)
    {
        this.driver = driver;
        this.waiter = waiter;
    }
    public void pressLoginButton(){
        MobileElement el2 = (MobileElement) driver.findElementById("com.vkontakte.android:id/login_button");
        el2.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void waitInsertsFields(){
        waiter.until( ExpectedConditions.visibilityOfElementLocated(By.id("com.vkontakte.android:id/email_or_phone")));

    }
    public void insertUserName(){
        MobileElement el4 = (MobileElement) driver.findElementById("com.vkontakte.android:id/email_or_phone");
        el4.click();
        //тут логин
        el4.sendKeys("89274251881");
    }

    public void insertPassword(){
        MobileElement el5 = (MobileElement) driver.findElementById("com.vkontakte.android:id/vk_password");
        el5.click();
        //тут пароль el5.sendKeys(...);
        el5.sendKeys("kazan117");
    }

    public void pressOk(){
        MobileElement el6 = (MobileElement) driver.findElementById("com.vkontakte.android:id/continue_btn");
        el6.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
}
