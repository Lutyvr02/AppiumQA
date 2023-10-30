package testSuite;

import activities.calculator.MainCalculator;

import activities.calendar.MainCalendar;
import activities.calendar.TextForEvent;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

public class CalculatorTest {
    MainCalendar mainCalendar = new MainCalendar();
    TextForEvent textForEvent = new TextForEvent();
    @Test
    public void verifyAddCalculator() {
        mainCalendar.trial.click();
        mainCalendar.add31oct.click();
        mainCalendar.addTask.click();
        mainCalendar.addEvent.click();

        textForEvent.trial.setText("Buenas Tardes");
        textForEvent.place.setText("En mi casa");
        textForEvent.desc.setText("Buena descripcion");
        textForEvent.confir.click();
        textForEvent.confir2.click();

        Assertions.assertEquals("October", textForEvent.asser.getText(),
                "ERROR la suma es incorrecta");
    }

    @AfterEach
    public void closeApp() {
        Session.getSession().closeApp();
    }
}
