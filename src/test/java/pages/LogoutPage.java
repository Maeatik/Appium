package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LogoutPage {
    AndroidDriver driver;
    WebDriverWait waiter;
    public LogoutPage(AndroidDriver driver, WebDriverWait waiter){
        this.driver = driver;
        this.waiter = waiter;
    }

    public void waitBackBtn(){
        waiter.until( ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageButton[@content-desc=\"Закрыть экран\"]")));
    }

    public void clickBack(){
        MobileElement el15 = (MobileElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Закрыть экран\"]");
        el15.click();
    }

    public void waitLook(){
        waiter.until( ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Внешний вид']")));
    }

    public void waitLogout(){
        waiter.until( ExpectedConditions.visibilityOfElementLocated(By.id("com.vkontakte.android:id/logout")));
    }
    public void clickLogout(){
        MobileElement el18 = (MobileElement) driver.findElementById("com.vkontakte.android:id/logout");
        el18.click();
    }

    public void waitAccept(){
        waiter.until( ExpectedConditions.visibilityOfElementLocated(By.id("android:id/button1")));
    }
    public void clickAccept(){
        MobileElement el19 = (MobileElement) driver.findElementById("android:id/button1");
        el19.click();
    }



}
