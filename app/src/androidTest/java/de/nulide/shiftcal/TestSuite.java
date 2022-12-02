package de.nulide.shiftcal;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

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
        // 1. Click the "menu" icon in the top right corner of the home page.
        // 2. Click "Employers".
        // 3. Click the "add" icon in the bottom right corner.
        // 4. Enter "Sheffield" in the "Name" field.
        // 5. Click the "✓" icon in the bottom right corner.
        // 6. Assert the created employer's name to "Sheffield".
        // 7. Long click "Sheffield" on the "Employers" page.
        // 8. Click "Delete" in the popup window.
        // 9. Use "press back" to return to the home page.
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
        // 9. Click the "add" icon in the bottom right corner.
        // 10. Enter "Weekday" in the "Name" field.
        // 11. Enter "WD" in the "Short Name" field.
        // 12. Click the "Start Time" button, click "9" on the dial then click "OK".
        // 13. Click the "End Time" button, click "17" on the dial then click "OK".
        // 14. Click the "✓" icon in the bottom right corner.
        // 15. Assert the created shift's name to "Weekday".
        // 16. Long click "Weekday" on the "Shifts" page.
        // 17. Click the "Delete" in the popup window.
        // 18. Use "press back" to return to the home page.
        // 19. Click the "menu" icon in the top right corner of the home page.
        // 20. Click "Employers".
        // 21. Long click "Sheffield" on the "Employers" page.
        // 22. Click "Delete" in the popup window.
        // 23. Use "press back" to return to the home page.
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
        // 9. Click the "add" icon in the bottom right corner.
        // 10. Enter "Weekday" in the "Name" field.
        // 11. Enter "WD" in the "Short Name" field.
        // 12. Click the "Start Time" button, click "9" on the dial then click "OK".
        // 13. Click the "End Time" button, click "17" on the dial then click "OK".
        // 14. Click the "✓" icon in the bottom right corner.
        // 15. Use "press back" to return to the home page.
        // 16. Click the "edit" icon on the bottom right corner.
        // 17. Click the "S" icon above the "edit" icon.
        // 18. Click "Weekday".
        // 19. Click date "10" in the calendar.
        // 20. Click the "✓" icon in the bottom right corner.
        // 21. Launch the "Calendar" application.
        // 22. Click the "WD - Weekday" Calendar event.
        // 23. Assert the event name to "WD - Weekday".
        // 24. Assert the event date to "Saturday, December 10".
        // 25. Click the "⋮" button in the top right corner of the Calendar event.
        // 26. Click "Delete" in the popup menu.
        // 27. Click "DELETE" in the dialog.
        // 28. Launch the "ShiftCal" application.
        // 29. Click the "edit" icon on the bottom right corner.
        // 30. Click the "S" icon above the "edit" icon.
        // 31. Click "Delete".
        // 32. Click date "10" in the calendar.
        // 33. Click the "✓" icon in the bottom right corner.
        // 34. Click the "menu" icon in the top right corner of the home page.
        // 35. Click "Shifts".
        // 36. Long click "Weekday" on the "Shifts" page.
        // 37. Click the "Delete" in the popup window.
        // 38. Use "press back" to return to the home page.
        // 39. Click the "menu" icon in the top right corner of the home page.
        // 40. Click "Employers".
        // 41. Long click "Sheffield" on the "Employers" page.
        // 42. Click "Delete" in the popup window.
        // 43. Use "press back" to return to the home page.
    }
}
