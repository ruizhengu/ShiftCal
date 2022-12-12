package de.nulide.shiftcal;

import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.uiautomator.UiDevice;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TestSuite {

    @Rule
    public ActivityScenarioRule<CalendarActivity> activityScenarioRule = new ActivityScenarioRule<>(CalendarActivity.class);

    /**
     * Before the development:
     * Please make sure the emulator is connected to the Internet.
     * Please login your Google account on the emulator to make sure you can access the Calendar app.
     * Turn on the "Sync" functionality in Settings:
     * 1. Click the "menu" icon in the top right corner of the home page.
     * 2. Click "Settings".
     * 3. Click "Sync".
     * 4. Turn on the switch to enable sync functionality.
     */

    @Test
    public void createEmployer() {
        /*
        Description: Create a new Employer with the Name "Sheffield". Delete the created Employer.

        Assertion:  None.
        */
    }

    @Test
    public void createShifts() {
        /*
        Description: Create a new Employer with the Name "Sheffield".
                     Create a new Shift with the Name "Weekday", Short Name "WD", Start Time "09:00", End Time "17:00".
                     Delete the created Shift. Delete the created Employer.

        Assertion: None.
        */
    }

    @Test
    public void setShifts() {
        /*
        Description: Create a new Employer with the Name "Sheffield".
                     Create a new Shift with the Name "Weekday", Short Name "WD", Start Time "09:00", End Time "17:00".
                     Set the Shift on 20th December 2022. Launch the Calendar application and open the created event.
                     Go back to ShiftCal, delete the Shift on 20th December 2022.
                     Delete the created Shift. Delete the created Employer.

        Assertion: Assert the date and time of the Calendar event as 9:00 - 17:00, 20th December.
    }
}
