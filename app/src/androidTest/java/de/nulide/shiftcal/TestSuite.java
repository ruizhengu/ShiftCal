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
     * The application is a calendar for managing your employers and shifts.
     */

    @Test
    public void createEmployer() {
        // 1. Click the menu icon in the top-right corner.
        // 2. Click "Employers".
        // 3. Click the + icon on the bottom-right corner.
        // 4. Enter "Sheffield" in the Name field (then press enter on the keyboard).
        // 5. Click the ✓ icon.
        // 6. Long click "Sheffield".
        // 7. Click "Delete".
        // 8. Press back to return to the homepage.
    }

    @Test
    public void createShifts() {
        // 1. Create Employer "Sheffield" (steps 1 - 5 in test case createEmployer).
        // 2. Press back to return to the homepage.
        // 3. Click the menu icon in the top-right corner.
        // 4. Click "Shifts".
        // 5. Click the + icon on the bottom-right corner.
        // 6. Enter "Weekday" in the Name field (then press enter on the keyboard).
        // 7. Enter "WD" in the Short Name field (then press enter on the keyboard).
        // 8. Click the button of Start Time, click 9 then click OK.
        // 9. Click the button of End Time, click 17 then click OK.
        // 10. Click the ✓ icon.
        // 11. Long click "Weekday".
        // 12. Click "Delete".
        // 13. Press back to return to the homepage.
        // 14. Go to the Employers page (steps 1 - 2 in test case createEmployer).
        // 15. Delete Employer "Sheffield" then return to the homepage (steps 6 - 8 in test case createEmployer)
    }

    @Test
    public void setShifts() {
        // 1. Create Employer "Sheffield" and Shift "Weekday" (steps 1 - 10 in test case createShifts).
        // 2. Press back to return to the homepage.
        // 3. Click the Edit icon in the bottom-right corner of the homepage.
        // 4. Click the S icon.
        // 5. Click "Weekday".
        // 6. Click date 30 of January 2023.
        // 7. Click the ✓ icon.
        // 8. Click the Edit icon in the bottom-right corner of the homepage.
        // 9. Click the WD icon.
        // 10. Click "Delete".
        // 11. Click date 30 of January 2023.
        // 12. Click the ✓ icon.
        // 13. Go to the Shifts page (steps 3 - 4 in test case createShifts).
        // 14. Delete Shift "Weekday" and Employer "Sheffield" then return to the homepage (steps 11 - 15 in test case createShifts).
    }
}
