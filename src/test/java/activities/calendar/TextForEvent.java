package activities.calendar;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;
public class TextForEvent {

    public TextBox trial = new TextBox(By.id("com.simplemobiletools.calendar:id/event_title"));
    public TextBox place = new TextBox(By.id("com.simplemobiletools.calendar:id/event_location"));
    public TextBox desc = new TextBox(By.id("com.simplemobiletools.calendar:id/event_description"));
    public Button confir = new Button(By.id("com.simplemobiletools.calendar:id/save"));
    public Button confir2 = new Button(By.id("android:id/button1"));
    public Label asser = new Label(By.xpath("//android.widget.TextView[@content-desc='October']"));

}

//trial text
//place trxt
//desc text
//confir butt
//confit2 butt
//asser label
