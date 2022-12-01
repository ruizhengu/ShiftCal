package de.nulide.shiftcal;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TestSuite {

    @Rule
    public ActivityScenarioRule<CalendarActivity> activityScenarioRule = new ActivityScenarioRule<>(CalendarActivity.class);

    /** Before the development:
     * Turn on the "Sync" functionality in Settings.
     * 1. Click the "menu" icon in the top right corner of the home page.
     * 2. Click "Settings".
     * 3. Click "Sync".
     * 4. Turn on the switch to enable sync functionality.
     * */

    @Test
    public void createEmployer() {
        // 1. Click the "menu" icon in the top right corner of the home page.
        // 2. Click "Employers".
        // 3. Click the "add" icon in the bottom right corner.
        // 4. Enter "Sheffield" in the "Name" field.
        // 5. Click the "✓" icon in the bottom right corner.
        // 6. Long click "Sheffield" on the "Employers" page.
        // 7. Click "Delete" in the popup window.
        // 8. Use "press back" to return to the home page.
    }

    @Test
    public void createShifts() {
        // 1. Click the "menu" icon in the top right corner of the home page.
        // 2. Click "Employers".
        // 3. Click the "add" icon in the bottom right corner.
        // 4. Enter "Sheffield" in the "Name" field.
        // 5. Click the "✓" icon in the bottom right corner.
        // 6. Use "press back" to return to the home page.
        // 7. Click the "menu" icon in the top right corner of the home page.
        // 8. Click "Shifts".
        // 8. Click the "add" icon in the bottom right corner.
        // 9. Enter "Weekday" in the "Name" field.
        // 10. Enter "WD" in the "Short Name" field.
        // 11. Click the "Start Time" button, click "9" on the dial then click "OK".
        // 12. Click the "End Time" button, click "17" on the dial then click "OK".
        // 13. Click the "✓" icon in the bottom right corner.
        // 14. Long click "Weekday" on the "Shifts" page.
        // 15. Click the "Delete" in the popup window.
        // 16. Use "press back" to return to the home page.
        // 17. Click the "menu" icon in the top right corner of the home page.
        // 18. Click "Employers".
        // 19. Long click "Sheffield" on the "Employers" page.
        // 20. Click "Delete" in the popup window.
        // 21. Use "press back" to return to the home page.
    }

    @Test
    public void setShifts() {
        // 1. Click the "menu" icon in the top right corner of the home page.
        // 2. Click "Employers".
        // 3. Click the "add" icon in the bottom right corner.
        // 4. Enter "Sheffield" in the "Name" field.
        // 5. Click the "✓" icon in the bottom right corner.
        // 6. Use "press back" to return to the home page.
        // 7. Click the "menu" icon in the top right corner of the home page.
        // 8. Click "Shifts".
        // 8. Click the "add" icon in the bottom right corner.
        // 9. Enter "Weekday" in the "Name" field.
        // 10. Enter "WD" in the "Short Name" field.
        // 11. Click the "Start Time" button, click "9" on the dial then click "OK".
        // 12. Click the "End Time" button, click "17" on the dial then click "OK".
        // 13. Click the "✓" icon in the bottom right corner.
        // 14. Use "press back" to return to the home page.
        // 15. Click the "edit" icon on the bottom right corner.
        // 16. Click the "S" icon above the "edit" icon.
        // 17. Click "Weekday".
        // 18. Click date "10" in the calendar.
        // 19. Click the "✓" icon in the bottom right corner.
        // 20. Launch the "Calendar" application.
        // 21. Assert that the 10th of this month has the "Weekday" event.
        // 22. Launch the "ShiftCal" application.
        // 23. Click the "edit" icon on the bottom right corner.
        // 24. Click the "S" icon above the "edit" icon.
        // 25. Click "Delete".
        // 26. Click date "10" in the calendar.
        // 27. Click the "✓" icon in the bottom right corner.
        // 28. Click the "menu" icon in the top right corner on the home page.
        // 29. Click "Shifts".
        // 30. Long click "Weekday" on the "Shifts" page.
        // 31. Click the "Delete" in the popup window.
        // 32. Use "press back" to return to the home page.
        // 33. Click the "menu" icon in the top right corner of the home page.
        // 34. Click "Employers".
        // 35. Long click "Sheffield" on the "Employers" page.
        // 36. Click "Delete" in the popup window.
        // 37. Use "press back" to return to the home page.
    }
}
