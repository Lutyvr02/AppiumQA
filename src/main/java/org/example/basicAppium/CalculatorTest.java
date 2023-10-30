package org.example.basicAppium;
/*
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;*/

public class CalculatorTest {
   /* AppiumDriver phone;
    @BeforeEach
    public void openApp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        //capabilities debe tener los capabilites, los daros el json ese

        capabilities.setCapability("deviceName","UPB2023 Android8");
        capabilities.setCapability("platformVersion","8.1");
        capabilities.setCapability("appPackage","com.vrproductiveapps.whendo");
        capabilities.setCapability("appActivity","com.vrproductiveapps.whendo.ui.HomeActivity");;
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("automationName","uiautomator2");
        phone = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        phone.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterEach
    public void closeApp(){
        phone.quit();
    }

    @Test
    public void verifyAddTest() throws InterruptedException {
        //click 5 + 7 =  expected result 12 verificar
        phone.findElement(By.id("com.android.calculator2:id/digit_5")).click();
        phone.findElement(By.id("com.android.calculator2:id/op_add")).click();
        phone.findElement(By.id("com.android.calculator2:id/digit_7")).click();
        phone.findElement(By.id("com.android.calculator2:id/eq")).click();
        Thread.sleep(2000);

        String expec = "12";

        String actual = phone.findElement(By.id("com.android.calculator2:id/result")).getText();

        Assertions.assertEquals(expec,actual,"Error");
    }

    @Test
    public void verifyCreateTask() throws InterruptedException {
        String taskName ="UPBExample1";
        //click +
        phone.findElement(By.id("com.vrproductiveapps.whendo:id/fab")).click();
        // set titulo
        phone.findElement(By.id("com.vrproductiveapps.whendo:id/noteTextTitle")).sendKeys(taskName);
        // set notesde
        phone.findElement(By.id("com.vrproductiveapps.whendo:id/noteTextNotes")).sendKeys("this is a note");
        // click save
        phone.findElement(By.id("com.vrproductiveapps.whendo:id/saveItem")).click();
        // verificar que la tarea esta creada
        Assertions.assertTrue( phone.findElements(By.xpath("//android.widget.TextView[@text='"+taskName+"']")).size() >= 1,"ERROR ! no se creo la tarea");


    }*/
}
