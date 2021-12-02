package pages;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.time.Duration;

public class Swiper
{
    TouchAction touchAction;

    public Swiper(TouchAction touchAction){
        this.touchAction = touchAction;
    }

    public void swipe(){
        touchAction.press(new PointOption().withCoordinates ( 422,  1500));
        touchAction.waitAction(WaitOptions.waitOptions(Duration.ofMillis(200)));
        touchAction.moveTo(new PointOption().withCoordinates ( 422, 509));
        touchAction.release();
        touchAction.perform();
    }

    public void swipeHorizontal(){

        touchAction.press(new PointOption().withCoordinates (1063,  996));
        touchAction.waitAction(WaitOptions.waitOptions(Duration.ofMillis(200)));
        touchAction.moveTo(new PointOption().withCoordinates (0, 996));
        touchAction.release();
        touchAction.perform() ;
    }

    public void tapToLook(){
        touchAction.tap(new PointOption().withCoordinates (384, 1194));
        touchAction.perform();
    }



}
