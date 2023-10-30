package activities.calendar;

import control.Button;
import control.Label;
import org.openqa.selenium.By;
    public class MainCalendar {
    //evento en el calendario

    public Button trial = new Button(By.id("com.simplemobiletools.calendar:id/dialog_trial_start_free_trial"));

    public Button add31oct = new Button(By.xpath("//android.view.View[@index='38']"));

    public Button addTask = new Button(By.id("com.simplemobiletools.calendar:id/calendar_fab"));

    public Button addEvent = new Button(By.id("com.simplemobiletools.calendar:id/calendar_fab"));

    //xpath: //android.widget.ImageButton[@content-desc="New Event"]

}
