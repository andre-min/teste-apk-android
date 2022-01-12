package utils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    private  static AndroidDriver<MobileElement> driver;

    public  static AndroidDriver<MobileElement> getDriver (){
        if (driver == null) {
            createDriver();

        }

        return driver;


    }
    public static void createDriver() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "emulador 5554");
        desiredCapabilities.setCapability("platformVersion", "Android 8.1.0");
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        desiredCapabilities.setCapability("appPackage", "br.com.alura.agenda");
        desiredCapabilities.setCapability("appActivity", "br.com.alura.agenda.ui.activity.ListaAlunosActivity");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "/Users/quartohokage/.jenkins/workspace/teste-pipeline/app/build/outputs/apk/debug/app-debug.apk");
//        desiredCapabilities.setCapability("noReset", "true");
//        desiredCapabilities.setCapability("fullReset", "false");
//        desiredCapabilities.setCapability("noSign", "true");
//        desiredCapabilities.setCapability(MobileCapabilityType.APP, "\\Users\\Andre\\Documents\\VitalPrime.apk");



        try {
            driver = new  AndroidDriver<>(new URL("http://localhost:4724/wd/hub"),desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
    }

    public static void killDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }

}


